class Solution {
    public int thirdMax(int[] nums) {
     PriorityQueue<Integer> q=new PriorityQueue();
     HashSet<Integer> h=new HashSet<Integer>();
     for(int n:nums){
        if(h.contains(n)){
            continue;
        }
        q.offer(n);
        h.add(n);
        if(q.size()>3){
            q.remove();
        }
     }
     if(q.size()<3){
        while(q.size()>1){
            q.remove();
        }
     }
    return q.peek();
    }
}