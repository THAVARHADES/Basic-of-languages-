import java.util.*;
class StringExample{
    String SubString(String str,int index){
        char arr1[]=str.toCharArray();
        char arr2[]=new char[arr1.length-index];
        int j=0;
        for(int i=index;i<=arr1.length-1;i++){
            arr2[j]=arr1[i];
            j++;
        }
        String res=new String(arr2);
        return res;
    }
    String SubString(String str,int startind,int endind){
        char arr1[]=str.toCharArray();
        char arr2[]=new char[endind-startind+1];
        int j=0;
        for(int i=startind;i<=endind;i++){
            arr2[j]=arr1[i];
            j++;
        }
        String str2=new String(arr2);
        return str2;
    }
}
class Day5Class1{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.nextLine();
        System.out.println("Enter the index from where substring has to be taken");
        int i=scan.nextInt();
         
        StringExample s=new StringExample();
        String substr1=s.SubString(str,i);
        System.out.println(substr1);  
            
        System.out.println("Enter the string");
        String a=scan.nextLine();
        System.out.println("Enter the starting index for the string");
        int si=scan.nextInt();
        System.out.println("Enter the ending index for the string");
        int ei=scan.nextInt();
        StringExample se=new StringExample();
        String str3=se.SubString(a,si,ei);
        System.out.println(str3);
    }
}