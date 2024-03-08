import java.util.ArrayList;
import java.util.List;

public class Courses {
	
		String courseName;
		String professorName;
		int year;
		
		List <Student> studEnrolled= new ArrayList<>();
		
		public Courses(String courseName, String professorName, int year){
			this.courseName=courseName;
			this.professorName=professorName;
			this.year=year;
		}//constructor
		
		
	   public void enroll(Student student){
		      //TODO add the student to the collection
		   studEnrolled.add(student);
	   }
	   //overload of enroll:
	   public void enroll(Student[] students){
		      //TODO add all the students to the collection
		   for (Student student : students) {
			enroll(student); // mandamos a llamar al método de arriba
		}
	   
	   }

	   public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
		   if(studEnrolled.contains(student)) {
			   studEnrolled.remove(student);
		   }	else {
			   System.out.println(student+ " is not in the list of students");
		   }
	   }

	   public int countStudents(){
	       return studEnrolled.size();
	   }
	   
	   public int bestGrade(){
	       //TODO implement
		   int best=0;
		   for (Student student : studEnrolled) {
			   if(student.grade>best) {
				   best=student.grade;
			   }//if
		   }
		   return best;
	   }
}
