class Solution {
    public double minimumAverage(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        PriorityQueue<Integer> pq1=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
            pq1.offer(nums[i]);
        }
        double min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length/2;i++){
            min=Math.min((pq.poll()+pq1.poll())/2.0,min);
        }
        return min;
    }
}