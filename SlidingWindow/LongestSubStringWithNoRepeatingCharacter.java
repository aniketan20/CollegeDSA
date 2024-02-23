import java.util.HashSet;

public class LongestSubStringWithNoRepeatingCharacter {
    public static void main(String[] args) {
        String str = "ABCDABCGHIABD";

        int left = 0;
        int right = 0;
        int max = 0;
        int resStart = 0;
        int resEnd = 0;

        HashSet<Character> chars = new HashSet<>();

        while (right < str.length()) {
            if (!chars.contains(str.charAt(right))) {
                chars.add(str.charAt(right));
                int currentLength = right - left + 1;
                if (currentLength > max) {
                    max = currentLength;
                    resStart = left;
                    resEnd = right;
                }
                right++;
            } else {
                chars.remove(str.charAt(left));
                left++;
            }
        }

        System.out.println("Length of the longest substring: " + max);
        System.out.println("Longest substring: " + str.substring(resStart, resEnd + 1));
    }
}
