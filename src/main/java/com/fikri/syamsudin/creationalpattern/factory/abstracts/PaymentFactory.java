package com.fikri.syamsudin.creationalpattern.factory.abstracts;

public interface PaymentFactory {


    ChargePaymentRequest createChargeRequest();

    CancelPaymentRequest createCancelRequest();

    GetBalancePaymentRequest createGetBalanceRequest();
}
