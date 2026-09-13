public class CalculatePower{
    public static int CalculatePower(int n , int k){
        if(n == 0)return 0;
        if(k == 0)return 1;
        return n*CalculatePower(n , k-1);
    }
    public static void main(String[] args){
        System.out.println("power of"+3 + "on number"+5+" :"+ CalculatePower(5,3));
    }
}