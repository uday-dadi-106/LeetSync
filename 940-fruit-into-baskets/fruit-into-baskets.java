class Solution {
    public int totalFruit(int[] fruits) {
        int maxLen=0;
        int n=fruits.length;
        int l=0,r=0;
        HashMap<Integer,Integer> list=new HashMap<Integer,Integer>();
        while(r<n){
            list.put(fruits[r],list.getOrDefault(fruits[r],0)+1);
          while(list.size()>2){
             list.put(fruits[l],list.getOrDefault(fruits[l],0)-1);
             if(list.get(fruits[l])==0){
                list.remove(fruits[l]);
             }
             l++;
          }
        maxLen=Math.max(maxLen,r-l+1);
            r++;

        }
         
    return maxLen;    
    }
}