class Student
{
    String name;
    int age;
    String gender;
    int usn;
    void eat()
    {
        System.out.println("student is studying");
    }
    void sleep()
    {
        System.out.println("student is sleeping");
    }
    void study()
    {
        System.out.println("student is studying");
    }
}
class StudentApp
{
    public static void main(String []args)
    {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.sleep();
        s2.study();
        s3.eat();
    }
}
