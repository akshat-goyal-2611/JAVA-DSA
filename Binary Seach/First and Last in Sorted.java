class Solution {
    ArrayList<Integer> find(int arr[], int x) {
       
       int n = arr.length;
       
       // find Upper Bound
       int ub = -1;
       
       int s = 0, e = n-1;
       
       while(s <= e){
           
           int mid = s + (e-s)/2;
           
           if(arr[mid] == x) {
               ub = mid;
               e = mid-1;
               
           }else if(arr[mid] < x){
               s = mid+1;
           }
           else{
               e = mid-1;
           }
       }
       
       ArrayList<Integer> res = new ArrayList<>();
       
       if(ub == -1){
           
           res.add(-1);
           res.add(-1);
           return res;
       }else{
           res.add(ub);
       } 
       
       
       int lb = n;
       
       s = 0; e = n-1;
       
        while(s <= e){
           
           int mid = s + (e-s)/2;
           
           if(arr[mid] == x) {
               lb = mid;
               s = mid+1;
               
           }else if(arr[mid] > x){
            //   lb = mid;
               e = mid-1;
               
           }else{
               
               s = mid+1;
           }
       }
       
       res.add(lb);
       
       return res;
    }
}
