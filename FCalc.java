import java.util.Scanner;

public class FCalc {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the factorial calculator");
        factorialCalc();
    }

    public static void factorialCalc() {

        System.out.println("What number would you like to find the factorial of? ");

        int userNum = 0;

        try {
            userNum = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Closing as integer not inputted.");
            return;
        }

        double result = recursiveLoop(userNum);

        System.out.println("The factorial of " + userNum + " is " + result);

    }

    public static double recursiveLoop(int num) {
        if (num == 1) return num;
        return num * recursiveLoop(num - 1);
    }

}