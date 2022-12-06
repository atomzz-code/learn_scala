public class TestOperator {
    public static void main(String[] args) {
        // 比较运算符
        String s1 = "Hello";
        String s2 = new String("Hello");

        //Java 对于常量和变量的 == 判断的是类型
        Boolean isEqual = s1 == s2;
        System.out.println(isEqual);
        //判断数值，引用方法
        System.out.println(s2.equals(s1));

        //赋值运算符
        byte b = 10;
        b = (byte)(b + 1);
        b += 1; //自动强转
        System.out.println(b);

        //自增自减
        int x = 15;
        int y = x ++; //x 先赋值给y再加
        System.out.println("x =" + x + ", y =" + y);

        x = 15;
        y = ++ x; // x 先加再赋值给y
        System.out.println("x =" + x + ", y =" + y);

        x = 23;
        x = x++; // 1. temp=x++ 2. x = temp
        System.out.println(x);
    }
}
