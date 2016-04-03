package com.chapter5A.testStructuralPatterns.testAdapter;

import com.chapter5A.structuralPatterns.adapter.CapacityConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * MH_Hoossen 213223538
 */
public class TestAdapter
{
    private CapacityConverter capacityClass;
    private CapacityConverter capacityObject;

    @Before
    public void setUp() throws Exception
    {

    }


    @Test
    public void testClassAdapter()
    {
        capacityClass.setLiterCapacity(50.0);

        Assert.assertEquals(50.0, capacityClass.getLiterWeight(), 2f);
    }

    @Test
    public void testObjectAdapter()
    {
        capacityObject.setLiterWeight(50.0);

        Assert.assertEquals(50.0, capacityObject.getLiterCapacity(), 2f);
    }
}
