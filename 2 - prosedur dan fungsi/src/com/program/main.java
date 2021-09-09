package com.program;

class BelajarFunction {
    // prosedur
    // adalah sebuah function yang tidak mengembalikan nilai

    static void sapaudin() {
        System.out.println("Hai Udin!!");
    }

    static void sapaasep() {
        System.out.println("hai asep!");
    }

    static void sapamela() {
        System.out.println("hai mela!");
    }

    // function
    // sebuah function yang dapat mengembalikan nilai

    static int perkalian(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {

        sapaasep();
        sapamela();
        sapaudin();
        System.out.println(perkalian(5, 5));

    }

}