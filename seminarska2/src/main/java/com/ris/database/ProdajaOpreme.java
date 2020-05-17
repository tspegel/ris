/***********************************************************************
 * Module:  ProdajaOpreme.java
 * Author:  Urban
 * Purpose: Defines the Class ProdajaOpreme
 ***********************************************************************/

package com.ris.database;

import javax.xml.crypto.Data;
import org.springframework.beans.factory.annotation.Autowired;

/** @pdOid ee8b85ef-4ebf-4dba-aaa0-c9bdbbf671ad */
public class ProdajaOpreme {
   /** @pdOid 454aeea9-bc4a-4365-b6fb-2566fe11265e */
   private String oprema;
   /** @pdOid f3150bae-ab02-434a-8b9a-200d2c03f9b7 */
   private float cena;
   
   private Uporabnik prodajalec;
   
   @Autowired
   private Database b;
   
   public ProdajaOpreme (Uporabnik uporabnik, String oprema, float cena) {
       this.prodajalec = uporabnik;
       this.oprema = oprema;
       this.cena = cena;
       
       b.getProdajaOpremes().add(this);
   }
   
   /** @pdOid 0209f0c3-ba92-42f9-ba54-2eec448556d6 */
   public boolean kupiOpremo (Uporabnik uporabnik) {
      b.getProdajaOpremes().remove(this);
      return true;
   }
   
   /** @pdOid 167fc220-46ee-42e8-bb86-d20b86775809 */
   public ZmGlasbenik dodajPrijatelja (ZmGlasbenik uporabnik) {
      try {
          ZmGlasbenik glasbenik = (ZmGlasbenik) prodajalec;
          glasbenik.dodajPrijatelja(uporabnik);
          return glasbenik;
      }
      catch (Exception e) {}
      return null;
   }
   
   public Uporabnik getProdajalec () {
       return this.prodajalec;
   }
   
   public String getOprema () {
       return this.oprema;
   }
   
   public float getCena () {
       return this.cena;
   }

}