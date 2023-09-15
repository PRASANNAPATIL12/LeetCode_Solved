class Solution {
    public int pivotIndex(int[] nums) {
 int s=0;
        for(int k:nums){
          s+=k;
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
          if(left==s-left-nums[i])return i;
          left+=nums[i];
        }
        return -1;
    }
}