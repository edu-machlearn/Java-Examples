package puja;

class Method {
    int add(int a, int b){
        return a+b;
    }
    float add(int x, float y){
        return x+y;
    }
}
public class MethodTest {
    public static void main(String[] args) {
        Method m1 = new Method();
        System.out.println(m1.add(10,20));
        System.out.println(m1.add(10,20.5F));

    }
}
