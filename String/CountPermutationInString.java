import java.util.HashMap;

/**
 * CountPermutationInString
 */
public class CountPermutationInString {

    public static boolean compare(int bp[] , int ap[]){
        for(int i = 0 ; i < 26 ; i++){
            if(bp[i] != ap[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // String pattern = "abac";
        // String text = "abcaacbbccbaca";
        String pattern = "xyz";
        String text = "xyzxy";

        int pl = pattern.length();
        int tl = text.length();

        // HashMap<Character,Integer> hp = new HashMap<>();
        // for(int i = 0 ; i < pl ; i++) hp.put(pattern.charAt(i), hp.getOrDefault(pattern.charAt(i),0)+1);

        int count = 0;


        // for(int i = 0 ; i < tl - pl + 1;  i++){
        //     HashMap<Character,Integer> ht = new HashMap<>();
        //     for(int j = 0 ; j < pl ; j++){
        //         ht.put(text.charAt(i+j), ht.getOrDefault(text.charAt(i+j),0)+1);
        //     }
        //     if(hp.equals(ht)){
        //         count++;
        //     }
        // }


        // HashMap<Character,Integer> ht = new HashMap<>();
        // for(int i = 0 ; i < pl ; i++){
        //     ht.put(text.charAt(i), ht.getOrDefault(text.charAt(i),0)+1);
        // }
        // if(hp.equals(ht)){
        //     count++;
        // }

        // for(int i = pl ; i < tl ; i++){
        //     if(ht.containsKey(text.charAt(i-pl))){
        //         ht.put(text.charAt(i-pl), ht.get(text.charAt(i-pl))-1);
        //         if(ht.get(text.charAt(i-pl)) == 0){
        //             ht.remove(text.charAt(i-pl));
        //         }
        //     }
        //     ht.put(text.charAt(i), ht.getOrDefault(text.charAt(i),0)+1);
        //     if(hp.equals(ht)){
        //         count++;
        //     }
        // }

        int ap[] = new int[26];
        for(char ch : pattern.toCharArray())    ap[ch - 'a']++;
        

        for(int i = 0 ; i <= tl - pl; i++){
            int bp[] = new int[26];
            for(int j = 0 ; j < pl ; j++){
                bp[text.charAt(i+j) - 'a']++;
            }
            if(compare(bp,ap)){
                count++;
            }
        }

        System.out.println("Number of permutations : " + count);
    }
}