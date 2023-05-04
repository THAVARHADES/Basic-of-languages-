/*class Employee{
    private int empid;
    private String Name;
    private int Salary;
    public Employee(){

    }
    public Employee(int empid,String Name,int Salary){
        this();
        this.empid=empid;
        this.Name=Name;
        this.Salary=Salary;
    }
    public Employee(int empid,int Salary){
        this(12,"Parahllad",50000);
        this.empid=empid;
        this.Name="Omkar";
        this.Salary=Salary;
    }
    public int getempid(){
        return empid;
    }
    public String getName(){
        return Name;
    }
    public int getSalary(){
        return Salary;
    }
}
class Day2Class2{
    public static void main(String []args){
        Employee s=new Employee(12,500000);
        System.out.println(s.getempid());
        System.out.println(s.getSalary());
        System.out.println(s.getName());
    }
}*/
class Employee{
    private int empid;
    private String Name;
    private int Salary;
    public Employee(){

    }
    public Employee(int empid,String Name,int Salary){
        this.empid=empid;
        this.Name=Name;
        this.Salary=Salary;
    }
    public Employee(int empid,int Salary){
        this.empid=empid;
        this.Salary=Salary;
        this.Name="Omkar";
    }
    public int getempid(){
        return empid;
    }
    public String getName(){
        return Name;
    }
    public int getSalary(){
        return Salary;
    }
}
class Day2Class2{
    public static void main(String []args){
        Employee e=new Employee(12,"omkar",50000);
        System.out.println(e.getempid());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        Employee e1=new Employee(12,5000);
        System.out.println(e1.getempid());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}