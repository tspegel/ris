/***********************************************************************
 * Module:  ProdajaArtikla.java
 * Author:  Urban
 * Purpose: Defines the Class ProdajaArtikla
 ***********************************************************************/

package com.ris.database;

import lombok.Getter;
import lombok.Setter;

public class ProdajaArtikla {

    @Getter
    @Setter
    private String artikel;
    @Getter
    @Setter
    private String cena;
    @Getter
    @Setter
    private String zaloga;

    public ProdajaArtikla(final String artikel, final String cena, final String zaloga) {
        this.artikel = artikel;
        this.cena = cena;
        this.zaloga = zaloga;
    }

}