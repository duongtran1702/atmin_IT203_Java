package atmin;

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {

    static int sumOfSquares(int n) {
        double sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return (int) sum;
    }

    static boolean atminHappy(int n) {
        HashSet<Integer> temp
                = new HashSet<>();
        while (n != 1) {
            if (temp.contains(n))
                return false;
            temp.add(n);
            n = sumOfSquares(n);
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        n = input.nextInt();
        if(n<=0) return;

        if(atminHappy(n)){
            System.out.println("This is a number happy");
        }
        else{
            System.out.println("This is not a number happy");
        }
    }
}
