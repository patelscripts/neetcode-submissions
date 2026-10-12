
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (curr == '(' || curr == '[' || curr == '{') {
                stk.push(curr);
            } else {
                if (stk.isEmpty()) return false;

                if ((curr == ')' && stk.peek() == '(') ||
                    (curr == ']' && stk.peek() == '[') ||
                    (curr == '}' && stk.peek() == '{')) {
                    stk.pop();
                } else {
                    return false;
                }
            }
        }

        return stk.isEmpty();
    }
}
