public class pr01 {

    public static boolean checkDuplet(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 5, 21, 13};
        if(checkDuplet(arr)){
            System.out.println("Duplet exists");
        }
        else{
            System.out.println("Not found");
        }
    }
}
