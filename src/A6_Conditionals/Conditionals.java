package A6_Conditionals;

public class Conditionals {

    public static void main(String[] args) {
        System.out.println(miniCollatz(2));
        System.out.println("(1)");
        System.out.println(miniCollatz(3));
        System.out.println("(10)");
    }

    public static int miniCollatz(int n) {
        if ((n > 1) && ((n % 2) == 0)) {
            return (n / 2);
        } else if (n > 1) {
            return (3 * n + 1);
        } else {
            return (n);
        }
    }

}
