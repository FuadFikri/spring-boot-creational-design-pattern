package com.fikri.syamsudin.creationalpattern.builder;


//manual
public class ProductBuilder {

    private String id;
    private String name;
    private String price;
    private String sku;




    public ProductBuilder setId(String id) {
        this.id = id;
        return this;
    }


    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }



    public ProductBuilder setPrice(String price) {
        this.price = price;
        return this;
    }


    public ProductBuilder setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public Product build() {
        return  new Product(id,name,price,sku);
    }
}
