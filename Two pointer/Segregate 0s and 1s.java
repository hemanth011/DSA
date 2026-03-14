// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int zeor = 0;
        int one = 0;
        for(int x : arr){
           if (x == 0) {
                zeor ++; 
            }else{
                one ++;
            }
        }
       int index = 0;
for (int x : arr) {
    if (x == 0) arr[index++] = 0;
}
for (int i = index; i < arr.length; i++) {
    arr[i] = 1;
}
    }
}
