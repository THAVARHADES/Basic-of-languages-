import java.util.*;

//
class Array {
    // Initalizing the array
    private int arr[];
    private Scanner scan = new Scanner(System.in);

    // getting the array
    public Array(int n) {
        arr = new int[n];
    }

    // Inserting arrary
    public void insert() {
        System.out.println("Enter the position 0 to" + (arr.length - 1));
        int pos = scan.nextInt();
        System.out.println("Enter the Element value");
        int elem = scan.nextInt();
        arr[pos] = elem;
    }

    // Deleting array
    public void delete() {
        System.out.println("Enter the position to delete the element");
        int pos = scan.nextInt();
        System.out.println("Element delete is" + arr[pos]);
        arr[pos] = 0;
    }

    // Displaying array
    public void display() {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Day1Class1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // intilizing the array
        System.out.print("Enter the Array Length");
        int n = scan.nextInt();
        Array a = new Array(n);
        // looping for the arrays
        while (true) {
            System.out.println("Press 1  for Insertion");
            System.out.println("Press 2  for Deleting");
            System.out.println("Press 3  for Display");
            System.out.println("Any other Number for exiting");
            System.out.println("Enter your choice");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    a.insert();
                    break;
                case 2:
                    a.delete();
                    break;
                case 3:
                    a.display();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}