class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
       /* int a[]=new int[m*n];
        int index=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[index]=matrix[i][j];
                index++;
            }
        }
        int low=0,high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==target){
                return true;
            }else if(a[mid]<target){
                  low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;*/
        int low=0;
        int high=(m*n)-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[mid/n][mid%n]==target){
                return true;
            }else if(matrix[mid/n][mid%n]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
}