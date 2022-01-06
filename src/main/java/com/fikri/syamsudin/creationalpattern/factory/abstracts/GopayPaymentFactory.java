package com.fikri.syamsudin.creationalpattern.factory.abstracts;

import com.fikri.syamsudin.creationalpattern.factory.abstracts.gopay.GopayCancelPaymentRequest;
import com.fikri.syamsudin.creationalpattern.factory.abstracts.gopay.GopayChargePaymentRequest;
import com.fikri.syamsudin.creationalpattern.factory.abstracts.gopay.GopayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GopayPaymentFactory implements PaymentFactory {
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new GopayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new GopayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new GopayGetBalancePaymentRequest();
    }
}
