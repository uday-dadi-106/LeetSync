class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> list = new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            list.put(n,list.getOrDefault(n,0)+1);
        }
        for(int x:list.keySet()){
            if(list.get(x)>nums.length/3){
                ans.add(x);
            }
        }
       return ans;
    }
}