package com.chapter5A.creationalPatterns.factoryMethod;

/**
 * MH_Hoossen 213223538
 */
public class StudentFactory
{
    public Student getStudentType(String type)
    {
        if ("Post-Graduate".equalsIgnoreCase(type))
            return new PostGrad();

        else
            return new UnderGrad();
    }
}
