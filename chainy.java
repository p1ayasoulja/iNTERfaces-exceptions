
public class chainy {
    static void demoexc() {
        ArithmeticException e = new ArithmeticException("Owibka");
        e.initCause(new ArrayIndexOutOfBoundsException("Potomy4to"));
        throw e;

    }


    public static void main(String[] args) {
        int mass[] = new int[5];

        try {
            //mass[15]=2;
            demoexc();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Found Owibka");

            System.out.println("A pri4ina..." + e.getCause());
        }
    }
}
