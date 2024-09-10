import java.util.*;
public class Pr03{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost of Pencil");
        float cost1=sc.nextFloat();
        System.out.println("Enter the cost of Pen");
        float cost2=sc.nextFloat();
        System.out.println("Enter the cost of Eraser");
        float cost3=sc.nextFloat();
        float Bill;
        float BillWithGst;
        Bill=(cost1+cost2+cost3);
        BillWithGst=Bill+(Bill*18)/100;
        System.out.println("Bill of Your pen pencil and eraser is "+Bill);
        System.out.println("Bill of Your pen pencil and eraser is "+BillWithGst);

    }
}