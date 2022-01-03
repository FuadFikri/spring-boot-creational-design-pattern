package com.fikri.syamsudin.creationalpattern.factory.method;

import lombok.Getter;
import lombok.ToString;

@ToString
public class FacebookSocialMedia implements SocialMedia {
    @Getter
    private String name = "Facebook";

    @Getter
    private String link = "https://facebook.com";

    @Getter
    private SocialMediaType type = SocialMediaType.FACEBOOK;
}
