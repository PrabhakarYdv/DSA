/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */


import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!stack.isEmpty()) {
                char last = stack.peek();
                if (isPair(current, last)) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(current);
        }
        return stack.isEmpty();
    }

    public static boolean isPair(char current, char last) {
        if (current == ')' && last == '(' ||
                current == '}' && last == '{' ||
                current == ']' && last == '[') {
            return true;
        } else {
            return false;
        }
    }

}
