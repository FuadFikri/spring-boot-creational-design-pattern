package com.fikri.syamsudin.creationalpattern.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SingletonApp {

    @Bean
    public Counter counter(){
        return new Counter();
    }
}
