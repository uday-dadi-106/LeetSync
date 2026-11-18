class Solution {
    public int numEquivDominoPairs(int[][] d) {
       int count=0;
       int row=d.length;
       for(int i=0;i<row-1;i++){
        for(int j=i+1;j<row;j++){
            int a=d[i][0];
            int b=d[i][1];
            int c=d[j][0];
            int e=d[j][1];
            if((a == c)&&(b == e)||((a == e)&&(b==c))){
              count++;
            }
        }
       }
     return count;
    }
}