public class fibonacciRecursive {

    static int fibonacci(int num) {

        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
    public static void main(String[] args) {

        System.out.println(fibonacci(12));

    }
}
