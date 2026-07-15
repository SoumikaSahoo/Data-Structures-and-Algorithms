class Solution {
    public String mergeAlternately(String word1, String word2) {
     StringBuilder ans=new StringBuilder();
     int i=0;
     int j=0;
        int a=word1.length();
        int b=word2.length();
        while(i<a && j<b){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(j));
            i++;
            j++;


         }
         while(i<a){
            ans.append(word1.charAt(i));
            i++;
         }
          while(j<b){
            ans.append(word2.charAt(j));
            j++;
         }


return ans.toString();

    }
}