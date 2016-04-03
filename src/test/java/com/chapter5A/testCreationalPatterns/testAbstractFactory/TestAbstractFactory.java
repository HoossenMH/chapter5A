package com.chapter5A.testCreationalPatterns.testAbstractFactory;

import com.chapter5A.creationalPatterns.abstractFactory.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * MH_Hoossen 213223538
 */
public class TestAbstractFactory
{

    private WesternProvinceFactory westernProvinceFactory;
    private WesternProvinceCapeTown westernProvinceCapeTown;
    private WesternProvincePaarl westernProvincePaarl;

    private GautengProvinceFactory gautengProvinceFactory;
    private GautengProvinceJohannesburg gautengProvinceJohannesburg;
    private GautengProvincePretoria gautengProvincePretoria;


    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void testWesternProvince() throws Exception
    {
        Assert.assertEquals("Cape Town", westernProvinceCapeTown.getCityName());
        Assert.assertEquals("Paarl", westernProvincePaarl.getCityName());
    }

    @Test
    public void testGautengProvince()
    {
        Assert.assertEquals("Johannesburg", gautengProvinceJohannesburg.getCityName());
        Assert.assertEquals("Pretoria", gautengProvincePretoria.getCityName());
    }
}
