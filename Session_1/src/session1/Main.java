package session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        String b;

        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        input.nextLine();
        b=input.nextLine();

        System.out.println("Number: " + a);
        System.out.println("String: " + b);
    }
}
