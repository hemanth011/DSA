class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int curr = 0 , ans = 0, n = arr.length;
        
        for(int i = 0 ; i<k;i++){
            curr += arr[i];
            ans = curr;
            
        }
        for(int i = k ; i < n; i++){
            curr -= arr[i - k]; 
            curr += arr[i];
            ans= Math.max(ans,curr);
            
        }
        return ans;
    }
}
