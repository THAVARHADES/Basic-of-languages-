/*import java.util.*;
class class70{
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
        System.out.println("al1--->"+al2);
        System.out.println("---------------------------");
        al1.retainAll(al2);
        System.out.println("---------------------------");
        al1.add(200);
        System.out.println("---------------------------");
        al1.add(2,999);
        System.out.println("al1---->"+al1);
        System.out.println("---------------------------");
        al1.set(2,1000);
        System.out.println("al1---->"+al1);
    }
}*/
import java.util.*;
/*class class70{
    public static void main(String []args){
        ArrayDeque aq=new ArrayDeque();
        aq.add(100);
        aq.add(200);
        aq.add(300);
        aq.addFirst(999);
        aq.addLast(999);
        System.out.println(aq);
    }
}*/
class class70{
    public static void main(String []args){
        LinkedList ll=new LinkedList();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.addFirst(1999);
        ll.addLast(1999);
        ll.add(2,1000);
        System.out.println(ll);
    }
}