import java.util.*;
public class javatest
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number");
        int N = scanner.nextInt();
        
        if(N%2!=0){
            System.out.println("Weird");
        }
        else if(N%2==0 && N>=2 && N<=5){
            System.out.println("Not Weird");
        }
        else if(N%2==0 || N>=6 || N<=20){
            System.out.println("weird");
        }
        else if(N>=20){
            System.out.print("Not Weird");
        }
        scanner.close();
    }
}