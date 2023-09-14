class Solution {
    public int[] runningSum(int[] nums) {
        int s=nums[0];
        int ar[]=new int [nums.length];
        for(int i=0;i<nums.length-1;i++){
                nums[i]=s;
            s+=nums[i+1];
        }
        nums[nums.length-1]=s;
        return nums;
        
    }
}