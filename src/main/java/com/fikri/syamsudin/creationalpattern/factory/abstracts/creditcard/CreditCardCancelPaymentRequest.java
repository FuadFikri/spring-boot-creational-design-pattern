package com.fikri.syamsudin.creationalpattern.factory.abstracts.creditcard;

import com.fikri.syamsudin.creationalpattern.factory.abstracts.CancelPaymentRequest;
import com.fikri.syamsudin.creationalpattern.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
public class CreditCardCancelPaymentRequest implements CancelPaymentRequest {

    @Setter
    @Getter
    private String id;

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
