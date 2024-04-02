class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length < 2) {
            return nums.length;
        }

        HashMap<Integer,Boolean> hm = new HashMap<>();
        for(int i : nums)   hm.put(i,false);

        int maxLen = 0;
        
        for(int num : nums){
            if(hm.get(num)) continue;
            int currLen = 1;
            int left = num - 1;
            int right = num + 1;
            while(hm.containsKey(left) && !hm.get(left)){
                currLen++;
                hm.put(left,true);
                left--;
            }
            while(hm.containsKey(right) && !hm.get(right)){
                currLen++;
                hm.put(right,true);
                right++;
            }
            maxLen = currLen > maxLen ? currLen : maxLen;
        }
        return maxLen;
    }
}