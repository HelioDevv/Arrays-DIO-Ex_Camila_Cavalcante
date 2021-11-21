package br.com.dio.exercicios.arrays;
import java.util.Scanner;
import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //não foi usado;
        Random random = new Random();

        int[] numerosAleatorios = new int[20]; //contemos um vetor do tipo int com 20 números inteiros;

        for (int i = 0; i < numerosAleatorios.length; i++) { //neste laço 'for', podemos gerar até 100 n° aleatórios
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("\nNúmeros aleatórios: \n");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + "; ");
        }

        System.out.println(" ");
        System.out.print("\nSucessor de números aleatórios: \n");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + "; ");
        }
        System.out.println(" ");
        System.out.print("\nAntecessor de números aleatórios: \n");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + "; ");
        }
    }
}