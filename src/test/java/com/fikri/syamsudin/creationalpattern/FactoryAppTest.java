package com.fikri.syamsudin.creationalpattern;

import com.fikri.syamsudin.creationalpattern.factory.method.FactoryApp;
import com.fikri.syamsudin.creationalpattern.factory.method.SocialMedia;
import com.fikri.syamsudin.creationalpattern.factory.method.SocialMediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = FactoryApp.class)
class FactoryAppTest {

    @Autowired
    private ApplicationContext applicationContext;


    @Test
    public void testFactoryMethod(){
        SocialMedia fb =applicationContext.getBean(SocialMedia.class, SocialMediaType.FACEBOOK);
        SocialMedia twitter  =applicationContext.getBean(SocialMedia.class, SocialMediaType.TWITTER);
        SocialMedia instagram  =applicationContext.getBean(SocialMedia.class, SocialMediaType.INSTAGRAM);

        System.out.println(fb);
        System.out.println(twitter);
        System.out.println(instagram);
    }
}