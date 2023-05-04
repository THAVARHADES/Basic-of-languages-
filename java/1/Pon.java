import java.util.*;

class Pon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][][] = new int[3][][];
        arr[0] = new int[2][];
        arr[1] = new int[2][];
        arr[2] = new int[2][];
        arr[0][0] = new int[2];
        arr[0][1] = new int[3];
        arr[1][0] = new int[2];
        arr[1][1] = new int[6];
        arr[2][0] = new int[2];
        arr[2][1] = new int[6];
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                for (int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.println("enter the row" + i + " " + j + " " + k);
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }
        System.out.println("the array is");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                for (int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
            }
        }
        // System.out.println("thavar godne");
    }
}