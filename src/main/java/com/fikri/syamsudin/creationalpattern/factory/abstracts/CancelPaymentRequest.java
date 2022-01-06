package com.fikri.syamsudin.creationalpattern.factory.abstracts;

public interface CancelPaymentRequest {

    String getId();

    void setId(String id);



    PaymentMethod getPaymentMethod();
}
