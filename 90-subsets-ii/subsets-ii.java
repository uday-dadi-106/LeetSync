class Solution {
    public static void subset(int index,int nums[],List<List<Integer>> list,ArrayList<Integer> ds){
        list.add(new ArrayList<>(ds));
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1]){
                continue;
            }
            ds.add(nums[i]);
            subset(i+1,nums,list,ds);
            ds.remove(ds.size()-1);
        }
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<Integer>();
        subset(0,nums,list,ds);
        return list;
    }
}