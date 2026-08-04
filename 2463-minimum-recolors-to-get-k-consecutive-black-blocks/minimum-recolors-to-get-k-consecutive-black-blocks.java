class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white=0;
        int n=blocks.length();
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
               white++; 
            }
        }
        int l=0,r=k-1;
        int min=white;
        while(r<n-1){
           if(blocks.charAt(l)=='W'){
               white--; 
            } 
            l++;
            r++;
           if(blocks.charAt(r)=='W'){
               white++; 
            }  
            min=Math.min(min,white);
        }
        return min;
    }
}