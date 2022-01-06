package com.fikri.syamsudin.creationalpattern;

import com.fikri.syamsudin.creationalpattern.factory.abstracts.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = AbstractFactoryApplication.class )
class AbstractFactoryApplicationTest {



    @Autowired
    private ApplicationContext applicationContext;


    @Test
    void pay(){
         PaymentFactory paymentFactoryCC =  applicationContext.getBean(CreditCardPaymentFactory.class);
         PaymentFactory paymentFactoryGopay =  applicationContext.getBean(GopayPaymentFactory.class);

         charge(paymentFactoryCC);
         charge(paymentFactoryGopay);

         cancel(paymentFactoryCC);
         cancel(paymentFactoryGopay);
    }


    public void charge(PaymentFactory paymentFactory){
        ChargePaymentRequest request = paymentFactory.createChargeRequest();
        request.setId("POPO-093");
        request.setAmount(1000L);

//        kirim ke payment gateway
        System.out.println(request);
    }

    public void cancel(PaymentFactory paymentFactory){
        CancelPaymentRequest request = paymentFactory.createCancelRequest();
        request.setId("ID990");

//        kirim ke payment gateway
        System.out.println(request);
    }

    public Long getBalance(PaymentFactory paymentFactory){
        try {
            GetBalancePaymentRequest request = paymentFactory.createGetBalanceRequest();
            request.setUserId("FIkri");

            //        kirim ke payment gateway
            System.out.println(request);
            return  1000L;
        }catch (UnsupportedOperationException e){
            return 0L;
        }
    }

}