class Solution {
    public String longestCommonPrefix(String arr[]) {
       
       int n = arr.length;
       
       // find smallest string
       
       int smLen = Integer.MAX_VALUE;
       String smStr = "";
       
       for(int i = 0; i < n; i++){
           
           if(arr[i].length() < smLen){
               smLen = arr[i].length();
               smStr = arr[i];
           }
       }
       
       StringBuilder res = new StringBuilder();
       
       for(int i = 0; i < smLen; i++){
           
           char ch = smStr.charAt(i);
           
           int j;
           for( j = 0; j < n; j++){
               
               if(arr[j].charAt(i) != ch) break;
           }
           
           if(j != n) break;
           else{
               res.append(ch);
           }
       }
       
       return res.toString();
    }
}
