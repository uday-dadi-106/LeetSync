class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int ans[]=new int[arr1.length];
        int index=0;
        for(int j=0;j<arr2.length;j++){
            for(int i=0;i<arr1.length;i++){
                if(arr2[j]==arr1[i]){
                   ans[index]=arr1[i];
                   index++;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            boolean found=false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                   found=true;
                   break;
                }
            }
            if(!found){
                list.add(arr1[i]);
            }
        }
        Collections.sort(list);
        for(int n:list){
            ans[index]=n;
            index++;
        }
        return ans;
    }
}