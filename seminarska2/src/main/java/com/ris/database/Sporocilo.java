/***********************************************************************
 * Module:  Sporocila.java
 * Author:  Urban
 * Purpose: Defines the Class Sporocila
 ***********************************************************************/

package com.ris.database;

import lombok.Getter;
import lombok.Setter;

/**
 * @pdOid 8db58960-5f3d-43e6-ae76-ee1f04dac4ba
 */
public class Sporocilo {

    @Getter
    @Setter
    private String sporocila;
    @Getter
    @Setter
    private String datum;
    @Getter
    @Setter
    private String poslal;
    @Getter
    @Setter
    private String sprejel;

    public Sporocilo(final String sporocila, final String datum, final String poslal, final String sprejel) {
        this.sporocila = sporocila;
        this.datum = datum;
        this.poslal = poslal;
        this.sprejel = sprejel;
    }
}