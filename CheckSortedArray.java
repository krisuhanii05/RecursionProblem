public class CheckSortedArray{
    public static boolean check(int arr[]){
        return Sorted(arr , 0);
    }
    public static boolean Sorted(int[] arr , int start){
        if(start == arr.length-1)return true;
        if(arr[start]> arr[start+1])return false;
        return Sorted(arr , start+1);
    }
    public static void main(String[] args){
        int arr[] = {10 , 20 , 60 , 40 , 50};
        System.out.print(check(arr));
    }
}