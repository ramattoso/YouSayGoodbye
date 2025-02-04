package org.example;

import java.util.Scanner;

public class YouSayGoodByeISayHello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("You say ");
        String message  = sc.next().toLowerCase();
        String response = message.equals("goodbye") ? "I Say Hello!" : "You didn't say goodbye :/";
        System.out.println(response);

        sc.close();
    }
}















