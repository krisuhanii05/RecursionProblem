public class Summation2{
    public static void main(String[] args){
        System.out.println("Sum of "+10 +" natiral numbsers is:" + sum(10));
    }
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }
}