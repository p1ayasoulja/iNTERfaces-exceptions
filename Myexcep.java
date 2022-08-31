class myexp extends Exception {
    private boolean detail;

    myexp(boolean a) {
        detail = a;
    }

    public String toString() {
        return "MyException [" + detail + "] ";
    }
}

public class Myexcep {
    static void check(boolean a) throws myexp {
        System.out.println("Detail = " + a);
        if (a)
            throw new myexp(a);
        System.out.println("All good!");
    }

    public static void main(String[] args) {
        try {
            check(false);


        } catch (myexp e) {
            System.out.println("Found excep" + e);
        }
    }
}

