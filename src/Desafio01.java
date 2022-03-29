import java.util.Scanner;

public class Desafio01 {

    public int somaDeCaracter(String palavra) {
        int soma = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char caracter = palavra.charAt(i);
            if (caracter == 'F' || caracter == 'H' || caracter == 'Y' ||
                    caracter == 'V' || caracter == 'W') {
                soma += 4;
            } else if (caracter == 'B' || caracter == 'C' || caracter == 'M' ||
                    caracter == 'P') {
                soma += 3;
            } else if (caracter == 'J' || caracter == 'X') {
                soma += 8;
            } else if (caracter == 'D' || caracter == 'G') {
                soma += 2;
            } else if (caracter == 'Q' || caracter == 'Z') {
                soma += 10;
            } else if (caracter == 'K') {
                soma += 5;
            } else {
                soma += 1;
            }
        }
        return soma;
    }
}

class Main {

    public static void main(String[] args) {
        Desafio01 desafio01 = new Desafio01();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a palavra desejada: ");
        String palavra = entrada.nextLine().toUpperCase();
        System.out.println("A palavra escolhida contem " + desafio01.somaDeCaracter(palavra) + " pontos.");
    }
}