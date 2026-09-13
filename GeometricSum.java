import java.util.*;
public class GeometricSum{
    public static double sum(int k){
        if(k == 1){
            return 1;
        }
        
        return (1.0/Math.pow(2,k))+sum(k-1);
    }
    public static void main(String[] args){
        System.out.println("Sum of"+ 5 +"terms of gp is: "+ sum(5));
    }
}