class Student{
    private String name;
    private int age;
    private String Gender;
    private int USN;
    public Student(String a,int b,String c,int d){
        name=a;
        age=b;
        Gender=c;
        USN=d;
    }
    public String getname(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return Gender;
    }
    public int getUSN(){
        return USN;
    }
}
class Day1Class1{
    public static void main(String []args){
        Student s=new Student("Omkar",32,"Male",1234);
        System.out.println(s.getname());
        System.out.println(s.getAge());
        System.out.println(s.getGender());
    }
}