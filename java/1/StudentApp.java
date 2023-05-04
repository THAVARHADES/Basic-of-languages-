class Student{
	String name;
 	int age;
	String gender;
	int usn;

	void eat()
	{
		System.out.println("Student is study");
	}
	void sleep()
	{
		System.out.println("Student is sleeping");
	}
	void study()
	{
		System.out.println("Student is studying");
	}
}
class StudentApp
{
	public static void main(String []args)
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.eat();
		s2.sleep();
		s3.study();
		new Student().study();
	}
}
