package com.chapter5A.testCreationalPatterns.testBuilder;

import com.chapter5A.creationalPatterns.builderPattern.WorkoutCourseBuilder;
import com.chapter5A.creationalPatterns.builderPattern.WorkoutCourseTrainer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * MH_Hoossen 213223538
 */
public class TestBuilder
{
    private WorkoutCourseBuilder levelOneWorkoutCourseBuilder;
    private WorkoutCourseBuilder levelTwoWorkoutCourseBuilder;
    private WorkoutCourseTrainer trainer;


    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void testLevelOneWorkoutCourseBuilder() throws Exception
    {
        trainer = new WorkoutCourseTrainer(levelOneWorkoutCourseBuilder);
        trainer.constructWorkoutCourse();

        Assert.assertEquals("General Fitness Beginner", trainer.getWorkoutCourse());
    }

    @Test
    public void testLevelTwoWorkoutCourseBuilder() throws Exception
    {
        trainer = new WorkoutCourseTrainer(levelTwoWorkoutCourseBuilder);
        trainer.constructWorkoutCourse();

        Assert.assertEquals("General Fitness Advance", trainer.getWorkoutCourse());
    }
}
