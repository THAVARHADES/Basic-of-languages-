class Company
{
	String name;
	String gender;
	int age;
	int usn;
	void eat()
	{
		System.out.println("Student is eating");
	}
	void sleep()
	{
		System.out.println("Student is Sleeping");
	}
	void studentstudy()
	{
		System.out.println("Student is studying");
	}
}
class CompanyApp
{	
	public static void main(String []args)
	{
		Company c1=new Company();
		Company c2=new Company();
		/*Company c3=new Company();*/
		c1.eat();
		c2.sleep();
		c1.name="Raju";
		c1.age=22;
		c1.gender="male";
		c1.usn=15489;
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.gender);
		System.out.println(c1.usn);
		c2.eat();
		c2.sleep();
		c2.name="Raju";
		c2.age=22;
		c2.gender="male";
		c2.usn=11683;
		System.out.println(c2.name);
		System.out.println(c2.age);
		System.out.println(c2.gender);
		System.out.println(c2.usn);
	}
}