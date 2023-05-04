/*class Employee{
    private int empid;
    private String name;
    private int Salary;
    public Employee(int empid,String name,int Salary){
        this.empid=empid;
        this.name=name;
        this.Salary=Salary;
    }
    public int getempid(){
        return empid;
    }
    public String getname(){
        return name;
    }
    public int getSalary(){
        return Salary;
    }
}
class Day1Class3{
    public static void main(String []args){
        Employee e=new Employee(1123,"omkar",500000);
        System.out.println(e.getempid());
        System.out.println(e.getname());
        System.out.println(e.getSalary());
    }
}*/
class Employee{
    private int empid;
    private String name;
    private int Salary;
    public int getempid(){
        return empid;
    }
    public String getname(){
        return name;
    }
    public int getSalary(){
        return Salary;
    }
}
class Day1Class3{
    public static void main(String []args){
        Employee e=new Employee();
        System.out.println(e.getempid());
        System.out.println(e.getname());
        System.out.println(e.getSalary());
    }
}