import java.util.HashMap;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = {0,0};
       
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if (nums[i] + nums[j] == target && i != j) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }
}

class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complemento = target - nums[i];

            if (map.containsKey(complemento)) {
                return new int[] {map.get(complemento), i};    
            }

            map.put(nums[i], i);
        }
        return new int[] {0,0}; 
    }

}