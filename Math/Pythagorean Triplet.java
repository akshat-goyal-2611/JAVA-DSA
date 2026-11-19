class Solution {
    boolean pythagoreanTriplet(int[] arr) {
       
       HashSet<Integer> set = new HashSet<>();
       
       int n = arr.length;
       int maxEle = 0;
       
       for(int i = 0; i < n; i++){
           set.add(arr[i]);
           maxEle = Math.max(maxEle, arr[i]);
       }
       
       int m = maxEle;
       
       int[] brr = new int[m];
       int len = brr.length;
       
        for(int i = 1; i < len-2; i++){
            
            if(set.contains(i)){
                
                for(int j = i+1; j < len; j++){
                    
                    if(set.contains(j)){
                        
                        int c = (int)(Math.sqrt(i*i+ j*j));
                    
                        if(c*c == (i*i + j*j) && set.contains(c)) return true;
                    }
                }
            }
        }
        
        return false;
    }
}
