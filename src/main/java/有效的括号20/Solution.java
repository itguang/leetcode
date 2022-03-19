package 有效的括号20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author itguang
 * @date 2022-03-18 15:25
 */
public class Solution {

    Map map;

    public Solution() {
        map = new HashMap<>();
        map.put("(", ")");
        map.put("[", "]");
        map.put("{", "}");
    }

    public boolean isValid(String s) {
        // 奇数长度
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String item = String.valueOf(s.charAt(i));
            // 入栈
            if (stack.isEmpty()) {
                stack.push(item);
            } else {
                // 左括号,直接入栈
                if (isLeft(item)) {
                    stack.push(item);
                } else {
                    // 右括号,比较栈顶元素,匹配栈顶元素出站,否则入栈
                    String top = stack.peek();
                    if (item.equals(map.get(top))) {
                        // 出栈
                        stack.pop();
                    } else {
                        stack.push(item);
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isLeft(String item) {
        return map.get(item) != null;
    }

}
