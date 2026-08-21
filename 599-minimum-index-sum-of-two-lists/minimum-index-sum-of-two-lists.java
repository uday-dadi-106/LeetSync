class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
     HashMap<String,Integer> firest=new HashMap<String,Integer>();
     HashMap<String,Integer> second=new HashMap<String,Integer>();
     int firestindex=0;
     for(String s:list1){
        firest.put(s,firestindex);
        firestindex++;
     }
     int secondindex=0;
     for(String s:list2){
        second.put(s,secondindex);
        secondindex++;
     }
    ArrayList<String> store=new ArrayList<String>();
    int min=Integer.MAX_VALUE;
    for(String s:firest.keySet()){
        if(second.containsKey(s)){
            int sum=firest.get(s)+second.get(s);
            if(sum<min){
                min=sum;
                store.clear();
                store.add(s);
            }else{
                if(sum==min){
                    store.add(s);
                }
            }

        }
    }
    String ans[]=new String[store.size()];
    int i=0;
    for(String s:store){
        ans[i]=s;
        i++;
    }
    return ans;
    }
}