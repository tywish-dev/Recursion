import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, factorial = 1;

        System.out.print("Please type a number: ");
        num = sc.nextInt();

        System.out.println(iterativeFactorial(num));
        System.out.println(recursiveFactorial(num));
    }

    // Recursive Factorial Method
    public static int recursiveFactorial(int num){
        if (num == 0) {
            return 1;
        }

        // This line is how recursion works
        return (num * recursiveFactorial(num - 1));
    }

    // Iterative Factorial Method
    public static int iterativeFactorial(int num){
        if (num == 0) {
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}