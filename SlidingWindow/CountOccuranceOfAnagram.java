

/**
 * CountOccuranceOfAnagram
 */
import java.util.*;

public class CountOccuranceOfAnagram {

    /*Time Complexity : O(str.length()*pattern.length())
     */
    public static int countOccurance1(String str, String pattern){
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++){
            boolean flag = true;
            for(int j = 0; j < pattern.length() ; j++){
                int x = i + j;
                if(x >= str.length()){
                    flag = false;
                    break;
                }
                if(!pattern.contains(""+str.charAt(x))){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }

    public static int countOccurance2(String str, String pattern){
        int count = 0;
        HashMap<Character, Integer> freqstr = new HashMap<Character, Integer>();
        HashMap<Character, Integer> freqpat = new HashMap<Character, Integer>();
        for(char c : pattern.toCharArray()){
            freqpat.put(c, freqpat.getOrDefault(c,0)+1);
        }

        for(int i = 0 ; i < str.length() ; i++){
            char temp = str.charAt(i);
            freqstr.put(temp, freqstr.getOrDefault(temp,0)+1);
            if(i >= pattern.length()){
                char removedchar = str.charAt(i-pattern.length());
                if(freqstr.get(removedchar) == 1){
                    freqstr.remove(removedchar);
                }
                else{
                    freqstr.put(removedchar, freqstr.get(removedchar)-1);
                }
            }
            if(i >= pattern.length()-1 && freqstr.equals(freqpat)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str =  "BACTYUECABCNBGUCAB";
        String pattern = "ABC";
        System.out.println(countOccurance1(str,pattern));
        System.out.println(countOccurance2(str,pattern));
    }
}


// class Solution{
//     static int i = 1;
//     funcction (int n){
//         if(n>=1){
//             System.out.print(i+" ");
//             i++;
//         }
//         function(n-1);
//     }
// }

