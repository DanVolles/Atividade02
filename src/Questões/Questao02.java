package Questões;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println ("Seja bem-vindo!\n" +
                "Aqui eu posso te mostrar a ordem de tamanho entre três números!");

        System.out.print ("Por favor, insira o primeiro número: ");
        double a = input.nextDouble();
        System.out.print ("Por favor, insira o segundo número: ");
        double b = input.nextDouble();
        System.out.print ("Por favor, insira o terceiro número: ");
        double c = input.nextDouble();

        // Dizer qual o maior número
        double maior = Math.max(Math.max(a,b),c);
        System.out.println("O maior número entre os três é " + maior);

        // Dizer qual o manor número
        double menor = Math.min(Math.min(a,b),c);
        System.out.println("O menor número entre os três é " + menor);
    }
}

// Dizer qual o maior número
//        if (a > b && a > c) {
//                System.out.println("O primeiro número, " + a + ", é o maior entre os 3!");
//        } else if (b > a && b > c) {
//                System.out.println("O segundo número, " + b + ", é o maior entre os 3!");
//        } else {
//                System.out.println("O terceiro número, " + c + ", é o maior entre os 3!");
//        }

// Dizer qual o menor número
//        if (a < b && a < c) {
//                System.out.println("O primeiro número, " + a + ", é o menor entre os 3!");
//        } else if (b < a && b < c) {
//                System.out.println("O segundo número, " + b + ", é o menor entre os 3!");
//        } else {
//                System.out.println("O terceiro número, " + c + ", é o menor entre os 3!");
//        }