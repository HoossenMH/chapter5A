package com.chapter5A.testCreationalPatterns.testSingleton;

import com.chapter5A.creationalPatterns.singleton.SinglePerson;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * MH_Hoossen 213223538
 */
public class TestSingleton
{
    private SinglePerson person;

    @Before
    public void setUp() throws Exception
    {
        person = SinglePerson.getInstance();
    }

    @Test
    public void testMessage() throws Exception
    {
        Assert.assertEquals("Hello", person.greet());
    }
}
