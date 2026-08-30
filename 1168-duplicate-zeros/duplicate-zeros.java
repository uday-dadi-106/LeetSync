class Solution {
    public void duplicateZeros(int[] arr) {
     
      LinkedList<Integer> list=new LinkedList<Integer>();
      for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            list.add(arr[i]);
        }else{
          list.add(arr[i]);
          list.add(arr[i]);  
        }
      }
        int j=0;
        for(int n:list){
            if(j==arr.length){
                break;
            }
            arr[j]=n;
            j++;
        }
        
        }
      }
    
    
