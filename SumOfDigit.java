public class SumOfDigit{
    public static int sum(int a){
        if(a< 10)return a;
       int ans = suming(a); 
       if(ans < 10)return ans;
       else{
       return  suming(ans);
       }  
    }
    public static int suming(int a){
        return (a%10)+ sum(a/10);    
    }
    public static void main(String[] args){
        System.out.println("Sum of digits of number is:"+ sum(12345));
    }
}