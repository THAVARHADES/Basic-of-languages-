import java.util.*;
class DayFiveClassTwo{
    public static void main(String []args){
        /*StringBuffer s=new StringBuffer("KOD");
        System.out.println(s);
        s.append("NEST");
        System.out.println(s);*/
        /*StringBuffer s=new StringBuffer();
        System.out.println(s.capacity());
        s.append("Virat Kohli is a bastman");
        System.out.println(s.capacity());
        System.out.println(s.append("He plays for RCB"));
        System.out.println(s.capacity());*/
        /*StringBuffer s=new StringBuffer(35);
        System.out.println(s.capacity());*/
        /*StringBuffer s=new StringBuffer();
        s.ensureCapacity(60);
        System.out.println(s.capacity());*/
        StringTokenizer st=new StringTokenizer("Kodnest Technologies Pvt LTD");
        while(st.hasMoreTokens()==true){
            System.out.println(st.nextToken());
        }
        }
}