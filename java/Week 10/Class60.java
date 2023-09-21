import java.util.*;
class Class60{
    public static void main(String []args){
        try{
            System.out.println("Connection Established");
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter 2 Number");
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=a/b;
            System.out.println(c);
            System.out.println("Enter array length");
            int len=scan.nextInt();
            int arr[]=new int[len];
            System.out.println("Enter an Element");
            int elem=scan.nextInt();
            System.out.println("Enter the position in which element have to be inserted");
            int pos=scan.nextInt();
            arr[pos]=elem;
        }
        catch(ArithmeticException e){
            System.out.println("Arithematic Exception by Integers");
        }
        catch(NegativeArraySizeException e){
            System.out.println("NeativeArraySize Exception please enter positive number");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Some Problem occured Inconvience regulated");
        }
        System.out.println("Connection Terminated");
    }
}