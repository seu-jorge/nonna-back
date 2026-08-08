package aula13;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        float nota1 = capaturarNota(scanner, :"primeira");
        float nota2 = capaturarNota(scanner, :"segunda");
        float nota3 = capaturarNota(scanner, :"terceira");
        float nota4 = capaturarNota(scanner, :"quarta");

        float media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("Sua média final é de: " + media);


    }

    static float capturarNota(Scanner scanner, String ordinal){
        System.out.printlm("Escreva a" + ordinal + nota:");
                float nota = scanner.nextFloat();
        return nota;

    }
}
