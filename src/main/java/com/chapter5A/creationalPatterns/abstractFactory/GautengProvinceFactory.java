package com.chapter5A.creationalPatterns.abstractFactory;

/**
 * Created by Toshiba on 2016/04/03.
 */
public class GautengProvinceFactory implements CityFactory {
    @Override
    public City getCityName(String cityCode) {

        if ("012".equalsIgnoreCase(cityCode))
            return new GautengProvinceJohannesburg();
        else
            return new GautengProvincePretoria();
    }
}
