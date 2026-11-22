class Solution {
    int floorSqrt(int n) {
        
        int s = 0, e= n;
        
        while(s <= e){
            
            int mid = s +(e-s)/2;
            
            if(mid*mid == n) return mid;
            else if(mid*mid > n){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        
        return e;
    }
}
