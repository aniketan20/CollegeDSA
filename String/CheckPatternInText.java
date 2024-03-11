public class CheckPatternInText {
    public static void main(String[] args) {
        String pattern = "xyz";
        String text = "xyzxy";
        int hp = 0;
        for(int i = 0 ; i < pattern.length() ; i++){
            hp += (pattern.charAt(i) - 'a' + 1) * Math.pow(29,i);
        }
        
        int count = 0;
        for(int i = 0 ; i < text.length() - pattern.length() + 1 ; i++){
            int tp = 0;
            for(int j = 0 ; j < pattern.length() ; j++){
                tp += (text.charAt(i+j) - 'a' + 1) * Math.pow(29,j);
            }
            if(tp == hp){
                count++;
            }
        }

        System.out.println(count);
    }
}

// 10^9 + 7 is the greatest prime no. that int can store
// Rabin Karp
// multiply each char value by 29