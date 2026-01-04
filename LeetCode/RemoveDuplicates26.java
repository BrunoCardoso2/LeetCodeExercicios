import java.util.Arrays;

class removeDuplicates26 {
    public int removeDuplicates(int[] nums) {

        int k = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
int k = new removeDuplicates26().removeDuplicates(nums);
System.out.println("k = " + k);  // Saída: 2
System.out.println(Arrays.toString(Arrays.copyOf(nums, k))); // Saída: [1, 2]

    }
}
