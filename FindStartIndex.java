public class FindStartIndex{
    public static int check(int[] arr , int target){
        return findStart(arr , target , 0);
    }
    public static int findStart(int arr[] , int target , int start){
        if(start== arr.length)return -1;
        
        if(arr[start] == target)return start;
        return findStart(arr , target , start +1);
    }
    public static void main(String[] args){
        int arr[] = {10  , 20 , 30 , 20 , 10};
        System.out.println(check(arr , 20));
    }
}