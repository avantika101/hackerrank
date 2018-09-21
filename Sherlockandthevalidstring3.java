static String isValid(String s) {
    int val=0;
    boolean flag=true ;
    int count=0;
    
    HashMap<Character,Integer> hm= new HashMap(26);
    for(char c:s.toCharArray()){
        if(hm.containsKey(c)){
            int val1=hm.get(c);
            hm.put(c,++val1);
        }
        else hm.put(c,1);
        val=hm.get(s.charAt(0));
        
    }
    for(Integer i:hm.values()){
        if(i==val){
            count++;
            continue;
        }else if((Math.abs(i-val)==1 || i-1==0)&& flag){
            flag=false;
            count++;
        }
    }
        if(count==hm.size())
            return "YES";
        else
            return "NO";
}