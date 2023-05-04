import java.util.*;

class SwapinArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of Array");
        int n = scan.nextInt();
        int arr[] = new int[n];

        // taking input in array

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter the value of Array");
            arr[i] = scan.nextInt();
        }

        // entering the array indexes to be swapped

        System.out.println("Enter Array need to be Swapped");
        int ind1 = scan.nextInt();
        int ind2 = scan.nextInt();

        // array before swapping

        System.out.println("Array content before swapping");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        // Swapping mechanism

        int help;
        help = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = help;

        // array after swapping

        System.out.println("Array content after swapping");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}