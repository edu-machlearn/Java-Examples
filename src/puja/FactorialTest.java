package puja;

class Factorial {
    static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        return fact;
    }
}

public class FactorialTest {
    public static void main(String[] args) {
        int fact = Factorial.fact(5);
        System.out.println(fact);
    }
}
