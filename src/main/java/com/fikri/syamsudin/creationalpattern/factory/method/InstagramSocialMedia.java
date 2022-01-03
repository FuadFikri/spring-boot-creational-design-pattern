package com.fikri.syamsudin.creationalpattern.factory.method;

import lombok.Getter;
import lombok.ToString;

@ToString
public class InstagramSocialMedia implements SocialMedia{
    @Getter
    private String name = "Instagram";

    @Getter
    private String link = "https://instagram.com";

    @Getter
    private SocialMediaType type = SocialMediaType.INSTAGRAM;
}
