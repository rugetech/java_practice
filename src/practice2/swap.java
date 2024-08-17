package practice2;

import java.util.Scanner;

class swap {
    public static void main(String[] args) {
        int a, b;
        Scanner getNumber = new Scanner(System.in);
        System.out.print("Enter any number for a: ");
        a = getNumber.nextInt();
        System.out.print("Enter any number for b: ");
        b = getNumber.nextInt();
        getNumber.close();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

//        temp variable stores temporarily values for swapping.
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}