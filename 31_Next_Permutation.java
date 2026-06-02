class Solution {
    public void nextPermutation(int[] nums) {
        int m = nums.length;
        int k = -1;

        for(int i = m - 1; i > 0; i--) {
            if(nums[i] > nums[i - 1]) {
                k = i;
                break;
            }
        }

        
        if(k != -1) {
            int n = k;

            for(int j = m - 1; j >= k; j--) {
                if(nums[j] > nums[k - 1]) {
                    n = j;
                    break;
                }
            }

            int temp = nums[k - 1];
            nums[k - 1] = nums[n];
            nums[n] = temp;
        }
        int left = (k == -1) ? 0 : k;
        int right = m - 1;

        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
