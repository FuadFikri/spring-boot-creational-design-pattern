package com.fikri.syamsudin.creationalpattern.factory.abstracts;

import com.fikri.syamsudin.creationalpattern.factory.abstracts.creditcard.CreditCardCancelPaymentRequest;
import com.fikri.syamsudin.creationalpattern.factory.abstracts.creditcard.CreditCardChargePaymentRequest;
import com.fikri.syamsudin.creationalpattern.factory.abstracts.creditcard.CreditCardGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory{
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new CreditCardChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new CreditCardCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new CreditCardGetBalancePaymentRequest();
    }
}
