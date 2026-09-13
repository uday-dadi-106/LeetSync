class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
     ArrayList<Integer> list=new ArrayList<Integer>();
     int n=grid.length;
     int m=grid[0].length;
     for(int i=0;i<n;i++){
        if(i%2==0){
            for(int j=0;j<m;j++){
                list.add(grid[i][j]);
            }
        }else{
            for(int j=m-1;j>=0;j--){
                list.add(grid[i][j]);
            }
        }
    }
    for(int k=list.size()-1;k>=0;k--){
            if(k%2!=0){
               list.remove(k);
            }
        }
        return list;
}
}