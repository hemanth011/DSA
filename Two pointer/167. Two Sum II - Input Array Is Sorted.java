class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int[] arr = mewInt[];
 int start = 0 , end = numbers.length-1;
    while (start <= end){
        if (numbers[start] + numbers[end] == target){
           return new int[]{start+1, end+1};
        }
        int sum = numbers[start] + numbers[end];
      if (sum < target) {
    start++;
} else if (sum > target) {
    end--;
}
    }
    return new int[]{-1,-1};
        
        
    }
}