import java.util.Arrays;

public class pattern02 {
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr, int i, int j)
    {
        while(i<j)
        {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) 
    {
        int[] arr ={1, 2, 3, 4, 5, 6};
        int n = arr.length; 
        int i = 0;
        int j = n-1;
        System.out.println(Arrays.toString(arr));
        while(i < j)
        {
            reverse(arr, i, j-1);
            System.out.println(Arrays.toString(arr));
            j--;
        }
        System.out.println(arr[0]);
    }
    
}