class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n=ransomNote.length();
        int m =magazine.length();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=ransomNote.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            
        }
        for(int i=0;i<m;i++){
            char ch=magazine.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        return fun(map1,map2);

    
}
public boolean fun(HashMap<Character,Integer> map1,
                   HashMap<Character,Integer> map2){
                      for(char ch : map1.keySet()){
                   if(map2.getOrDefault(ch,0)<map1.get(ch))

                  
                    return false;
                   }
                    return true;
                    
                   }
}
    
