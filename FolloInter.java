interface A {
    void med1();
    default String getString(){
        return "U got it!";
    }
}

interface B extends A {
    void med2();
}

class C implements B {
    public void med2() {
        System.out.println("Med2");
    }

    public void med1() {
        System.out.println("Med1");
    }
    public String getString(){
        return "U got it 2 times";
    }
}

public class FolloInter {
    public static void main(String[] args) {


        C cc = new C();
        cc.med1();
        cc.med2();
        System.out.println(cc.getString());
    }
}