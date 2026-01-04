
class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}


class Solution2 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = (start + end)/2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                start = middle + 1;
            }else {
                end = middle -1;
            }
        }
        return start;
    }
}