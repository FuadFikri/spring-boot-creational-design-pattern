package com.fikri.syamsudin.creationalpattern.factory.abstracts.gopay;

import com.fikri.syamsudin.creationalpattern.factory.abstracts.ChargePaymentRequest;
import com.fikri.syamsudin.creationalpattern.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class GopayChargePaymentRequest implements ChargePaymentRequest {



    @Setter
    @Getter
    private String id;


    @Setter
    @Getter
    private Long amount;

    @Override
    public Long getFee() {
        return 1000L;
    }



    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.GOPAY;
    }
}
