import java.util.*;
public class pr03 {
    public static void findMaxProfit(int arr[]){
        int minStockPrice=Integer.MAX_VALUE;
        int minStockPriceIndex=0;
        int maxStockPrice=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minStockPrice){
                minStockPrice=arr[i];
                minStockPriceIndex=i;
            }
        }

        for(int j=minStockPriceIndex;j<arr.length;j++){
            if(arr[j]>maxStockPrice){
                maxStockPrice=arr[j];
            }
        }

    System.out.println(maxStockPrice-minStockPrice);        
        
    }
    public static void main(String[] args) {
        int arr[]={7, 6, 4,  3, 1, 4};
        findMaxProfit(arr);
    }
}
