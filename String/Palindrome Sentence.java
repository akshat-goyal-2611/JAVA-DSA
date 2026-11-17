class Solution {
    public boolean isPalinSent(String s) {
        
        int n = s.length();
        
        String str = s.toLowerCase();
        
        int i=0, j = n-1;
        
        while(i < j){
            
            while(i < j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }
            
            while(i < j && !Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }
            
            if(i < j){
                if(str.charAt(i) != str.charAt(j)) return false;
                i++; j--;
            }
        }
        
        return true;
    }
}
