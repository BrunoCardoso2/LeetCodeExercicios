import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];

        for (int i = 0; i < nums1.length; i++) {
            temp[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            temp[m + i] = nums2[i];
        }
            Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) {
                int j = i;
                while (j < temp.length - 1) {
                temp[j] = temp[j+1];
                }
            }
        }
        
        nums1 = temp;
    }
}
