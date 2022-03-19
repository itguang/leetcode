package 有效的括号20;

import org.junit.jupiter.api.Assertions;

/**
 * @author itguang
 * @date 2022-03-18 15:25
 */
public class Test {

    @org.junit.jupiter.api.Test
    public void test(){
        Solution solution = new Solution();

        Assertions.assertFalse(solution.isValid("((("));

        Assertions.assertTrue(solution.isValid("()"));
        Assertions.assertTrue(solution.isValid("()[]{}"));
        Assertions.assertTrue(solution.isValid("{[]}"));

        Assertions.assertFalse(solution.isValid("(]"));
        Assertions.assertFalse(solution.isValid("([)]"));

    }
}
