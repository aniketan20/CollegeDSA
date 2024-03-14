public class PrintSubSets {
    public static void main(String[] args) {

        String str = "ABC";
        int n = str.length();
        for(int i = 0 ; i < (1 << n) ; i++){
            for(int j = 0 ; j < n ; j++){
                if((i & (1 << j)) != 0){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
