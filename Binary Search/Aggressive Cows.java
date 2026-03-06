class Solution {
    
    static boolean isPossible(int[] arr, int k, int minDist) {
    int cows = 1;
    int lastPlaced = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] - lastPlaced >= minDist) {
            cows++;
            lastPlaced = arr[i];
        }
        if (cows >= k) return true;
    }
    return false;
}
    public int aggressiveCows(int[] stalls, int k) {
        
    Arrays.sort(stalls);
int start = 1;
int end = stalls[stalls.length - 1] - stalls[0];
          if (k > stalls.length) return -1;
       

      int ans = -1;
while (start <= end) {
    int mid = start + (end - start) / 2;
    if (isPossible(stalls, k, mid)) {
        ans = mid;        
        start = mid + 1; 
    } else {
        end = mid - 1;
    }
}
return ans;

    }
}