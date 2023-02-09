package Test3;

public class TeacherTester
{
	public static void main(String[] args) {
		 
        Teacher obj1 = new Teacher("Alex", "Java Fundamentals", 1200L);
        Teacher obj2 = new Teacher("John", "RDBMS", 800L);
        Teacher obj3 = new Teacher("Sam", "Networking", 900L);
        Teacher obj4 = new Teacher("Maria", "Python", 900L);

        Teacher[] teachers = {obj1, obj2, obj3, obj4};

        for (Teacher teacher : teachers) {
            System.out.print("\nName: " + teacher.getTeacherName());
            System.out.print(", Subject: " + teacher.getSubject());
            System.out.print(", Salary: " + teacher.getSalary());
        }
}
}
