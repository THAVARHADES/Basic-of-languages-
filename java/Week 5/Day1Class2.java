class Employee{
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
class Day1Class2{ 
    public static void main(String []args){
        Employee s=new Employee(123,"Omkat",500000);
        System.out.println(s.getempid());
        System.out.println(s.getname());
        System.out.println(s.getSalary());
    }
}