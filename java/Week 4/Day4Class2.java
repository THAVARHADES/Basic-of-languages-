class Person{
    int age=22;
}
class Studeent{
    int id=123;
}
class Day4Class2{
    public static void main(String []args){
        Person p1=new Person();
        System.out.println(p1);
        Person p2=new Person();
        System.out.println(p2);
        System.out.println  ("-----------------");
        Student stu1=new Student();
        System.out.println(stu1);
        Student stu2=stu1;
        System.out.println(stu2);
        System.out.println("------------");
        int arr1[]=new int[5];
        System.out.println(arr1);
        float arr2[]=new float[5];
        System.out.println(arr2);
        System.out.println("------------");
        boolean arr6[]=new boolean[5];
        System.out.println(arr6);
        String arr3[]=new String[5];
        System.out.println(arr3);
        char arr4[]=new char[5];
        System.out.println(arr4);
        System.out.println("------------");
        String str1="Omkar";
        System.out.println(str1);
    }
}