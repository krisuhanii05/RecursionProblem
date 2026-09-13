
public class FindLastIndex{
    public static int check(int[] arr , int target){
        return findLast(arr , target , arr.length-1);
    }
    public static int findLast(int arr[] , int target , int end){
        if(end== -1)return -1;
        if(arr[end] == target)return end;
        return findLast(arr , target ,end-1);
    }
    public static void main(String[] args){
        int arr[] = {10  , 20 , 30 , 20 , 10};
        System.out.println(check(arr , 20));
    }
}