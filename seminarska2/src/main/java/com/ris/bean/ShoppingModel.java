package com.ris.bean;

import lombok.Data;

@Data
public class ShoppingModel {

    private String poster;
    private String name;
    private String cost;

    public ShoppingModel(final String poster, final String name, final String cost) {
        this.poster = poster;
        this.name = name;
        this.cost = cost;
    }
}
