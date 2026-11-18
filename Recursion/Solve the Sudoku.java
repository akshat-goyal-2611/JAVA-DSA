class Solution {
    public void solveSudoku(int[][] mat) {
      
      solve(0, 0, mat, mat.length);
        
    }
    
    public boolean solve(int row, int col, int[][] mat, int n){
        
        if(row == n) {
          
            return true;
            
        }    
        
        boolean flag;
        
        if(mat[row][col] == 0){
          
        for(int digit = 1; digit <= 9; digit++){
            
            if(canSetDigit(digit, mat, row, col, n)){
                
                mat[row][col] = digit;
                
                // System.out.println("cell"+row+", "+col+" = "+digit);
                
                if(col +1 < n) flag = solve(row, col+1, mat, n);
                else flag = solve(row+1, 0, mat, n);
                
                if(!flag) mat[row][col] = 0;
                else return true;
            }
        }
        
        return false;
        
        }
  
           
     else {  
         if(col +1 < n) flag = solve(row, col+1, mat, n);
        else flag = solve(row+1, 0, mat, n);
        
        return flag; 
         
     }  
       
    }
    
    public boolean canSetDigit(int digit, int[][] mat, int row, int col, int n){
        
        // check in row
        for(int j = 0; j < n; j++){
            if(mat[row][j] == digit) return false;
        }
        
        for(int i = 0; i < n; i++){
            if(mat[i][col] == digit) return false;
        }
        
        int i1 = (row/3)*3;
        int j1 = (col/3)*3;
        
        for(int i = i1; i < i1 + 3; i++){
            for(int j = j1; j < j1+3; j++){
                
                if(mat[i][j] == digit) return false;
            }
        }
        
        return true;
    }
}
