import java.util.*;
public class Pr05 {

    public static int sumOfDigit(int number){
        System.out.println("Function......");
        int sum=0;
        while (number>0) {
            int lastDigit=number%10;
            sum+=lastDigit;
            number/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Number");
      int num=sc.nextInt();

      System.out.println("Sum of the digit is "+ sumOfDigit(num));
    }
   
}
