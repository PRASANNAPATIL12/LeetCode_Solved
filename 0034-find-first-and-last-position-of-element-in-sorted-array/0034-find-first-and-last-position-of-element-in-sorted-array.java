class Solution {
    public int[] searchRange(int[] nums, int target) {
      int res[]=new int [2];
        res[0]=findLeft(nums,target);
        res[1]=findRight(nums,target);
        return res;
            
        
    }
    public int findLeft(int []nums,int target){
        int index=-1;
        int start=0;
        int end=nums.length-1;
        
        
        while(start<=end){
        int mid=start +(end-start)/2;
        if(nums[mid]==target)index=mid;
            
        if(target<=nums[mid]){
            end=mid-1;
        }
            else{
                start=mid+1;
            }
            
        }
        return index;
        
        
    }
       public int findRight(int []nums,int target){
        int index=-1;
        int start=0;
        int end=nums.length-1;
        
        
        while(start<=end){
        int mid=start +(end-start)/2;
        if(nums[mid]==target)index=mid;
            
        if(target>=nums[mid]){
                start=mid+1;
        }
            else{
            end=mid-1;
            }
            
        }
        return index;
        
        
    }
    

    
    
}