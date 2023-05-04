import java.util.*;

class BInarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the to be Found");
        int key = sc.nextInt();
        int first = 0, last = arr.length - 1;
        while (last >= first) {
            int mid = ((first + last) / 2);
            if (mid == key) {
                System.out.println(arr[mid]);
            }

            else if (key > arr[mid]) {
                first = arr[mid];
            } else {
                last = arr[mid];
            }
        }
        System.out.println("key not Found");
    }
}