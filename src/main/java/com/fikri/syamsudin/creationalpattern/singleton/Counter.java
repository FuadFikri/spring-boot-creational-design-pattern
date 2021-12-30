package com.fikri.syamsudin.creationalpattern.singleton;

public class Counter {
    private Integer value = 0;

    public Integer getValue() {
        return value;
    }

    public synchronized void increment(){
        value++;
    }
}
