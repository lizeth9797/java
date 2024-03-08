package org.generation.classes.exceptions;

public class CourseNotFoundException extends Exception
{

    public CourseNotFoundException(String courseName)
    {
        super(courseName+"course not found!!");
    }
}