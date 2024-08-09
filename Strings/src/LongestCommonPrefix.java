/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        char str;

        for (int i = 0; i < strs[0].length(); i++) {
            str = strs[0].charAt(i);
            if (check(strs, str, i)) {
                result += str;
            } else {
                break;
            }
        }
        return result;
    }

    public static boolean check(String strArr[], char str, int index) {
        for (int i = 0; i < strArr.length; i++) {
            if (index >= strArr[i].length() || strArr[i].charAt(index) != str) {
                return false;
            }
        }
        return true;
    }
}
