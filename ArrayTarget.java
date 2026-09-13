public class ArrayTarget{
    public static int Target(int[] arr , int target){
        return check(arr , target , 0);
    }
    public static int check(int[] arr , int target , int start){
        if(start == arr.length) return -1;
        if(arr[start] == target)return start+1;
        return check(arr , target , start+1);
    }
    public static void main(String []args){
        int arr[] = {1 , 2 , 3 , 4 , 5, 6};
        System.out.println(Target(arr , 4));
    }
}