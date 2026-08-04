class Solution {
    public int maxVowels(String s, int k) {
       int count=0;
       for(int i=0;i<k;i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch == 'e'||ch == 'i'||ch=='o'||ch=='u'){
            count++;
        }
       }
       int l=0;
       int r=k-1;
       int max=count;
       while(r<s.length()-1){
        char ch=s.charAt(l);
        if(ch=='a'||ch == 'e'||ch == 'i'||ch=='o'||ch=='u'){
            count--;
        }
        l++;
        r++;
        char c=s.charAt(r);
        if(c=='a'||c== 'e'||c=='i'||c=='o'||c=='u'){
            count++;
        }
        max=Math.max(count,max);
       }
       return max;
    }
}