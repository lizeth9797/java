import java.util.ArrayList;
import java.util.List;

public class Student
{
    String name; //sin modificador (public/private/protected)
    String id;
    List<Course> enrolledCourses = new ArrayList<>(  ); //lista es un tipo de colección, asi como Map o Set y aqui solo le especificamos al final que esa lista es de tipo ArrayList

    public Student( String name, String id )
    {
        this.name = name;
        this.id = id;
    }//constructor

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }

    public void enroll(Course course){
        enrolledCourses.add( course );
    }

    public void unEnroll(Course course){
        enrolledCourses.remove( course );
    }

    public int totalEnrolledCourses(){
        return enrolledCourses.size(); 
    }

    public List<Course> getEnrolledCourses()
    {
        return enrolledCourses;
    }
 
    @Override //es una anotación
    
    //regresa un string con el siguiente formato:
    public String toString()
    {
        return "Student{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", enrolledCourses=" + enrolledCourses
            + '}';
    }
}