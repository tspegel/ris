/***********************************************************************
 * Module:  ZmBend.java
 * Author:  Urban
 * Purpose: Defines the Class ZmBend
 ***********************************************************************/

package com.ris.database;

import java.util.ArrayList;
import java.util.HashSet;
import javax.xml.crypto.Data;

/** @pdOid 8235a4ab-eb68-495f-9dc9-80a0a5a3c6d1 */
public class ZmBend extends Uporabnik {
    
    public HashSet<Vabilo> vabila;
    public HashSet<Prosnja> prosnje;
    public ArrayList<Sporocilo> sporocila;
    public HashSet<ProdajaOpreme> prodajaOpreme;
    public HashSet<ProdajaArtikla> prodajaArtiklov;
    public HashSet<ZmGlasbenik> clani;
    
    private String ime;
    private String email;
    private String geslo;
    
    private Database b = new Database();
    
    ZmBend (String ime, String email, String geslo) {
        this.ime = ime;
        this.email = email;
        this.geslo = geslo;
        
        vabila = new HashSet<>();
        prosnje = new HashSet<>();
        sporocila = new ArrayList<>();
        prodajaOpreme = new HashSet<>();
        prodajaArtiklov = new HashSet<>();
        clani = new HashSet<>();
        
        b.getZmBend().add(this);
    }
    
    
   /** @pdOid f084563e-8f63-40f3-9e64-6db8f9aa6ad5 */
   public boolean sprejmiProsnjo(String ime) {
      // poisci glasbenika z imenom
      for (Prosnja prosnja : this.prosnje) {
          if (prosnja.glasbenik.getIme().equals(ime)) {
              this.prosnje.remove(prosnja);
              this.clani.add(prosnja.glasbenik);
              prosnja.glasbenik.clanstva.add(this);
              return true;
          }
      }
      return false;
   }
   
   /** @pdOid b76d7011-e656-41ad-9284-658a7dac1c2f */
   public boolean oddajVabilo(String ime) {
      // poi�?i glasbenika z imenom
      for (ZmGlasbenik glasbenik : b.getZmGlasbenik()) {
          if (glasbenik.getIme().equals(ime)) {
              Vabilo v = new Vabilo(glasbenik, this);
              glasbenik.vabila.add(v);
              return true;
          }
      }
      return false;
   }
   
   /** @pdOid 0768b8eb-3ef3-46ba-aa55-b82b54a7399a */
   public String[] oglejClane() {
      // vrni clanstva
      String[] out = new String[clani.size()];
      Object[] objects = clani.toArray();
      for (int i = 0; i < clani.size(); i++) {
          out[i] = (String) objects[i];
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

   
   @Override
   public void prejmiSporocilo (Sporocilo s) {
       this.sporocila.add(s);
   }

}