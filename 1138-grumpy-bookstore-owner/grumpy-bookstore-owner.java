class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int s=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                s=s+customers[i];
            }
        }
        int extra=0;
        for(int i=0;i<minutes;i++){
             if(grumpy[i]==1){
                extra=extra+customers[i];
            }
        }
        int min=extra;
        int l=0,r=minutes-1;
        int n=customers.length;
        while(r<n-1){
            if(grumpy[l]==1){
                extra=extra-customers[l];
            }
            l++;
            r++;
            if(grumpy[r]==1){
                extra=extra+customers[r];
            }
            min=Math.max(min,extra);
        }
   return min+s;
    }
}