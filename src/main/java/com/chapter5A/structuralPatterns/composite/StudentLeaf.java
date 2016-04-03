package com.chapter5A.structuralPatterns.composite;

/**
 * MH_Hoossen 213223538
 */
public class StudentLeaf implements StudentComponent
{
    String name;
    String studentNum;

    public StudentLeaf(String name, String studentNum) {
        this.name = name;
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public String getName() {
        return name;
    }

    @Override
    public String displayDetails()
    {
        return name + " " + studentNum;
    }
}
