package Test3;

public class Teacher
{
   String teacherName;
   String subject;
   double salary;
public Teacher(String teacherName, String subject, double salary) 
{
	this.teacherName = teacherName;
	this.subject = subject;
	this.salary = salary;
}
public String getTeacherName() {
	return teacherName;
}
public void setTeacherName(String teacherName) {
	this.teacherName = teacherName;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
  
class Tester{
	 public static void main(String[] args)
	 {
		 Teacher obj=new Teacher("Alex","Java Fundamentals",1200L);
		 
		 System.out.println( "Name :"+obj.getTeacherName()  +  "Subject :"+obj.getSubject()  +  "Salary :"+obj.getSalary()+"\t");
		 
	 }
}
   
}
