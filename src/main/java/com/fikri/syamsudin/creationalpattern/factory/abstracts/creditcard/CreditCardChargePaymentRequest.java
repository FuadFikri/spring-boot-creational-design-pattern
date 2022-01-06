package com.fikri.syamsudin.creationalpattern.factory.abstracts.creditcard;

import com.fikri.syamsudin.creationalpattern.factory.abstracts.ChargePaymentRequest;
import com.fikri.syamsudin.creationalpattern.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class CreditCardChargePaymentRequest implements ChargePaymentRequest {



    @Setter
    @Getter
    private String id;


    @Setter
    @Getter
    private Long amount;

    @Override
    public Long getFee() {
        return getAmount() * 5 / 100;
    }



    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
