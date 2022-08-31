interface In {
    void push(int x);

    int pop();
}

class Stack implements In {
    private int stck[];
    private int pos;

    Stack(int size) {
        stck = new int[size];
        pos = -1;
    }


    public void push(int x) {
        if (pos == stck.length - 1) {
            System.out.println("Stack full");
        } else
            stck[++pos] = x;

    }


    public int pop() {
        if (pos < 0) {
            System.out.println("Empty");
            return 0;
        } else {
            return stck[pos--];
        }

    }
}

public class STackinter {
    public static void main(String[] args) {
        Stack ab = new Stack(10);
        for (int i = 0; i < 5; i++) {
            ab.push(i);

        }

        System.out.println("Elements");
        for (int i = 0; i < 5; i++) {
            ab.pop();
        }
    }

}
