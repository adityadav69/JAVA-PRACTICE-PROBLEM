public class pr02 {

    public static int checkTarget(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,42,54,32,42,1};
        System.out.println(checkTarget(arr,42));
    }
}
