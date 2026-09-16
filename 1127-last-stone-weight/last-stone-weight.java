class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> q=new PriorityQueue<Integer>(Collections.reverseOrder());
       for(int n:stones){
        q.offer(n);
       }
       while(q.size()>1){
        int y=q.remove();
        int x=q.remove();
        if(x!=y){
            q.offer(y-x);
        }
        if(q.isEmpty()){
            return 0;
        }
       }
       return q.poll();
    }
}