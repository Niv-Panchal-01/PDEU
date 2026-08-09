
class ArithmeticOperations {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(float a, float b) {
        return a + b;
    }
}

public class methodOverload {

    public static void main(String[] args) {
        ArithmeticOperations a1 = new ArithmeticOperations();

        System.out.println("Your first sum method with 2 integers as arguments : " + a1.sum(10, 6));
        System.out.println("Your second sum method with 3 integers as arguments : " + a1.sum(500, 20, 4));
        System.out.println("Your first sum method with 2 floats as arguments : " + a1.sum(10.5f, 20.0f));

    }
}
