import java.util.*;

class StringExample {
    String subStr(String str, int index) {
        char arr1[] = str.toCharArray();
        char arr2[] = new char[arr1.length - index];
        int j = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            arr2[j] = arr1[i];
            j++;
        }
        String res = new String(arr2);
        return res;
    }

    String substr(String str, int startind, int endind) {
        char arr1[] = str.toCharArray();
        char arr2[] = new char[endind - startind + 1];
        int j = 0;
        for (int i = startind; i <= endind; i++) {
            arr2[j] = arr1[i];
            j++;
        }
        String res = new String(arr2);
        return res;
    }
}

class class2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scan.nextLine();
        System.out.println("Enter the Index");
        int i = scan.nextInt();

        StringExample s = new StringExample();
        String s1 = s.subStr(str, i);
        System.out.println(s1);

        System.out.println("Enter the String");
        String a = scan.nextLine();
        System.out.println("Enter the Starting Index");
        int si = scan.nextInt();
        System.out.println("Enter the Ending Index");
        int ei = scan.nextInt();
        String s2 = s.substr(a, si, ei);
        System.out.println(s2);
    }
}
