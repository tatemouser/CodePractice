package dataTypes;

public class MergeArray {
   public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp1 = new int[m];
        int mainindex = m + n - 1;  // Index for merging in nums1
        int num1index = m - 1;      // Index for iterating through nums1
        int num2index = n - 1;      // Index for iterating through nums2

        while (num1index >= 0 && num2index >= 0) {
            if (nums1[num1index] > nums2[num2index]) {
                nums1[mainindex] = nums1[num1index];
                num1index--;
            } else {
                nums1[mainindex] = nums2[num2index];
                num2index--;
            }
            mainindex--;
        }

        // Copy remaining elements from nums2 if any
        while (num2index >= 0) {
            nums1[mainindex] = nums2[num2index];
            num2index--;
            mainindex--;
        }
        
        return nums1;
    }
}
