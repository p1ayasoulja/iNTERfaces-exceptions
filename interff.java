import javax.management.MBeanAttributeInfo;
import java.util.Random;

interface Rand {
    int x = 1;
    int y = 0;
}

class checkii implements Rand {
    Random rend = new Random();

    int check() {
        int prob = (int) (100 * rend.nextDouble());
        if (prob <= 50) {
            System.out.println("<=50");
            return x;
        } else {
            System.out.println(">50");
            return y;
        }

    }
}

class Resulted implements Rand {
   static void test(int result) {
        switch (result) {
            case 0: {
                System.out.println("<50");
                break;
            }
            case 1: {
                System.out.println(">50");
                break;
            }
        }

    }
}

public class interff {
    public static void main(String[] args) {
        checkii ch = new checkii();
        ch.check();
        Resulted r= new Resulted();



    }
}
