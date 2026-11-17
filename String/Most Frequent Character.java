class Solution {
    public static char getMaxOccuringChar(String s) {
        
        int maxF = Integer.MIN_VALUE;
        
        int[] freq = new int[26];
        
        for(char ch : s.toCharArray()){
            
            freq[ch-'a']++;
            
            maxF = Math.max(maxF, freq[ch-'a']);
        }
        
        for(int i = 0; i < 26; i++){
            
            if(freq[i] == maxF){
                return (char)('a'+i);
            }
        }
        
        return '0';
    }
}
