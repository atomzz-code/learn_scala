public class TestBreak {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 5; i++) {
                if (i == 3)
//                    break;
                    throw new RuntimeException();
                System.out.println(i);
            }
        } catch (Exception e){
            //do nothing
        }
        System.out.println("out of loop");

    }

}
