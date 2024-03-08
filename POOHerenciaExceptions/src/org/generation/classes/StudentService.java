package org.generation.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.generation.classes.exceptions.CourseNotFoundException;
import org.generation.classes.exceptions.StudentNotFoundException;

public class StudentService
{
   private  HashMap<String, Course> courseList = new HashMap<>();
   private HashMap<String, Student> students = new HashMap<>();
   private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();


    public StudentService()
    {
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }

    public void enrollStudents( String courseName, String studentID )
    throws CourseNotFoundException, StudentNotFoundException
    	{
        Course course = courseList.get( courseName );
        //agregamos las excepciones aqui:
        if(course==null) {
        	throw new CourseNotFoundException(courseName);
        }//fin course exception
        Student student=students.get(studentID);
        if(student==null) {
        	throw new StudentNotFoundException(studentID);
        }//fin course exception
        if ( !coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.put( studentID, new ArrayList<>() ); //studentID es el key en el mapa y el valor será un nueva lista
        }
        coursesEnrolledByStudents.get( studentID ).add( course ); //busca el alumno con ese ID y le coloca el curso en la lista (en la posicion q corresponde al value en el mapa)
    }

    public void unEnrollStudents( String courseName, String studentID )
    	throws CourseNotFoundException, StudentNotFoundException
	{
	    Course course = courseList.get( courseName );
	    //agregamos las excepciones aqui:
	    if(course==null) {
	    	throw new CourseNotFoundException(courseName);
	    }//fin course exception
	    Student student=students.get(studentID);
	    if(student==null) {
	    	throw new StudentNotFoundException(studentID);
	    }//fin course exception
        if ( coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.get( studentID ).remove( course );
        }
    }

    public void showEnrolledStudents(String courseId){ 
        //TODO implement using collections loops
    		System.out.println("--students enrolled in "+courseId+" course--");
		Course course = courseList.get( courseId );
		for(String studentID: coursesEnrolledByStudents.keySet()) {
			List<Course> allCourses=coursesEnrolledByStudents.get(studentID); //crearemos una nueva lista llamada allCourses con los cursos que tiene cada alumno
			if(allCourses.contains(course)) { //si dentro de la lista existe el curso dado
				Student s=students.get(studentID); //guarda el ID del estudiante 
				System.out.println(s); //muestra el ID del estudiante enrolado en determinado grupo
			}//if
		}//for
		System.out.println();	
    }

    public void showAllCourses(){
        //TODO implement using collections loops
	    	for (String llave : courseList.keySet()) { 
				System.out.println(courseList.get(llave));
			}
    }
     //al hacer privado los mapas ya no puedo accederllos en el MAIN entonces haremos un método "addStudent" ya que el "students" del main estaba manando a llamar al mapa de aqui pero ya NO es visible por ponerlo privado.
    public void addStudent(Student student) {
    		students.put(student.getId(), student);
    }
}
