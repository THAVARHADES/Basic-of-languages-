
/*
 * class Student {
 * String name;
 * int age;
 * int wsn;
 * String gender;
 * 
 * void eat() {
 * System.out.println("Student eaten the food");
 * }
 * 
 * void sleep() {
 * System.out.println("Student gone to sleep");
 * }
 * 
 * void study() {
 * System.out.println("Student gone to sleep");
 * }
 * }
 * 
 * class class1 {
 * public static void main(String[] args) {
 * Student s1 = new Student();
 * Student s2 = new Student();
 * Student s3 = new Student();
 * s1.eat();
 * s2.sleep();
 * s3.study();
 * s1.sleep();
 * s2.sleep();
 * s3.sleep();
 * }
 * }
 */
/*
 * class Fan {
 * String brand;
 * String colour;
 * int cost;
 * 
 * void rotate() {
 * System.out.println("Fan will rotate");
 * }
 * 
 * void blowair() {
 * System.out.println("Fan will blow air");
 * }
 * }
 * 
 * class class1 {
 * public static void main(String[] args) {
 * Fan f1 = new Fan();
 * Fan f2 = new Fan();
 * Fan f3 = new Fan();
 * f1.rotate();
 * f2.blowair();
 * f3.rotate();
 * }
 * }
 */
/*
 * class class1 {
 * public static void main(String[] args) {
 * int arr[] = new int[8];
 * arr[0] = 35;
 * arr[1] = 35;
 * arr[2] = 35;
 * arr[3] = 35;
 * arr[4] = 35;
 * arr[5] = 35;
 * arr[6] = 35;
 * System.out.println(arr[0]);
 * System.out.println(arr[1]);
 * System.out.println(arr[2]);
 * System.out.println(arr[3]);
 * System.out.println(arr[4]);
 * System.out.println(arr[5]);
 * System.out.println(arr[6]);
 * }
 * }
 */
/*
 * class class1 {
 * public static void main(String[] args) {
 * int arr1[] = new int[5];
 * System.out.println(arr1.length);
 * }
 * }
 */
/*
 * class class1 {
 * public static void main(String[] args) {
 * int arr2[][] = new int[4][5];
 * System.out.println(arr2.length);
 * System.out.println(arr2[i].length);
 * }
 * }
 */
import java.util.*;

import javax.xml.transform.Source;

/*
 * class class1 {
 * public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in);
 * int arr[][] = new int[4][5];
 * for (int i = 0; i <= arr.length - 1; i++) {
 * for (int j = 0; j <= arr[i].length - 1; j++) {
 * System.out.print("Enter the value" + i + "Enter the marks");
 * arr[i][j] = scan.nextInt();
 * }
 * }
 * System.out.println("Array Contents are");
 * for(int i=0;i<arr.length-1;i++){
 * for(int j=0;j<=arr[i].length-1;j++){
 * System.out.print(arr[i][j]+" ");
 * }
 * }
 * }
 * }
 */
/*
 * import java.util.*;
 * 
 * class class1 {
 * public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in);
 * int arr[][] = new int[4][];
 * arr[0] = new int[2];
 * arr[1] = new int[4];
 * arr[2] = new int[3];
 * arr[3] = new int[5];
 * for (int i = 0; i <= arr.length - 1; i++) {
 * for (int j = 0; j <= arr[i].length - 1; j++) {
 * System.out.print("Enter marks of collage" + i + "marks of the student");
 * arr[i][j] = scan.nextInt();
 * }
 * }
 * for (int i = 0; i <= arr.length - 1; i++) {
 * for (int j = 0; j <= arr[i].length; j++) {
 * System.out.println("Thee value of" + i + "The value is" + j);
 * }
 * }
 * }
 * }
 */
// Jacked Arrays
/*
 * import java.util.*;
 * 
 * class class1 {
 * public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in);
 * int arr[][][] = new int[3][][];
 * arr[0] = new int[2][];
 * arr[1] = new int[4][];
 * arr[2] = new int[3][];
 * arr[0][0] = new int[3];
 * arr[0][1] = new int[2];
 * arr[1][0] = new int[2];
 * arr[1][1] = new int[3];
 * arr[1][2] = new int[3];
 * arr[1][3] = new int[3];
 * arr[2][0] = new int[2];
 * arr[2][1] = new int[2];
 * arr[2][2] = new int[2];
 * for (int i = 0; i <= arr.length - 1; i++) {
 * for (int j = 0; j <= arr[i].length - 1; j++) {
 * for (int k = 0; k <= arr[i][j].length - 1; k++) {
 * System.out.println("Enter the value of array" + i + " " + j + " " + k);
 * arr[i][j][k] = scan.nextInt();
 * }
 * }
 * }
 * System.out.println("The array value is");
 * for (int i = 0; i <= arr.length - 1; i++) {
 * for (int j = 0; j <= arr[i].length - 1; j++) {
 * for (int k = 0; k <= arr[i][j].length - 1; k++) {
 * System.out.print(arr[i][j][k] + " ");
 * }
 * }
 * }
 * }
 * }
 */
/*
 * import java.util.*;
 * 
 * class class1 {
 * public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in);
 * System.out.println("Enter array length");
 * int n = scan.nextInt();
 * int arr1[] = new int[n];
 * for (int i = 0; i <= arr1.length - 1; i++) {
 * arr1[i] = scan.nextInt();
 * }
 * 
 * System.out.println("Enter the value to be swapped from");
 * int int1 = scan.nextInt();
 * System.out.println("Enter the 2 number to be swapped");
 * int int2 = scan.nextInt();
 * System.out.println("Array content before swapping");
 * for (int i = 0; i <= arr1.length - 1; i++) {
 * System.out.println(arr1[i]);
 * }
 * int help = 0;
 * help = arr1[int1];
 * arr1[int1] = arr1[int2];
 * arr1[int2] = help;
 * System.out.println("Array Content after swapping");
 * 
 * for (int i = 0; i <= arr1.length - 1; i++) {
 * System.out.println(arr1[i]);
 * }
 * }
 * }
 */
import java.util.*;

/*
 * class class1 {
 * public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in);
 * System.out.println("Enter the size of array");
 * int n = scan.nextInt();
 * int arr1[] = new int[n];
 * for (int i = 0; i <= arr1.length - 1; i++) {
 * System.out.print("Enter array content at" + " " + i);
 * arr1[i] = scan.nextInt();
 * }
 * int arr2[] = new int[arr1.length];
 * int j = arr1.length;
 * for (int i = 0; i <= arr2.length - 1; i++) {
 * arr2[j] = arr1[i];
 * j--;
 * }
 * System.out.print("Array 1 Contents are");
 * for (int i = 0; i < arr1.length - 1; i++) {
 * System.out.println(arr1[i]);
 * }
 * System.out.println("Array 2 content are");
 * for (int k = 0; k <= arr2.length - 1; k++) {
 * System.out.println(arr2[k]);
 * }
 * }
 * }
 */
/*
 * class class1 {
 * public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in);
 * System.out.println("Enter array length");
 * int n = scan.nextInt();
 * int arr1[] = new int[n];
 * System.out.print("Enter the array content");
 * for (int i = 0; i <= arr1.length - 1; i++) {
 * System.out.print("Entet the array pos at" + i + " ");
 * arr1[i] = scan.nextInt();
 * }
 * System.out.println("The array contents are");
 * for (int i = 0; i <= arr1.length - 1; i++) {
 * System.out.print(arr1[i] + " ");
 * }
 * System.out.println("Enter the search key");
 * int key = scan.nextInt();
 * for (int i = 0; i <= arr1.length - 1; i++) {
 * if (arr1[i] == key) {
 * System.out.println("The key is present at" + " " + i);
 * break;
 * } else {
 * System.out.println("The key is not present at the position");
 * }
 * }
 * }
 * }
 */
/*
 * class class1 {
 * public static void main(String[] args) {
 * String s1 = "Raju";
 * String s2 = "Raju";
 * String s3 = new String("Omkar");
 * String s4 = new String("Omkar");
 * if (s1 == s2) {
 * System.out.println("Reference are equals");
 * } else {
 * System.out.println("Reference is not equal");
 * }
 * if (s1.equals(s2)) {
 * System.out.println("String are equals");
 * } else {
 * System.out.println("String are unequals");
 * }
 * if (s3 == s4) {
 * System.out.println("reference is equals");
 * } else {
 * System.out.println("refence is unequals");
 * }
 * if (s3.equals(s4)) {
 * System.out.println("String is equals");
 * } else {
 * System.out.println("String is not equal");
 * }
 * }
 * }
 */
/*
 * class class1 {
 * public static void main(String[] args) {
 * String s1 = "OMKAr";
 * String s2 = "omkar";
 * if (s1.equalsIgnoreCase(s2)) {
 * System.out.println("The String are equals");
 * } else {
 * System.out.println("String are unequal");
 * }
 * }
 * }
 */
/*
 * class class1 {
 * public static void main(String[] args) {
 * String s1 = "KOD";
 * String s2 = "NESt";
 * String s3 = "KOD" + "NEST";
 * String s4 = "KOD" + "NEST";
 * if (s3 == s4) {
 * System.out.println("Refence is equal");
 * } else {
 * System.out.println("Refence is unequal");
 * }
 * if (s3.equals(s4)) {
 * System.out.println("String are equals");
 * } else {
 * System.out.println("String are unequal");
 * }
 * }
 * }
 */
/*
 * class class1 {
 * public static void main(String[] args) {
 * String s1 = "Sachin";
 * String s2 = "Saurav";
 * if (s1.compareTo(s2) > 0) {
 * System.out.println("String 1 is greater");
 * } else if (s1.compareTo(s2) < 0) {
 * System.out.println("String 2 is greater");
 * } else {
 * System.out.println("Both the string are equal");
 * }
 * }
 * }
 */
/*
 * class class1 {
 * public static void main(String[] args) {
 * String s1 = new String("Kodnest Technologies");
 * System.out.println(s1);
 * System.out.println(s1.toUpperCase());
 * System.out.println(s1.toLowerCase());
 * System.out.println(s1.contains("Tech"));
 * System.out.println(s1.indexOf("d"));
 * System.out.println(s1.charAt(7));
 * System.out.println(s1.substring(7));
 * System.out.println(s1.substring(7, 11));
 * }
 * }
 */
/*
 * class class1 {
 * public static void main(String[] args) {
 * StringTokenizer st = new StringTokenizer("Kodnest Tokenizer PVT LTD");
 * while (st.hasMoreTokens() == true) {
 * System.out.println(st.nextToken());
 * }
 * }
 * }
 */

/*
 * class class1 {
 * public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in);
 * System.out.println("Enter the String");
 * String s1 = scan.nextLine();
 * char ch[] = s1.toCharArray();
 * for (int i = 0; i <= s1.length() - 1; i++) {
 * System.out.print(ch[i] + " ");
 * }
 * }
 * }
 */
/*class class1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = scan.nextLine();
        char ch[] = st.toCharArray();
        char ch2[] = new char[ch.length];
        int j = ch.length - 1;
        for (int i = 0; i <= ch.length - 1; i++) {
            ch2[j] = ch[i];
            j--;
        }
        String ch3 = new String(ch2);
        System.out.println(ch3);
    }
}*/
class class1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Eneter the String");
        String s = scan.nextLine();
        String strarr[] = s.split(" ");
        String revstr = "";
        for (int i = 0; i <= strarr.length - 1; i++) {
            String word = strarr[i];
            String revword = " ";
            for (int j = word.length() - 1; j >= 0; j--) {
                revword = revword + word.charAt(j);
            }
            revstr = revstr + revword + " ";
        }
        System.out.print(revstr);
    }
}