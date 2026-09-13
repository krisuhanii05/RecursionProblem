
public class Multiply {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
		if(m == 0)return 0;
		if(n == 0)return 0;
		return m+multiplyTwoIntegers(m , n-1); 
	}
	public static void main(String[] args){
		System.out.println("15 * 14"+"="+multiplyTwoIntegers(15 , 14));
	}
}
