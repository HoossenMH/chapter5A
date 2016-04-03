package com.chapter5A.testCreationalPatterns.testFactoryMethod;

import com.chapter5A.creationalPatterns.factoryMethod.Student;
import com.chapter5A.creationalPatterns.factoryMethod.StudentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * MH_Hoossen 213223538
 */
public class TestFactoryMethod
{
    private StudentFactory studentFactory;
    private Student postGrad;
    private Student underGrad;

    @Before
    public void setUp() throws Exception
    {
        studentFactory = new StudentFactory();

        postGrad = studentFactory.getStudentType("Post-Graduate");
        underGrad = studentFactory.getStudentType("Under-Graduate");
    }

    @Test
    public void testPostGrad() throws Exception
    {
        Assert.assertEquals("This is a Post-Graduate", postGrad.getStudent());
    }

    @Test
    public void testUnderGrad() throws Exception
    {
        Assert.assertEquals("This is an Under-Graduate", underGrad.getStudent());
    }
}