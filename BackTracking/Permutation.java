public class Permutation {

    public static int fact(int n){
        int fact = 1;
        for(int i = 1 ; i <= n ; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        String str = "ABC";
        for(int i = 0 ; i < fact(str.length()) ; i++){
            
        }
    }
}