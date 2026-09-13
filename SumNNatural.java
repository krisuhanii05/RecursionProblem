public class SumNNatural{
    public static int add(int n){
        if(n == 0)return 0;
        if(n == 1)return 1;
        return n + add(n-1);
    }
    public static void main(String[] args){
        System.out.println("Sum of natural numbers" + add(10));
    }
}