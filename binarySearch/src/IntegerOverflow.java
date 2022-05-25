/**
 * @author cxw
 * @date 2022/5/25 19:22
 * 整数溢出的问题 两个超大的整数相加会造成整数溢出 使结果变为负数
 */
public class IntegerOverflow {
    public static void main(String[] args) {
        //解决方法二 无符号右移运算
        int l = 0;
        int r = Integer.MAX_VALUE - 1;

        int m = (l + r) >>> 1;
        System.out.println(m); //1073741823

        //如果所求的数在中间的右侧
        l = m + 1;
        m = (l + r) >>> 1;
        System.out.println(m); //1610612735

    }

    private static void method1() {
        int l = 0;
        int r = Integer.MAX_VALUE - 1;

        int m = (l + r) / 2;
        System.out.println(m); //1073741823

        //如果所求的数在中间的右侧
        l = m + 1;
        m = (l + r) / 2;
        System.out.println(m); //-536870913 整数溢出

        //解决办法一 ==================================
        int l1 = 0;
        int r1 = Integer.MAX_VALUE - 1;
        int m1 = l1 + (r1 - l1)/2; // l/2 + r/2 ==> l - l/2 + r/2 ==> l + (r - l)/2
        System.out.println(m1); //1073741823

        //如果所求的数在中间的右侧
        l1 = m1 + 1;
        m1 = l1 + (r1 - l1)/2;
        System.out.println(m1); //1610612735
    }
}
