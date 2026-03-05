
// https://www.geeksforgeeks.org/problems/missing-element-in-range/1
class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
          HashMap<Integer,Integer> map = new HashMap<>();
    ArrayList<Integer> list =  new ArrayList<>();

        for (int x : arr) {
    map.put(x, 1);
}
for (int i = low; i <= high; i++) {
    if (!map.containsKey(i)) {
        list.add(i);
    }
}

return list;
        
    }
}