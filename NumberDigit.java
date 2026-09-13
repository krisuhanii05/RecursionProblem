public class NumberDigit{
    public static int number(int n){
        if(n == 0)return 1;
       if(n <10) return 1; 
        return 1 + number(n/10);
    }
    public static void main(String[] args){
        System.out.println("Count of Digit:"+number(123450));
        System.out.println("Count of Digit:"+number(0));
    }
}