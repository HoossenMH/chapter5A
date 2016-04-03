package com.chapter5A.creationalPatterns.prototype;

/**
 * MH_Hoossen 213223538
 */
public class WorkoutUser implements CloneObject
{
    private String name;
    private int age;

    public WorkoutUser(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public CloneObject createCopy()
    {
        return  new WorkoutUser(name, age);
    }
}
