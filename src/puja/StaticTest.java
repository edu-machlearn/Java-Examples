package puja;

class A {
    static int a = 20;
    static int b = 30;

    static void show() {
        System.out.println(a + b);
    }
}

public class StaticTest {
    public static void main(String[] args) {
        A.show();
    }
}
