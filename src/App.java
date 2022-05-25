/*
    Napisz program, w którym sprawdzisz, czy suma dwóch przykładowych
    liczb całkowitych jest parzysta.
*/
public class App {

    static boolean isEvenSum(int a, int b) {
        /*var s = a + b;
        if (s % 2 == 0) {
            return true;
        }
        return false;*/

        return (a + b) % 2 == 0;

    }

    public static void main(String[] args) {
        System.out.println(isEvenSum(10, 20));
        System.out.println(isEvenSum(10, 21));
    }
}
