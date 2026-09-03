class Solution {
    static void swap(int i,int j,int nums[]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int[] sortArrayByParity(int[] nums) {
       int index=-1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]%2!=0){
            index=i;
            break;
        }
       } 
       if(index==-1){
        return nums;
       }
       for(int j=index+1;j<nums.length;j++){
        if(nums[j]%2==0){
            swap(index,j,nums);
            index++;
        }
       }
       return nums;
    }
}