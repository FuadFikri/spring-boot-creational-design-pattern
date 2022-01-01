package com.fikri.syamsudin.creationalpattern;

import com.fikri.syamsudin.creationalpattern.builder.Product;
import com.fikri.syamsudin.creationalpattern.builder.ProductBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BuilderTest {


    @Test
    public void testBuilder(){

//        pakai manual builder
        Product product = new ProductBuilder()
                .setName("Playstation 5")
                .setId("9039")
                .setSku("sku")
                .setPrice("200000")
                .build();

        System.out.println(product);


//        using @builder lombok
        Product product1 = Product.builder()
                .id("oaoao")
                .name("popopo")
                .price("9990000")
                .build();

        System.out.println(product1);

    }
}
