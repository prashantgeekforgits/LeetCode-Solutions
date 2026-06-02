class Solution {
    public int search(int[] nums, int target) {
        int k = 0;
        boolean found = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                found = true;
                k = i;
                break;
            }
        }
        if(!found){
            return -1;
        }
        return k;
        
        
    }
}