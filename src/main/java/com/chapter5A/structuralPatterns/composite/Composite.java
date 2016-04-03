package com.chapter5A.structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * MH_Hoossen 213223538
 */
public class Composite implements StudentComponent
{
    List<StudentComponent> studComponents = new ArrayList<StudentComponent>();

    @Override
    public String displayDetails()
    {
        for (StudentComponent components : studComponents)
        {
            components.displayDetails();
        }
        return displayDetails();
    }

    public void add(StudentComponent studComponent)
    {
        studComponents.add(studComponent);
    }

    public void remove(StudentComponent studComponent)
    {
        studComponents.remove(studComponent);
    }

    public List<StudentComponent> getStudentComponent()
    {
        return studComponents;
    }
}
