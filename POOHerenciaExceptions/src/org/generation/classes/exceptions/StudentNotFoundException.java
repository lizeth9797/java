package org.generation.classes.exceptions;

public class StudentNotFoundException extends Exception
{

public StudentNotFoundException( String studentID)
{
    super( studentID+"Student not found!" );
}
}