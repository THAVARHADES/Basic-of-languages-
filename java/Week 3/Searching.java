import java.util.*;

class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        // Intializing a array
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
            arr[i] = sc.nextInt();
        }
        // Entering the Key
        System.out.println("Enter the key");
        int key = sc.nextInt();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at" + arr[i]);
            } else {
                System.out.println("Key not Found");
            }
        }
    }
}
