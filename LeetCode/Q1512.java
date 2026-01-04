import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]) goodPairs ++; 
            }
        }
        return goodPairs;
    }
}

class Solution2 {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int goodPairs = 0;

        for (int num : nums) {
            if (countMap.containsKey(num)) {
                goodPairs += countMap.get(num); 
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        return goodPairs;
    }
}