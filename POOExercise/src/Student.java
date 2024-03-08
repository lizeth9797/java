public class Student {
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    //first constructor
    public Student(String firstName,String lastName,int registration,int grade, int year){
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.registration=registration;
    	this.grade=grade;
    	this.year=year;
    }
    //second constructor
    public Student(String firstName, String lastName, int registration) {
		this(firstName,lastName,registration,59,4);
	}
     //third constructor 
    public Student(String firstName, String lastName) {
		this(firstName,lastName,003,61,4);
	}
    
	//el this solo es necesario si el parámetro dentro del método tiene el mismo nombre q una propiedad, yo lo he colocado por practicidad pero NO era necesario en este caso porque nombré los parámetros como se llaman en la propiedad de la clase
    
    // !!!!! Los parámetros dentro de los métodos no son parámetros de una función sino de un método que realiza un objeto por lo tanto los parámetros no son necesarios si se trata de propiedades de la clase!!!!
    
    public String printFullName(){ 
        return this.firstName+" "+this.lastName;
     }

     public boolean isApproved(){ //no es necesario agregar parametros de entrada xq el grado ya existe en la clase. 
         //TODO implement: should return true if grade >= 60
    	 return (this.grade>=60)?true:false; 
     }

     public int changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congratulations" if the student has been approved
    	 if(isApproved()) { 
    		 System.out.print("Congratulations, you advanced to course: ");
    		 year+=1;
    	 }else {
    		 System.out.print("You will be in year: ");
    	 }
    	 return year;
     }

     
     public int newYear(){
         return year;
      }

     
     
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", grade=" + grade + ", year=" + year + "]";
	}
}//StudentClass
