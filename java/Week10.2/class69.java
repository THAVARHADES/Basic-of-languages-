import java.util.*;
class class69{
    public static void main(String []args){
        ArrayList al1=new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);
        System.out.println("al1--->"+al1);
        System.out.println("---------------------------");
        ArrayList al2=new ArrayList();
        al2.add(100);
        al2.add(200);
        al2.add(300);
        al2.add(400);
        al2.add(500);
        System.out.println("al2---->"+al2);
        System.out.println("--------------------");
        ArrayList al3=new ArrayList();
        al3.add(1);
        al3.add(2);
        al3.add(3);
        al3.add(4);
        al3.add(5);
        System.out.println("al3---->"+al3);
        System.out.println("--------------");
        System.out.println(al3.contains(999));
        System.out.println("--------------");
        System.out.println(al2.contains(100));
        System.out.println("--------------");
        System.out.println(al3.containsAll(al1));
        System.out.println("--------------");
        System.out.println(al2.get(5));
        System.out.println("--------------");
        System.out.println(al2.indexOf(20));
        System.out.println("--------------");
        System.out.println(al3.isEmpty());
        System.out.println("--------------");
        System.out.println(al3.size());
        System.out.println("--------------");
        //System.out.println(al3.clear());
        System.out.println("--------------");
        System.out.println(al3.isEmpty());
        System.out.println("--------------");
        System.out.println(al3.size());
        System.out.println("--------------");
    }
}
