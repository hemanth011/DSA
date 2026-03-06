class Solution {
    static boolean ispassiable(int[] arr,int k , int maxPage) {
        int stu = 1 , current = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] + current > maxPage ){
                stu++;
                current = arr[i];

            }else {
                current += arr[i];
            }
           if (stu > k){
               return false;
           }
        }
        return true;
    }
    
    public int findPages(int[] arr, int k) {
        // code here
          int start = 0, end = 0;
          if (k > arr.length) return -1;
        for (int x : arr) {
            start = Math.max(start, x);
            end += x;
        }

        while (start<=end){
            int mid = start + (end - start)/2;
            if (ispassiable(arr,k,mid)){
                end = mid -1;
            }else {
                start = mid +1;

            }
        }
  return start;

    }
        
    }
