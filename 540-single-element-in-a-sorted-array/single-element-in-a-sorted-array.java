class Solution {
    public int singleNonDuplicate(int[] nums) {
     /*   if(nums.length==1){
           return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]!=nums[i+1]){
                    return nums[i];
                }
            }else if(i==nums.length-1){
                if(nums[i]!=nums[i-1]){
                    return nums[i];
                }
            }else{
                if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]){
                    return nums[i];
                }
            }
        }
        return -1;*/
    /* if(nums.length==1){
        return nums[0];
     }   
     if(nums[0]!=nums[1]){
        return nums[0];
     }
     if(nums[nums.length-1]!=nums[nums.length-2]){
        return nums[nums.length-1];
     }
     int low=1,high=nums.length-2;
     while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]!=nums[mid+1]&&nums[mid]!=nums[mid-1]){
            return nums[mid];
        }


        if(((mid%2==0)&&nums[mid]==nums[mid+1])||(mid%2==1)&&(nums[mid]==nums[mid-1])){
            low=mid+1;
        }else{
            high=mid-1;
        }
     }
     return -1;*/
     int xor=0;
     for(int n:nums){
        xor=xor^n;
     }
    return xor;
    }
}