import java.util.*;
/*class class73{
    public static void main(String []args){
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        al.add(175);
        System.out.println(al);
        for(int i=0;i<=al.size()-1;i++){
            System.out.print(al.get(i)+" ");
        }
    }
}*/
/*class class73{
    public static void main(String []args){
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        al.add(175);
        System.out.println(al);
        for(Object x:al){
            System.out.print(x+" ");
        }
    }
}*/
/*class class73{
    public static void main(String []args){
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        al.add(175);
        System.out.println(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()==true){
            System.out.println(itr.next());
        }
    }
}*/
/*class class73{
    public static void main(String []args){
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        al.add(175);
        System.out.println(al);
        ListIterator itr=al.listIterator();
        while(itr.hasNext()==true){
            System.out.print(itr.next()+" ");
        }
    }
}*/
/*class class73{
    public static void main(String []args){
        LinkedList al=new LinkedList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        al.add(175);
        System.out.println(al);
        ListIterator litr=al.listIterator(al.size());
        while(litr.hasPrevious()==true){
            System.out.print(litr.previous()+" ");
        }
    }
}*/
/*class class73{
    public static void main(String []args){
        ArrayDeque al=new ArrayDeque();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        al.add(175);
        System.out.println(al);
        Iterator itr=al.descendingIterator();
        while(itr.hasNext()==true){
            System.out.println(itr.next()+" ");
        }
    }
}*/
class class73{
    public static void main(String []args){
        Vector al=new Vector();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        al.add(175);
        Enumeration e=al.elements();
        while(e.hasMoreElements()==true){
            System.out.print(e.nextElement()+" ");
        }
    }
}