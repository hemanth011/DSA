class Solution {
    public int[] twoSum(int[] nums, int target) {
        
   HashMap<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
    int x = nums[i];
    int needed = target - x;
    if (map.containsKey(needed)) {
        return new int[]{map.get(needed), i};
    }
    map.put(x, i); // store index as value
}

         return new int[]{-1,-1};
    }
}