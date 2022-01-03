package com.fikri.syamsudin.creationalpattern.factory.method;

import lombok.Getter;
import lombok.ToString;

@ToString
public class TwitterSocialMedia implements SocialMedia{

    @Getter
    private String name = "Twitter";

    @Getter
    private String link = "https://twitter.com";

    @Getter
    private SocialMediaType type = SocialMediaType.TWITTER;
}
