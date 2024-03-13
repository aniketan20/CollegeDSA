public class Power {

    // public static int power(int a,int b){
    //     if(b == 1){
    //         return a;
    //     }
    //     return a * power(a, b-1);
    // } 
    public static int power(int a,int b){
        if(b == 1){
            return a;
        }
        if(b%2 == 0) return power(a, b/2) * power(a, b/2);
        else return a * power(a, b/2) * power(a, b/2);
    } 

    public static void main(String[] args) {
        System.out.println(power(3, 5));
    }
}
