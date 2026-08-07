import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String nome;

    Scanner scanner = new Scanner(System.in);

        System.out.println("Olá!");
        System.out.println("Qual o seu nome?");

        nome = scanner.nextLine();

        System.out.println("Tudo bem, " + nome + "?" );
        System.out.println("Quantos anos você tem?");

        int idade = scanner.nextInt();

        if(idade <0){
            System.out.println("Você digitou errado!");
        } if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else{
            System.out.println("Você é menor de idade!");
        }
        while(idade <0){
            System.out.println("Você digitou errado!");
            System.out.println("Quantos anos você tem?");
            idade = scanner.nextInt();
        }
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
        System.out.println("Vamos calcular sua média.");

        System.out.println("Escreva a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Escreva a segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.println("Escreva a terceira nota: ");
        float nota3 = scanner.nextFloat();

        float media = calcularMedia(nota1, nota2, nota3);

        System.out.println(media);

    }
     static float calcularMedia(float nota1, float nota2, float nota3){
        float soma = nota1 + nota2 + nota3;
        float media = soma/3.0f;

        return media;

    }

}
