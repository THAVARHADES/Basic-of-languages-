import java.util.Scanner;

class NewScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = scan.nextInt();
        System.out.println("Number is :" + a);
    }
}