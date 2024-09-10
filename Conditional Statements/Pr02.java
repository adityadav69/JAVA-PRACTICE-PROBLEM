import java.util.*;
public class Pr02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double temp ;
        temp=sc.nextDouble();
        if (temp >= 100) {
            System.out.println("You have fever");
        } 
        else {
            System.out.println("You have not fever");
        }

    }
}