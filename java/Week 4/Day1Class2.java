import java.util.*;
class Day1Class2{
    public static void main(String []args){
    /*    String s="Raja Ram Mohan Roy";
        System.out.println(s);
        s=s.replace("R","A");
        System.out.println(s);*/
        /*String s="Hello Hello Ram Hello";
        System.out.println(s);
        s=s.replaceAll("Hello","Hi");
        System.out.println(s);*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.nextLine();
        char cha[]=str.toCharArray();
        for(int i=0;i<=cha.length-1;i++){
            System.out.print(cha[i]+" ");
        }
    }
}