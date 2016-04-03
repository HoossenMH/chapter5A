package com.chapter5A.testStructuralPatterns.testComposite;

import com.chapter5A.structuralPatterns.composite.Composite;
import com.chapter5A.structuralPatterns.composite.StudentLeaf;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * MH_Hoossen 213223538
 */
public class TestComposite
{
    private StudentLeaf studLeaf1;
    private StudentLeaf studLeaf2;
    private StudentLeaf studLeaf3;

    private Composite comp1;
    private Composite comp2;


    @Before
    public void setUp() throws Exception
    {
        studLeaf1 = new StudentLeaf("Hasan","213223538");
        studLeaf2 = studLeaf1;
    }

    @Test
    public void testLeaf1() throws Exception
    {
        Assert.assertEquals( studLeaf2.displayDetails(), studLeaf1.displayDetails());
    }
}
