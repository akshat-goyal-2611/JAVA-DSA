class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        
        HashSet<Integer> rd = new HashSet<>();
        HashSet<Integer> ld = new HashSet<>();
        HashSet<Integer> c = new HashSet<>();
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        ArrayList<Integer> curr = new ArrayList<>();
        
        solve(res, 0, rd, ld, c, curr, n);
        
        return res;
        
    }
    
    public void solve( ArrayList<ArrayList<Integer>> res, int row,
     HashSet<Integer> rd,  HashSet<Integer> ld,  HashSet<Integer> c,
     ArrayList<Integer> curr, int n){
         
         if(row == n){
             
             res.add(new ArrayList<>(curr));
             return;
         }
         
         for(int col = 0; col < n; col++){
             
             if(canPlaceQueen(row, col, rd, ld, c)){
                 
                 rd.add(row+col);
                 ld.add(row-col);
                 c.add(col);
                 
                 curr.add(col+1);
                 
                 solve(res, row+1, rd, ld, c, curr, n);
                 
                 rd.remove(row+col);
                 ld.remove(row-col);
                 c.remove(col);
                 
                 curr.remove(curr.size()-1);
             }
         }
     }
     
     public boolean canPlaceQueen(int row, int col, HashSet<Integer> rd,  HashSet<Integer> ld,  HashSet<Integer> c){
         
         
         if(c.contains(col)) return false;
         if(rd.contains(row+col)) return false;
         if(ld.contains(row-col)) return false;
         
         return true;
     }
}
