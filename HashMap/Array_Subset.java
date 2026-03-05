
// https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
class Solution {

    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap <Integer,Integer> map = new HashMap<>();
        
  for (int x : a) {
    map.put(x, map.getOrDefault(x, 0) + 1);
}
        
      for (int be : b) {
    int count = map.getOrDefault(be, 0);
    if (count == 0) return false;
    map.put(be, count - 1);
}
return true;
        
    }
}
