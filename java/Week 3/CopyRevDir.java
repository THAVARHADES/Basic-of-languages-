import java.util.*;

class CopyRevDir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Initializing an array
        System.out.println("Enter the number of rows");
        int n = scan.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.println("Enter the values" + " ");
            arr1[i] = scan.nextInt();
        }
        // Reversing the Array
        int arr2[] = new int[arr1.length];
        int j = arr2.length - 1;
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr2[j] = arr1[i];
            j--;
        }
        // Printing the first array
        System.out.print("Array Content are 1 ");
        System.out.println();
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println(" ");
        // Reverse Copying the Array
        System.out.print("Array Content are 2 ");
        System.out.println();
        for (int i = 0; i <= arr2.length - 1; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}