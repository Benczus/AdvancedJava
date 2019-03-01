package sixth;

public class Runnable {
    public static void main(String[] args) {


        testInterface test= new testInterface() {
            @Override
            public int testMethod1() {
                return 0;
            }

            @Override
            public double testMethod2() {
                return 0;
            }

            @Override
            public boolean testMethod3() {
                return false;
            }
        };

        System.out.println(
                        test.testMethod1()
        );
    }

}
