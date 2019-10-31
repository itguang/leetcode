package 二进制运算;

/**
 * @author guang
 * @since 2019-10-31 11:16
 */
public class Test {


    public static void main(String[] args) {
        for (int i = 0; i <= 23; i++) {
            int b = 1 << i;
            System.out.println(b);
            System.out.println(Integer.toBinaryString(b));

        }
    }



}
