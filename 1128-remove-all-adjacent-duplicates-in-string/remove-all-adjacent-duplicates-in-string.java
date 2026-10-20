class Solution {
    public String removeDuplicates(String str) {
    Stack<Character> s = new Stack<>();
    for ( int i = 0 ; i < str.length() ; i++) {
        char ch = str.charAt(i);

        if(!s.isEmpty() && s.peek() == ch) {
            s.pop();
        }
        else {
            s.push(ch);
        }
    } 
    String ans = "";

    for (char ch :s){
        ans += ch;
    }
    return ans;   
    }
}