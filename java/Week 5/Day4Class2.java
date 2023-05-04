class Aadharcard{
    String name;
    int age;
    int id;
    static String nationality;
    public Aadharcard(String name,int age,int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    static{
        nationality="Indian";
    }
    void display(){
        System.out.print(name+" ");
        System.out.print(age+" ");
        System.out.print(id+" ");
        System.out.print(nationality+" ");
        System.out.println();
    }
}
class Day4Class2{
    public static void main(String []args){
        Aadharcard a1=new Aadharcard("Omkar",23,123);
        Aadharcard a2=new Aadharcard("Prarabh",25,124);
        Aadharcard a3=new Aadharcard("Bhaskar",21,235);
        a1.display();
        a2.display();
        a3.display();
    }
}