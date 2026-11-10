class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
       /* int a[]=new int[m*n];
        int i=0;
        for(int[] row:matrix){
            for(int num:row){
                a[i]=num;
                i++;
            }
        }
        Arrays.sort(a);
        int low=0,high=a.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==target){
                return true;
            }else if(a[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;*/
        int row=0,col=n-1;
        while(row<m&&col>=0){
            if(matrix[row][col]==target){
              return  true;
            }else if(matrix[row][col]>target){
                col--;
            }else{
               row++;
            }
        }
        return false;
    }
}