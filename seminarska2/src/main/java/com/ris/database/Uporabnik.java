/***********************************************************************
 * Module:  Uporabnik.java
 * Author:  Urban
 * Purpose: Defines the Class Uporabnik
 ***********************************************************************/

package com.ris.database;

import org.springframework.beans.factory.annotation.Autowired;

/** @pdOid 3388cbb4-99b9-43ea-8d38-6874ebd82d66 */
public abstract class Uporabnik {

    @Autowired
    private Database b;

   /** @pdOid 1a0aaf99-7ecd-4745-826b-f47f4cfccc36 */
   private String ime;
   /** @pdOid fd089af1-6664-4090-a14d-74ef7bdc3c8c */
   private String email;
   /** @pdOid 0f5a3b74-0dff-4457-a06d-fc4ae1d18ab3 */
   private String geslo;
   
   /** @pdOid 9097edb7-7a24-4ef0-9738-dc394b77e869 */
   public void oglejSporocila() {
      // TODO: implement
   }
   
   /** @pdOid 2102c8fe-0b71-4f8d-97f2-c2f0f2511527 */
   public boolean posljiSporocilo() {
      // TODO: implement
      return false;
   }
   
   public String getIme () {
       return null;
   }
   
   public String getEmail () {
       return null;
   }
   
   public void prejmiSporocilo (Sporocilo s) {}
   
   public boolean jeIdenticen (Uporabnik u) {
       if (!this.getIme().equals(u.getIme())) return false;
       return this.getEmail().equals(u.getEmail());
   }
   
   public void prodajOpremo (String oprema, float cena) {
       ProdajaOpreme po = new ProdajaOpreme(this, oprema, cena);
   }
   
   
   public String preglejProdajoOpreme () {
       String out = "";
       
       for (ProdajaOpreme p : b.getProdajaOpremes()) {
           out += String.format("%n%s prodaja %s za %.2f evrov.",
                   p.getProdajalec().getIme(), p.getOprema(), p.getCena());
       }
       
       return out;
   }

}