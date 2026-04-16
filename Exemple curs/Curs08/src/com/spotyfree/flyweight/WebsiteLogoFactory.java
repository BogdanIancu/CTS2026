package com.spotyfree.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebsiteLogoFactory {
    private Map<String, WebsiteLogo> logos = new HashMap<>();

    public WebsiteLogoFactory() {
        WebsiteLogo spotyfreeLogo = new WebsiteLogo("spotyfree", "base64value");
        WebsiteLogo playLogo = new WebsiteLogo("play", "otherBase64value");
        WebsiteLogo pauseLogo = new WebsiteLogo("pause", "someOtherBase64value");
        logos.put(spotyfreeLogo.getName(), spotyfreeLogo);
        logos.put(playLogo.getName(), playLogo);
        logos.put(playLogo.getName(), pauseLogo);
    }

    public WebsiteLogo getLogo(String key) {
        return logos.get(key);
    }
}
