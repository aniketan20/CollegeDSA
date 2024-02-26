import java.math.*;

public class CountPrime {

    public static boolean isPrime(int n) {
        // for(int i = 2 ; i <= Math.sqrt(n) ; i++){
        //     if(n%i == 0)  return false;
        // }
        // return true;
        for(int i = 2 ; i <= n/i ; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1 ; i <= 100 ; i++){
            if(isPrime(i))  count++;
        }
        System.out.println(count);
    }
}
