package com.fikri.syamsudin.creationalpattern.factory.abstracts.gopay;

import com.fikri.syamsudin.creationalpattern.factory.abstracts.GetBalancePaymentRequest;
import com.fikri.syamsudin.creationalpattern.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class GopayGetBalancePaymentRequest implements GetBalancePaymentRequest {


    @Setter
    @Getter
    private String userId;

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.GOPAY;
    }
}
