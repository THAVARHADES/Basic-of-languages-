import java.util.*;

class Pattern20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("   ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print(" @ ");
            }
            System.out.println(" ");
        }
    }
}