class Solution {
    public int[] sortEvenOdd(int[] nums) {
     ArrayList<Integer> even=new ArrayList<Integer>();
     ArrayList<Integer> odd=new ArrayList<Integer>();
     for(int k=0;k<nums.length;k++){
        if(k%2==0){
            even.add(nums[k]);
        }else{
           odd.add(nums[k]); 
        }
     }
     Collections.sort(even);
     Collections.sort(odd);
     int ans[]=new int[nums.length];
     int e=0;
     int o=odd.size()-1;
     for(int i=0;i<nums.length;i++){
        if(i%2==0){
            ans[i]=even.get(e);
            e++;
        }else{
            ans[i]=odd.get(o);
            o--;
        }
     }
     return ans;
    }
}