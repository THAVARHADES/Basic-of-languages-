import java.util.*;

class CopingArraytoArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Initailing the array
        System.out.println("Enter the array length");
        int n = scan.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.println("Enter the values" + " ");
            arr1[i] = scan.nextInt();
        }
        // Bringing the second array
        int arr2[] = new int[n];
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = arr2[i];
        }
        // Printing the first array
        System.out.print("Array Content are 1 ");
        for (int k = 0; k <= arr1.length - 1; k++) {
            System.out.print(arr1[k] + " ");
        }
        // Printing the second array
        System.out.print("Array Content are 2 ");
        for (int l = 0; l <= arr2.length - 1; l++) {
            System.out.print(arr2[l] + " ");
        }
    }
}