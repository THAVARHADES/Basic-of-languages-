class Student{
    static int count=0;
    public Student(){
        count++;
    }
}
class Day5Class4{
    public static void main(String []args){
        Student s1=new Student();
        System.out.println("No. of Object Created"+Student.count);
        Student s2=new Student();
        System.out.println("No. of Object Created"+Student.count);
        Student s3=new Student();
        System.out.println("No. of Object Created"+Student.count);
    }
}