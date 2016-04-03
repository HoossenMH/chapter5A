package com.chapter5A.creationalPatterns.singleton;

/**
 * MH_Hoossen 213223538
 */
public class SinglePerson {

    private static SinglePerson person = null;

    public SinglePerson() {
    }

    public static SinglePerson getInstance()
    {
        if (person == null)
            person = new SinglePerson();

        return person;
    }

    public String greet()
    {
        return "Hello";
    }

}
