package com.fikri.syamsudin.creationalpattern.factory.abstracts.creditcard;

import com.fikri.syamsudin.creationalpattern.factory.abstracts.GetBalancePaymentRequest;
import com.fikri.syamsudin.creationalpattern.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class CreditCardGetBalancePaymentRequest implements GetBalancePaymentRequest {


    @Setter
    @Getter
    private String userId;

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.CREDIT_CARD;
    }


}
