import java.math.BigInteger; 
import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(BigInteger.valueOf(sc.nextInt())));
    }
    
    static BigInteger factorial(BigInteger N) 
    { 
        if(N == BigInteger.valueOf(0)){
            return BigInteger.valueOf(1);
        }
        return N.multiply(factorial(N.subtract(BigInteger.valueOf(1))));  
    } 
}