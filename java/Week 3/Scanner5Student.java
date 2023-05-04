import java.util.*;

class Scanner5Student {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter marks of Student 0");
        arr[0] = scan.nextInt();
        System.out.println("Enter marks of Student 1");
        arr[1] = scan.nextInt();
        System.out.println("Enter marks of Student 2");
        arr[2] = scan.nextInt();
        System.out.println("Enter marks of Student 3");
        arr[3] = scan.nextInt();
        System.out.println("Enter marks of Student 4");
        arr[4] = scan.nextInt();
        System.out.println("Array Content");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        /*
         * for(int i=0;i<=arr.length-1;i++){
         * System.out.println("Enter the marks"+i);
         * arr[i]=scan.nextInt();
         * }
         * for(int i=0;i<=arr.length;i++){
         * System.out.println("values are"+arr[i]);
         * }
         */
    }
}