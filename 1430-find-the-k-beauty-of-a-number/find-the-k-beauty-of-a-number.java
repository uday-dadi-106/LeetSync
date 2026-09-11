class Solution {
    public int divisorSubstrings(int num, int k) {
      int count=0;
      String s=Integer.toString(num);
      StringBuilder s1=new StringBuilder();
      for(int i=0;i<k;i++){
        char ch=s.charAt(i);
        s1.append(ch);
      }
      int n=Integer.parseInt(s1.toString());
      if(n!=0&&num%n==0){
        count++;
      }
      int i=0;
      int j=k;
      while(j<s.length()){
        s1.deleteCharAt(0);
        s1.append(s.charAt(j));
        n=Integer.parseInt(s1.toString());
        if(n!=0&&num%n==0){
          count++;
         }
         i++;
         j++;
      }
      return count;
    }
}