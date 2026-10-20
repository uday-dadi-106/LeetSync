class Solution {
    public static void subset(int index,int target,int[] candidates,List<List<Integer>> list,ArrayList<Integer> ds){
       if(target==0){
        ArrayList<Integer> temp=new ArrayList<Integer>();
         temp.addAll(ds);
         list.add(temp);
         return ;
       }
        if(index==candidates.length||target<0){
            return;
        }
        if(candidates[index]<=target){
            ds.add(candidates[index]);
            subset(index,target-candidates[index],candidates,list,ds);
            ds.remove(ds.size()-1);
        }
        subset(index+1,target,candidates,list,ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<Integer>();
        subset(0,target,candidates,list,ds);
        return list;
    }
}