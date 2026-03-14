class Solution {
    public String removeDuplicates(String s) {
         Stack<Character> st = new Stack<>();
        StringBuffer ans = new StringBuffer();
       for (char x :s.toCharArray()){
           if (!st.isEmpty() &&  x == st.peek()){
               st.pop();
           }else {
               st.push(x);
           }



       }
        while (!st.empty()){
            ans.append(st.pop());
        }
       return ans.reverse().toString();
       
    }
}