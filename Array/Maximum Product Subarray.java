class Solution {
    int maxProduct(int[] arr) {
        
        int n = arr.length;
        
        int preProd = 1, suffProd = 1;
        int maxProd = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            
            preProd *= arr[i];
            suffProd *= arr[n-i-1];
            
            maxProd = Math.max(maxProd, Math.max(preProd, suffProd));
            
            if(preProd == 0) preProd = 1;
            if(suffProd == 0) suffProd = 1;
        }
        
        return maxProd;
    }
}
