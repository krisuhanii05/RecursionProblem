public class fact1{
    public static void main(String[] args){
        System.out.println("FActorial of 6 is:" + fact(6));
    }
    public static int fact(int n){
        if(n ==0){
            return 1;
        }
        return n * fact(n-1);
    }
}