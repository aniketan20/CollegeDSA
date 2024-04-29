public class GCD {

    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(Math.max(a-b,b),Math.min(a-b, b)); // time complexity : O (max(a,b))
    }
    
    // public static int gcd(int a, int b) {
    //     if (b == 0) {
    //         return a;
    //     }
    //     return gcd(b, a % b); 
    // }


    public static void main(String[] args) {
        int a = 24;
        int b = 21;
        System.out.println(Math.max(a,b),Math.min(a, b));
    }
}
