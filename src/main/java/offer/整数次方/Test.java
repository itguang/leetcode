package offer.整数次方;

/**
 * @Author guang
 * @Date 2021/2/28 11:06 上午
 */
public class Test {
    public static void main(String[] args) {

        System.out.println(5/2.0); // 2.5
        System.out.println(5/2); // 2


        System.out.println(myPow(2,2));
        System.out.println(myPow(2,-2));
        System.out.println(myPow(2,-3));
        System.out.println(myPow2(2,3));

    }

    public static double myPow2(double x, int n) {
        double result = 1.0;
        for (int i = n; i != 0; i /= 2) {
            if ((i&1) == 1) {
                result *= x;
            }
            x *= x;
        }

        if (n < 0) {
            result = 1 / result;
        }
        return result;
    }

    public static double myPow(double x, int n) {

        if(n==0){
            return 0;
        }
        if(n==1){
            return x;
        }
        if (n==-1){
            return 1/x;
        }

        // 正数次方
        double result = x;
        if(n>=0){
            while((n--)!=1){
                result = result*x;
            }

            // 负数次方
        }else{
            while((n++)!=-1){
                result = result*x;
            }
            result = 1/result;
        }

        return result;
    }
}
