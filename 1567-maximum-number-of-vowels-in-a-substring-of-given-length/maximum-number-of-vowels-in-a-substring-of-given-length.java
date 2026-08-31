class Solution {
    public int maxVowels(String s, int k) {
      int count=0;
      int n=s.length();
      for(int i=0;i<k;i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
        }
      }
      int max=count;
      int i=0;
      int j=k-1;
      while(j<n-1){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count--;
        }
        i++;
        j++;
        char ch1=s.charAt(j);
         if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'){
            count++;
        }
        max=Math.max(count,max);
      } 
      return max;
    }
}