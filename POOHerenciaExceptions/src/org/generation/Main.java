package org.generation;
//https://github.com/generation-org/JAVA/tree/master/Object%20Oriented%20Programming%20-%20Advanced

import org.generation.classes.Student;
import org.generation.classes.StudentService;
import org.generation.classes.exceptions.CourseNotFoundException;
import org.generation.classes.exceptions.StudentNotFoundException;
  
public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.addStudent( new Student( "Carlos", "1030", 31 ) );
        studentService.addStudent( new Student( "Ian", "1040", 28 ) );
        studentService.addStudent( new Student( "Elise", "1050", 26 ) );
        studentService.addStudent( new Student( "Santiago", "1060", 33 ) );
        studentService.addStudent( new Student( "lizeth", "1070", 20 ) );

        /*studentService.enrollStudents( "Math", "1030" );
        studentService.enrollStudents( "Math", "1040" );
        studentService.enrollStudents( "Art", "1040" );*/
       
        
        try { //tecnicamente deberiamos tener un trycatch para cada uno porque si falla para uno y los otros estaban bien, se detendrá con 1 que falle
            studentService.enrollStudents( "Math", "1030" );
            studentService.enrollStudents( "Math", "1040" );
            studentService.enrollStudents( "Art", "1040" );	
        }catch(CourseNotFoundException e) {
        	System.out.println(e.getMessage());
        }catch(StudentNotFoundException e) {
        	System.out.println(e.getMessage());
        }
        
        studentService.showAllCourses();        
        studentService.showEnrolledStudents("Math");
        studentService.showEnrolledStudents("Art");


    }
}