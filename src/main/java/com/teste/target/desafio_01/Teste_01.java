package com.teste.target.desafio_01;

/**
 * Descrição do desafio
 * 1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
 * Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
 * Imprimir(SOMA);
 * Ao final do processamento, qual será o valor da variável SOMA?
 */

public class Teste_01 {

    public static void imprimirSoma1(){
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k += 1;
            soma += k;
        }
        System.out.printf("A soma dos valores é: %d", soma);
    }

    private static void imprimirSoma2(){
        int indice = 13;
        int soma = 0;
        int k = 0;

        for (int i = 0; i < indice; i++) {
            k += 1;
            soma += k;
        }
        System.out.printf("A soma dos valores é: %d", soma);
    }

    public static void main(String[] args) {

       imprimirSoma1();
       System.out.println();
       imprimirSoma2();

    }
}
