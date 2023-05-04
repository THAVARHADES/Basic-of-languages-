import java.util.*;
class ReverseNumber{
    static int reversenumber(int num){
        int digit=0;
        int rev=0;
        while(num!=0){
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return rev;
    }
}
class Day2Class2{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number which is to be reversed");
        int num=scan.nextInt();
        int rev=ReverseNumber.reversenumber(num);
        System.out.println("Number after reverse");
        System.out.println(rev);
    }
}