import java.util.*;
class BankCode{
   /* public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int arr[][][]=new int[3][2][4];
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                for(int k=0;k<=arr[i][j].length-1;k++){
                    System.out.println("Bank Number"+i+"Enter Branch"+j+"Enter customer"+k);
                    arr[i][j][k]=scan.nextInt();
                }
            }
        }
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                for(int k=0;k<=arr[i][j].length-1;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
            }
        }
        System.out.println(" ");
    }*/
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int arr[][][]=new int[3][3][5];
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                for(int k=0;k<=arr[i][j].length-1;k++){
                    System.out.println("Enter the bank"+i+"Enter the branch"+j+"enter the customer"+k);
                    arr[i][j][k]=scan.nextInt();
                }
            }
        }
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[i].length-1;j++){
                for(int k=0;k<=arr[i][j].length-1;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
            }
            System.out.println(" ");
        }
    }   
}