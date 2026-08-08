class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
      int l=0,r=1;
      int n=arr.length;
      int min=Integer.MAX_VALUE;
      while(r<n){
       int diff=arr[r]-arr[l];
       if(diff<min){
        min=diff;
        list.clear();
        ArrayList<Integer> li=new ArrayList<Integer>();
        li.add(arr[l]);
        li.add(arr[r]);
        list.add(li);
       }else if(diff==min){
          ArrayList<Integer> li=new ArrayList<Integer>();
        li.add(arr[l]);
        li.add(arr[r]);
        list.add(li);
       }
    l++;
    r++;
         
      }
return list;
    }
}