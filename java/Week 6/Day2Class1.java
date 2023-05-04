class Employee{
    private String name;
    private int age;
    private int id;
    public Employee(){

    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
}
class Sorting{
    static public void Sort(Employee a[]){
        Employee help;
        for(int i=0;i<=a.length-2;i++){
            for(int j=0;j<=a.length-1-i;j++){
                if(a[j].getAge()>a[j+1].getAge()){
                    help=a[j];
                    a[j]=a[j+1];
                    a[j+1]=help;
                }
            }
        }
    }
}
class Day2Class1{
    public static void main(String []args){
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        Employee e4=new Employee();
        e1.setName("Rama");
        e1.setAge(42);
        e1.setId(1);
        e2.setName("Ravana");
        e2.setAge(40);
        e2.setId(2);
        e3.setName("Sita");
        e3.setAge(35);
        e3.setId(3);
        e4.setName("Lakshamana");
        e4.setAge(39);
        e4.setId(4);
        Employee arr[]=new Employee[4];
        arr[0]=e1;
        arr[1]=e2;
        arr[2]=e3;
        arr[3]=e4;
        System.out.println("Before Sorting by age");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i].getName()+" "+arr[i].getAge()+" "+arr[i].getId());
        }
        System.out.println();
        Sorting.Sort(arr);
        System.out.println("Array after Sorting");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i].getName()+" "+arr[i].getAge()+" "+arr[i].getId());
        }
    }
}