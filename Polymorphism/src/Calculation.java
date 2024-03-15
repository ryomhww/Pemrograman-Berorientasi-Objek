public class Calculation {
    public static int add(int a, int b) {
        return a + b;
    }

    public int add(Double c, int d) {
        int x = (int) c.doubleValue();
        return x + d;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public Double add(Double a, Double b) {
        return a + b;
    }

    public Double add(Double a, Double b, Double c) {
        return a + b + c;
    }
}