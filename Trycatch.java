import java.util.Random;
import java.util.random.RandomGenerator;

public class Trycatch {
    public static void main(String[] args) {
        int d = 42;
        int a;
        Random r = new Random();
        int x = 1;
        try {

            a = d / x;

            int c[] = new int[5];
            c[51] = 5;
        } catch (ArithmeticException e) {
            System.out.println("Delenie na 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("wRong massive index");
        }
        }
}
