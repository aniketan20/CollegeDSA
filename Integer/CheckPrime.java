import java.math.BigInteger;
import java.util.*;

public class CheckPrime {
    public static void main(String[] args) {
        int n = 5;
        BigInteger x = new BigInteger(""+n);
        if (x.isProbablePrime(1)) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
