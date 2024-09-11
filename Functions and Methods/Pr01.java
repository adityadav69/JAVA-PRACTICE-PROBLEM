import java.util.*;
public class Pr01 {

    public static int Average(int a,int b,int c){
        int average;
        average=(a+b+c)/3;
        return average;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter the first number");
        x=sc.nextInt();
        System.out.println("Enter the Second number");
        y=sc.nextInt();
        System.out.println("Enter the Third number");
        z=sc.nextInt();
        System.out.println("Average of three number is "+ Average(x, y, z));

    }
}