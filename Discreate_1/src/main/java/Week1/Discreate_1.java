/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.discreate_1;

import java.util.Scanner;

/**
 *
 * @author sozcu
 */
public class Discreate_1 {

    public static void main(String[] args) {
        /* int x = 6;
        int y = 8;
        System.out.println("Binary form of x:" + Integer.toBinaryString(x));
        System.out.println("Binary form of y:" + Integer.toBinaryString(y));

        int or = x | y;
        int and = x & y;
        int xor = x ^ y;
        int not = ~x;
        System.out.println("Or: " + or);
        System.out.println("and " + and);
        System.out.println("xor " + xor);
        System.out.println("not " + not);

        System.out.println("enter a number");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        boolean and2 = (input % 5 == 0 && input % 6 == 0) ? true : false;
        boolean or2 = (input % 5 == 0 || input % 6 == 0) ? true : false;
        boolean xor2 = (input % 5 == 0 ^ input % 6 == 0) ? true : false;
        System.out.println(and2);
        System.out.println(or2);
        System.out.println(xor2);
         */

        //palindrome
        System.out.println("Enter 3 digit number");
        Scanner scanner = new Scanner(System.in);
        int palindromeinput = scanner.nextInt();
        int temp = palindromeinput;
        int reverse = 0;
        while (palindromeinput != 0) {
            reverse = reverse * 10 + palindromeinput % 10;
            palindromeinput /= 10;

        }
        System.out.println("ıs palindrome? " + (reverse == temp));
    }
}
