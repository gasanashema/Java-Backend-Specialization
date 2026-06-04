import java.util.Scanner;

public class Overloading {
    /**
     *
     * Exercise 1
     * <p>
     *     Create a method sum(int a101, int b).
     *     Ask user for 2 numbers.
     *     Call method and display result.
     *     Modify method to accept 3 numbers.
     *     Overload method for double values.
     *     Call both versions.
     * <p>
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println(sum(num1, num2));
        System.out.println(sum(num1,num2,7));
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
}
