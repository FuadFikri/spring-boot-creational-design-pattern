package com.fikri.syamsudin.creationalpattern.factory.abstracts;

public interface ChargePaymentRequest {

    String getId();

    void setId(String id);

    Long getAmount();

    void setAmount(Long amount);

    Long getFee();

    PaymentMethod getPaymentMethod();

}
