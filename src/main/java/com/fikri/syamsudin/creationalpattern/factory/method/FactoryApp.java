package com.fikri.syamsudin.creationalpattern.factory.method;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryApp {

// pakai if else
    @Bean
    @Scope("prototype")
    public SocialMedia socialMedia(SocialMediaType socialMediaType) {
        if (socialMediaType == SocialMediaType.FACEBOOK) {
            return new FacebookSocialMedia();
        } else if (socialMediaType == SocialMediaType.TWITTER) {
            return new TwitterSocialMedia();
        } else if (socialMediaType == SocialMediaType.INSTAGRAM) {
            return new InstagramSocialMedia();
        } else {
            throw new RuntimeException("unsupported type");
        }
    }


//  inheritance

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaFacebook(){
        return new FacebookSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTwitter(){
        return new TwitterSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaInstagram(){
        return new InstagramSocialMedia();
    }


}
