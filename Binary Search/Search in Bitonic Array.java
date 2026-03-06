
public class Class {


    static int searchAscending(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    static int searchDescending(int[] arr , int left, int right , int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;

    }


   static  int findPeak(int[] arr) {
        // code here
        int start = 0 , end = arr.length-1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
       return start;
    }
    static int searchBitonic(int[] arr, int target) {
        int peak = findPeak(arr);

        int result = searchAscending(arr, 0, peak, target);
        if (result != -1) return result;

        return searchDescending(arr, peak + 1, arr.length - 1, target);
    }




    public static void main(String[] args) {

        int[] arr = {1, 3, 8, 12, 4, 2};
        System.out.println(searchBitonic(arr, 4)); // expected: 4

    }
}
  