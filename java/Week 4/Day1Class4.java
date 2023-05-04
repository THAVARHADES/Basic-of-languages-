import java.util.*;
class Day1Class4{
    public static void main(String []args){
        /*Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.nextLine();
        String strarr[]=str.split(" ");
        String revsent=" ";
        for(int i=0;i<=strarr.length-1;i++){
            String word=strarr[i];
            String revword=" ";
            for(int j=word.length()-1;j>=0;j--){
                revword=revword+word.charAt(j);
            }
            revsent=revsent+revword+" ";
        }
        System.out.print(revsent);*/
        /*Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=scan.nextLine();
        String strarr[]=str.split(" ");
        String revsent=" ";
        for(int i=strarr.length-1;i>=0;i--){
            revsent=revsent+strarr[i]+" ";
        }
        System.out.print(revsent);*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=scan.nextLine();
        char strarr[]=str.toCharArray();
        for(int i=0;i<=strarr.length-1;i++){
            if(strarr[i]==' '){
                strarr[i]='$';
            }
        }
        str=new String(strarr);
        System.out.print(str);
    }
} 