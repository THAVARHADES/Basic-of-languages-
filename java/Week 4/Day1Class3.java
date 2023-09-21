import java.util.*;
class Day1Class3{
    public static void main(String []args){
        /*Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.nextLine();
        char arr[]=str.toCharArray();
        char arr2[]=new char[arr.length];
        int j=arr.length-1;
        for(int i=0;i<=arr.length-1;i++){
            arr2[j]=arr[i];
            j--;
        }
        str=new String(arr2);
        System.out.println(str);*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scan.nextLine();
        char arr[]=str.toCharArray();
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        char arr2[]=new char[arr.length];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==' '){
                arr2[i]=arr[i]; 
            }
        }
        int j=arr.length-1;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=' '){
                if(arr2[j]==' '){
                    j--;
                }
            arr2[j]=arr[i];
            j--;
            }
        }
        str=new String(arr2);
        System.out.print(str);
    }
}