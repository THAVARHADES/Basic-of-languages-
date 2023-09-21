import java.util.*;
class DayFClassT{
    public static void main(String []args){
        String s1="Omkar";
        String s2=new String("OMKAR");
        if(s1==s2){
            System.out.println("Refence is equal");
        }
        else{
            System.out.println("Refence is unequal");
        }
        if(s1.equals(s2)){
            System.out.println("String is equal");
        }
        else{
            System.out.println("Sting is unequal");
        }
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("String are Equal");
        }
        else{
            System.out.println("Strinh are Unequal");
        }
    }
}