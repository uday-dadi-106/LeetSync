class Solution {
    public int maximumProduct(int[] nums, int k) {
     PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
     for(int n:nums){
        pq.add(n);
     }
     while(k>0){
        int n=pq.poll();
        pq.add(n+1);
        k--;
     }
     long max=1;
     long mod=1000000007;
     while(!pq.isEmpty()){
        max=(max*pq.poll())%mod;
     }
     return (int)max;
    }
}