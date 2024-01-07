package puja;

class P {
    int a = 10;
    void add(){
        System.out.println(a+100);
    }
}

class C extends P {
    int a = 30;
    void add(){
        System.out.println(a+a);
        System.out.println(a+super.a);
        super.add();
    }
}

public class FinalTest {
    public static void main(String[] args) {
        C obj = new C();
        obj.add();
    }
}
