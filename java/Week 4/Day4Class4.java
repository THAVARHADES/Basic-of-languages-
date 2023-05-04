class Student{
    private String Name;
    private int Age;
    private String Gender;
    private int USN;
    public void setData(String a,int b,String c,int d){
        Name=a;
        Age=b;
        Gender=c;
        USN=d;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public String getGender(){
        return Gender;
    }
    public int getUSN(){
        return USN;
    }
}
class Day4Class4{
    public static void main(String []args){
        Student s=new Student();
        s.setData("Omkar",25,"Male",12);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());
        System.out.println(s.getUSN());
    }
}