class Solution {
    public int kokoEat(int[] arr, int k) {
       
       int s = 1;
       int n = arr.length;
       
       int e = 0;
       
       for(int ele : arr){
           
           e = Math.max(e, ele);
       }
       int ans = 0;
       
       while(s <= e){
           
           int mid = s+(e-s)/2;
           
           if(isValid(mid, k, arr)){
               
               ans = mid;
               e = mid-1;
           }else{
               
               s = mid+1;
           }
       }
       
       return ans;
    }
    
    public boolean isValid(int cand, int  k, int[] arr){
        
        int time = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            int val = (arr[i]%cand);
            
            if(val == 0){
                
                time += (arr[i]/cand);
            }else{
                time += (arr[i]/cand)+1;
            }
        }
        
        return time <= k;
        
    }
}
