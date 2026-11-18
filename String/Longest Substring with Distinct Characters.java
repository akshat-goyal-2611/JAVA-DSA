class Solution {
    public int longestUniqueSubstr(String s) {
       
      int n = s.length();
      int i = 0, j = 0;
      
      int maxLen = 0;
      
        HashSet<Character> set = new HashSet<>();
      
      while(i < n){
          
          while(j < n){
              
              if(!set.contains(s.charAt(j))){
                  
                  set.add(s.charAt(j));
                  j++;
                  
              }else{
               
                  break;
              }
          }
 
          
          maxLen = Math.max(maxLen, set.size());
          
          if(j == n) break;
          
          set.remove(s.charAt(i));
          i++;
      }
      
      return maxLen;
        
    }
}
