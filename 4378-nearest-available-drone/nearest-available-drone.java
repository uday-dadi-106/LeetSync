class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
      int ans=-1;
      int min=Integer.MAX_VALUE;
      for(int i=0;i<drones.length;i++){
         int ope=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
         if(ope<=drones[i][2]&&ope<min){
            min=ope;
            ans=i;
         }
      }  
      return ans;
    }
}