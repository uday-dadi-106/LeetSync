class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            HashSet<Integer> se=new HashSet<Integer>();
            for(int j=i;j<nums.size();j++){
                se.add(nums.get(j));
                int s=se.size();
                ans=ans+(s*s);
            }
        }
        return ans;
    }
}