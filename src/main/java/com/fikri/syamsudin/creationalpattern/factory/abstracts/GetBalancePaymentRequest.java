package com.fikri.syamsudin.creationalpattern.factory.abstracts;

public interface GetBalancePaymentRequest {

    String getUserId();

    void setUserId(String userId);


    PaymentMethod getPaymentMethod();

}
