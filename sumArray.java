public class SumArray{
    public static int sum(int []arr){
        return summation(arr , 0);
    }
    public static int summation(int []arr , int start){
        if(start == arr.length){
            return 0;
        }
        return arr[start]+summation(arr,start+1); 
    }
    public static void main(String[] args){
        int arr[] = {1 , 2 , 3 , 4 ,5};
        System.out.println("SUm of Array: "+ sum(arr));
    }
}