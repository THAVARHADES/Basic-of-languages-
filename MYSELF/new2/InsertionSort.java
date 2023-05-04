// import java.util.*;

// class IS {
// public void pla(int arr[]) {
// for (int i = 1; i < arr.length - 1; i++) {
// int current = arr[i];
// int j = -1;
// while (j >= 0 && arr[j] > current) {
// arr[j + 1] = current;
// j--;
// }
// arr[j + 1] = current;
// }
// }
// }

// class InsertionSort {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// System.out.println("Enter the size of array");
// int n = scan.nextInt();
// int arr1[] = new int[n];
// for (int i = 0; i <= arr1.length - 1; i++) {
// System.out.println("Enter the element of the array is");
// arr1[i] = scan.nextInt();
// }
// System.out.println("Array before sorting");
// for (int i = 0; i <= arr1.length - 1; i++) {
// System.out.print(arr1[i] + " ");
// }
// System.out.println();
// IS o = new IS();
// o.pla(arr1);
// System.out.println("Array after sorting");
// for (int i = 0; i <= arr1.length - 1; i++) {
// System.out.print(arr1[i] + " ");
// }
// }
// }
