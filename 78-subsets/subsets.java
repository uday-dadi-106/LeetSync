class Solution {
public static void genarate(int[] nums,int index,List<List<Integer>> list,ArrayList<Integer> current){
  if(index==nums.length){
    list.add(new ArrayList<>(current));
    return;
  }
  current.add(nums[index]);
  genarate(nums,index+1,list,current);
  current.remove(current.size()-1);
  genarate(nums,index+1,list,current);
}
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        ArrayList<Integer> current=new ArrayList<Integer>();
        genarate(nums,0,list,current);
        return list;
    }
}