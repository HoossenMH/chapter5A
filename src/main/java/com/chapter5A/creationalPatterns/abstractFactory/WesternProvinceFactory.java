package com.chapter5A.creationalPatterns.abstractFactory;

/**
 * Created by Toshiba on 2016/04/03.
 */
public class WesternProvinceFactory implements CityFactory {
    @Override
    public City getCityName(String cityCode) {

        if ("021".equalsIgnoreCase(cityCode))
            return new WesternProvinceCapeTown();
        else
            return new WesternProvincePaarl();
    }
}
