class Solution {
    public boolean isWordExist(char[][] mat, String word) {
       
       int m = mat.length;
       int n = mat[0].length;
       
       int[] rA = {-1, 0, 1, 0};
       int[] cA = {0, 1, 0, -1};
       
       int[][] visited = new int[m][n];
       
       for(int i = 0;i < m; i++){
           for(int j = 0; j < n; j++){
                        
               if(mat[i][j] == word.charAt(0)){
                   
                   visited[i][j] = 1;
                   boolean flag = solve(i, j, 0, mat, visited, rA, cA, word);
                    
                    visited[i][j] = 0;
                   if(flag) return true;
               }
           }
       }
       
       return false;
        
    }
    
    public boolean solve(int row, int col, int idx, char[][] mat,
    int[][] visited, int[] rA, int[]cA, String word){
        
        // if(row == mat.length || col == mat[0].length) return false;
        
        if( idx == word.length()-1){
            return true;
        }
        
        for(int i = 0; i < 4; i++){
            
            int r = row + rA[i];
            int c = col + cA[i];
       
            
            if(isValid(r, c, mat, visited, word.charAt(idx+1))){
                
                visited[r][c] = 1;
                
                boolean flag = solve(r, c, idx+1, mat, visited, rA, cA, word);
                
                visited[r][c] = 0;
                
                if(flag) return true;
            }
        }
        
        return false;
    }
    
    public boolean isValid(int r, int c, char[][] mat, int[][] visited,
    char ch){
        
        return (r >= 0 && r < mat.length && c >= 0 && c < mat[0].length
        && visited[r][c] == 0 && mat[r][c] == ch);
    }
}
