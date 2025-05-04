package org.example.GearFactory.MistyMounts;

import org.example.GearFactory.Banner;
import org.example.GearFactory.BannerType;

import static org.example.GearFactory.BannerType.MOON_BANNER;
import static org.example.GearFactory.BannerType.RED_EYE_BANNER;

public class MistyMountsBanner implements Banner {
    BannerType banner;

    public MistyMountsBanner() {
        banner = MOON_BANNER;
    }

    @Override
    public String toString() {
        return "MistyMountsBanner{" +
                "banner=" + banner +
                '}';
    }
}
