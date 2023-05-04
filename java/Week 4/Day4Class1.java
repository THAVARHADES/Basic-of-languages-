class Student{
    int age=22;
}
/*class DayFClassO{
    public static void main(String []args){
        Student stu=new Student();
        System.out.print(stu);
    }
}*/
/*class UseStudent{
    int Send(){
        Student s=new Student();
        System.out.println(s);
        return 1;
    }
}
class DayFClassO{
    public static void main(String []args){
        UseStudent us=new UseStudent();
        int res=us.Send();
        System.out.print(res);
    }
}*/
class UseStudent{
    Student Send(){
        Student s=new Student();
        System.out.println(s);
        return s;
    }
}
class Day4Class1{
    public static void main(String []args){
        UseStudent us=new UseStudent();
        Student res=us.Send();
        System.out.println(res);
    }
}