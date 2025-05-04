package org.example.GearFactory.Mordor;

import org.example.GearFactory.Banner;
import org.example.GearFactory.BannerType;

import static org.example.GearFactory.BannerType.RED_EYE_BANNER;

public class MordorBanner implements Banner {
    BannerType banner;

    public MordorBanner() {
        banner = RED_EYE_BANNER;
    }

    @Override
    public String toString() {
        return "MordorBanner{" +
                "banner=" + banner +
                '}';
    }
}
