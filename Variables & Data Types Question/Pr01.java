import java.util.*;
public class Pr01{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number");
        int b=sc.nextInt();
        System.out.println("Enter the Third Number");
        int c=sc.nextInt();
        int average;
        average=(a+b+c)/3;
        System.out.println("Average of three Number is "+average);

    }
}