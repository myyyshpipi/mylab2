package org.example.GearFactory.Dolguldur;

import org.example.GearFactory.Banner;
import org.example.GearFactory.BannerType;

import static org.example.GearFactory.BannerType.*;

public class DolguldurBanner implements Banner {
    BannerType banner;

    public DolguldurBanner() {
        banner = SPIDER_BANNER;
    }

    @Override
    public String toString() {
        return "DolguldurBanner{" +
                "banner=" + banner +
                '}';
    }
}
