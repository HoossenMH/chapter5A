package com.chapter5A.testCreationalPatterns.testPrototype;

import com.chapter5A.creationalPatterns.prototype.WorkoutUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * MH_Hoossen 213223538
 */
public class TestPrototype
{
    private WorkoutUser user1;
    private WorkoutUser user2;

    @Before
    public void setUp() throws Exception
    {
        user2 = (WorkoutUser) user1.createCopy();
    }

    @Test
    public void testObjectClone() throws Exception
    {
        Assert.assertEquals(user1.getClass(), user2.getClass());
    }
}
