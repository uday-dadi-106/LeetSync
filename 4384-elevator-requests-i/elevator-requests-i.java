class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time=0;
        int current=0;
       for(int i=0;i<requests.length;i++){
         time=time+Math.abs(current-requests[i]);
         current=requests[i];
       } 
       return time;
    }
}