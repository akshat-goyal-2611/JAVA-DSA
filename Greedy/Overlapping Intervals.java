class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        
        Arrays.sort(arr, Comparator.comparingInt(a->a[0]));
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        ArrayList<Integer> ele = new ArrayList<>();
        ele.add(arr[0][0]);
        ele.add(arr[0][1]);
        
        res.add(ele);
        
        for(int i = 1; i < arr.length; i++){
            
            if(res.get(res.size()-1).get(0) <= arr[i][0] && arr[i][0] <= res.get(res.size()-1).get(1)){
                
                  ArrayList<Integer> ele1 = new ArrayList<>();
                 ele1.add(Math.min(res.get(res.size()-1).get(0), arr[i][0]));
                 ele1.add(Math.max(res.get(res.size()-1).get(1), arr[i][1]));
                 
                 res.set(res.size()-1, ele1);
            }else{
                
                ArrayList<Integer> ele1 = new ArrayList<>();
                 ele1.add(arr[i][0]);
                 ele1.add(arr[i][1]);
                 
                 res.add(ele1);
            }
        }
        
        
        return res;
    }
}
