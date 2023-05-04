// import java.util.*;

// class LinearSearch {
//     public void LinearSearch(int arr[], int n) {
//         for (int i = 0; i <= arr.length - 1; i++) {
//             if (arr[i] == n) {
//                 System.out.println(arr[i] + " " + "The Element at the psotiion");
//                 System.out.println(i);
//                 break;
//             } else {
//                 System.out.println("The element is not present");
//             }
//         }
//     }
// }

// class LS {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("ENter the arrray length");
//         int n = scan.nextInt();
//         int arr1[] = new int[n];

//         // Enter the value of arrays
//         for (int i = 0; i < arr1.length; i++) {
//             System.out.println("Enter the values of arrays");
//             arr1[i] = scan.nextInt();
//         }

//         // Enter the value of the key
//         System.out.println("ENter key to be Search");
//         int key = scan.nextInt();
//         LinearSearch o = new LinearSearch();
//         o.LinearSearch(arr1, key);
//     }
// }
// import java.util.*;

// class BS {
// public void binarysearch(int arr[], int n) {
// int j = 0;
// int k = arr.length;
// while (k > j) {
// int mid = (j + k) / 2;
// if (arr[mid] == n) {
// System.out.println("The key present in the postion" + mid);
// break;
// } else if (arr[mid] > n) {
// k = mid - 1;
// break;
// } else if (arr[mid] < n) {
// j = mid + 1;
// break;
// } else {
// System.out.println("Key not found");
// }
// }
// }
// }

// class LS {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// System.out.println("Enter the Array size");
// int n = scan.nextInt();
// int arr1[] = new int[n];
// for (int i = 0; i <= arr1.length - 1; i++) {
// System.out.println("Enter the values of Array");
// arr1[i] = scan.nextInt();
// }
// System.out.println("Enter the Key");
// int key = scan.nextInt();
// BS o = new BS();
// o.binarysearch(arr1, key);

// }
// }
import java.util.*;

class LS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the number");
        int num = scan.nextInt();
        int reversedNum = 0;
        int remainder;
        int originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num / 10;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        } else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
}