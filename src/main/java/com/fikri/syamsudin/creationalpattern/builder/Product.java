package com.fikri.syamsudin.creationalpattern.builder;

import lombok.Builder;

@Builder
public class Product {
    private String id;
    private String name;
    private String price;
    private String sku;

    public Product(String id, String name, String price, String sku) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sku = sku;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", sku='" + sku + '\'' +
                '}';
    }
}
