import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class TestDataTypeConversion {
    public static void main(String[] args) {
        byte k = 10;
        test(k);
        char c = 'a';
        short c2 = (short)c;
        test(c2);

    }

 //   public static void test(byte b) {
//        System.out.println("bbbb");
//    }
    public static void test(short s) {
        System.out.println("ssss");
    }
    public static void test(char c) {
        System.out.println("cccc");
    }
    public static void test(int i) {
        System.out.println("iiii");
    }
}
