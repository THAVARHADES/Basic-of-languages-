class Animal{
    String name;
    int age;
    public Animal(){
        super();
    }
    public Animal(int age){
        this();
        this.age=age;
    }
    public Animal(String name){
        this(26);    
        this.name=name;
    }
    public Animal(String name,int age){
        this("Rohan");
        this.name=name;
        this.age=age;
    }
}
class Tiger extends Animal{
    String gender;
    public Tiger(){
        this("Animal");
    }
    public Tiger(String gender){
        super("radhe",25);
        this.gender=gender;        
    }
}
class Class42{
    public static void main(String []args){
        Tiger t=new Tiger();
        System.out.println(t.name);
        System.out.println(t.gender);
        System.out.println(t.age);
    }
}