class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
      for(int i=0;i<n;i++){
        HashSet<Integer> list=new HashSet<Integer>();
        for(int j=0;j<n;j++){
             list.add(matrix[i][j]);
        }
        if(list.size()!=matrix.length){
            return false;
        }
      }  
      for(int i=0;i<n;i++){
        HashSet<Integer> list=new HashSet<Integer>();
        for(int j=0;j<n;j++){
             list.add(matrix[j][i]);
        }
        if(list.size()!=matrix.length){
            return false;
        }
      }
      return true;
    }
}