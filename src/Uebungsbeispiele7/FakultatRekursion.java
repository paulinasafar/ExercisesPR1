package Uebungsbeispiele7;

public class FakultatRekursion {

    public static void main(String[] args) {

        System.out.println("Factorells are: " + fakt(7));
        System.out.println("Factorells are: " + fakt(-7));
        System.out.println();
        System.out.println("Sum is: " + summingUp(17));
        System.out.println("Sum is: " + summingUp(-17));
        System.out.println();
        fibonacci(0, 1, 7);
        fibonacci(0, 1, 11);

    }
    //Method A
    public static long fakt(long number) {

        if (number > 0)
            return number * fakt(number - 1);
        else { return 1;}
    }
    //Method B
    public static int summingUp(int number) {

        if (number > 0) {
            return number + summingUp(number - 1);
        }
        else { return 1; }
    }

    //Method Fibonacci
    public static void fibonacci(int first, int second, int number) {

        if (number > 0 ) {
            int sum = first + second;
            System.out.print(first + ", ");
            first = second;
            second = sum;
            fibonacci(first, second, number - 1);
        }
    }
}
