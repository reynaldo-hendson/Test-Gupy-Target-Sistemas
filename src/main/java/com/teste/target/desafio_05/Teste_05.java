package com.teste.target.desafio_05;

import java.util.Scanner;

/**
 * 5) Escreva um programa que inverta os caracteres de um string.
 *
 * IMPORTANTE:
 * a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
 * b) Evite usar funções prontas, como, por exemplo, reverse;
 */
public class Teste_05 {
    public static void main(String[] args) {
        // Solicitar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a string para inverter: ");
        String input = scanner.nextLine();
        scanner.close();

        // Inverter a string
        String stringInvertida = inverterString(input);

        // Comparar as duas strings
        boolean saoIguais = input.equals(stringInvertida);
        int comparacao = input.compareTo(stringInvertida);

        // Exibir os resultados da comparação
        if (saoIguais) {
            System.out.println("A String é um palíndromo: " + stringInvertida );
        }else {
            // Exibir o resultado
            System.out.println("String invertida: " + stringInvertida);
        }
    }

    public static String inverterString(String str) {
        // Inicializar uma StringBuilder para construir a string invertida
        StringBuilder invertido = new StringBuilder();

        // Adicionar caracteres da string original de trás para frente
        for (int i = str.length() - 1; i >= 0; i--) {
            invertido.append(str.charAt(i));
        }

        // Converter StringBuilder para String e retornar
        return invertido.toString();
    }
}
