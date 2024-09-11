import java.util.*;
public class Pr03 {
    public static boolean checkPalindrome(int number){
        int numberRefrence=number;
        int reversed_number=0;
        while (number>0) {
            int lastDigit=number%10;
            reversed_number=(reversed_number*10)+lastDigit;
            number=number/10;
        }
        if(reversed_number==numberRefrence){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check either it is palindrome or not");
        int num=sc.nextInt();
        System.out.println(checkPalindrome(num));

    }
}
