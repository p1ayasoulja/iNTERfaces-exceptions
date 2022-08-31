

public class Excep {
    static void proc1() {
        try {
            System.out.println("Proc1");
            throw new ArithmeticException("Demonstration");
        } finally {
            System.out.println("Finall proc1");
        }
    }

    static void proc2() {
        try {
            System.out.println("Proc2");
            return;
        } finally {
            System.out.println("Final proc2");
        }
    }

    public static void main(String[] args) {
        try {
            proc1();
        } catch (Exception e) {
            System.out.println("Found exception!");

        }
        proc2();
    }
}
