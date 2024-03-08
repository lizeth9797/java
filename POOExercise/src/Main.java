public class Main {
	//https://github.com/generation-org/JAVA/tree/master/Object%20Oriented%20Programming%20-%20Fundamentals

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student("Lizeth","Ortiz",001,80,2);
		Student student2=new Student("Kari","Munoz",002);
		Student student3=new Student("Raul","Salo");

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

		System.out.println(student1.printFullName());
		System.out.println(student1.isApproved());
		System.out.println(student1.changeYearIfApproved());
		//System.out.println(student1.newYear(student1.year));
		System.out.println(student2.printFullName());
		System.out.println(student2.isApproved());
		System.out.println(student2.changeYearIfApproved());
		System.out.println(student3.printFullName());
		System.out.println(student3.isApproved());
		System.out.println(student3.changeYearIfApproved());

		Courses java= new Courses("Java","JC",2023);
		
		java.enroll(student1);
		java.enroll(student2);
		java.enroll(student3);
		System.out.println("Total students: "+java.countStudents());
		System.out.println("Best grade is: "+java.bestGrade());
		java.unEnroll(student2);
		System.out.println("Total students after removal: "+java.countStudents());

		
	
		
	}//main
}
