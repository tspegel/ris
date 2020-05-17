/***********************************************************************
 * Module:  ZmGlasbenik.java
 * Author:  Urban
 * Purpose: Defines the Class ZmGlasbenik
 ***********************************************************************/

package com.ris.database;

import java.util.ArrayList;
import java.util.HashSet;

/** @pdOid fc74d4eb-fa6e-48d6-8b62-4d8ade0c61f1 */
public class ZmGlasbenik extends Uporabnik {
    
    public HashSet<Vabilo> vabila;
    public HashSet<Prosnja> prosnje;
    public ArrayList<Sporocilo> sporocila;
    public HashSet<ProdajaOpreme> prodajaOpreme;
    public HashSet<ZmBend> clanstva;
    public HashSet<ZmGlasbenik> prijatelji;
    
    private String ime;
    private String email;
    private String geslo;
    
    private Database b = new Database();
    
    ZmGlasbenik (String ime, String email, String geslo) {
        this.ime = ime;
        this.email = email;
        this.geslo = geslo;
        
        vabila = new HashSet<>();
        prosnje = new HashSet<>();
        sporocila = new ArrayList<>();
        prodajaOpreme = new HashSet<>();
        clanstva = new HashSet<>();
        prijatelji = new HashSet<>();
        
        b.getZmGlasbenik().add(this);
    }
    
    
   /** @pdOid ad3ced9c-1d87-498a-990d-3ed097fed2e1 */
   public boolean oddajProsnjo(String ime) {
      // poi�?i bend z imenom
      for (ZmBend bend : b.getZmBend()) {
          if (bend.getIme().equals(ime)) {
              Prosnja p = new Prosnja(this, bend);
              bend.prosnje.add(p);
              return true;
          }
      }
      return false;
   }
   
   /** @pdOid a720abcf-4b07-4cab-9042-e2c8485598d0 */
   public boolean sprejmiVabilo(String ime) {
      // poi�?i bend z imenom
      for (Vabilo vabilo : this.vabila) {
          if (vabilo.bend.getIme().equals(ime)) {
              this.vabila.remove(vabilo);
              this.clanstva.add(vabilo.bend);
              vabilo.bend.clani.add(this);
              return true;
          }
      }
      return false;
   }
   
   /** @pdOid 11e81cd2-e844-4f84-8855-4b607bd3143e */
   public String[] oglejClanstva() {
      // vrni clanstva
      String[] out = new String[clanstva.size()];
      Object[] objects = clanstva.toArray();
      for (int i = 0; i < clanstva.size(); i++) {
          out[i] = ((ZmBend) objects[i]).getIme();
      }
      return out;
   }
   
    @Override
   public String getIme () {
       return this.ime;
   }
   
    @Override
   public String getEmail () {
       return this.email;
   }
   
   public void dodajPrijatelja (ZmGlasbenik glasbenik) {
       this.prijatelji.add(glasbenik);
       glasbenik.prijatelji.add(this);
   }
   
    @Override
   public void prejmiSporocilo (Sporocilo s) {
       this.sporocila.add(s);
   }
   
   

}