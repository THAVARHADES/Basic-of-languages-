import java.util.*;
class Searching{
    boolean checkS(String str){
        char ch[]=str.toCharArray();
        for(int i=0;i<=ch.length-1;i++){
            if(ch[i]=='S'||ch[i]=='s'){
                return true;
            }
        }
        return false;
    }
}
class Day3Class2{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String st=scan.nextLine();
        Searching s=new Searching();
        boolean res=s.checkS(st);
        if(res==true){
            System.out.println("String cointain S");
        }
        else{
            System.out.println("String doesn't Cointain S");
        }
    }
}