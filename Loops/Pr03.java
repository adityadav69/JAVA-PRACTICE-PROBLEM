import java.util.*;

public class Pr03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to get the multiplication table");
        int number=sc.nextInt();
        int result;
        for(int i=1;i<=10;i++){
            result=number*i;
            System.out.println(""+i+"*" + number+ "="+result);
        }

    }
}
