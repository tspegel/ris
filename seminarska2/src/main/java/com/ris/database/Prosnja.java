/***********************************************************************
 * Module:  Prosnja.java
 * Author:  Urban
 * Purpose: Defines the Class Prosnja
 ***********************************************************************/

package com.ris.database;

/** @pdOid 56270c36-c507-45c3-bdfa-7407498b1f9f */
public class Prosnja {
    
    ZmGlasbenik glasbenik;
    ZmBend bend;
    
    public Prosnja (ZmGlasbenik glasbenik, ZmBend bend) {
        this.glasbenik = glasbenik;
        this.bend = bend;
    }
    
}