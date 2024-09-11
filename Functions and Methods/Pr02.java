import java.util.*;
public class Pr02 {

    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num=sc.nextInt();
        if(isEven(num)){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

    }
}
