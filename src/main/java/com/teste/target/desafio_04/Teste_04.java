package com.teste.target.desafio_04;

import java.util.*;

/**
 * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
 * • SP – R$67.836,43
 * • RJ – R$36.678,66
 * • MG – R$29.229,88
 * • ES – R$27.165,48
 * • Outros – R$19.849,53
 *
 * Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.  
 */

public class Teste_04 {
    public static void main(String[] args) {
        // Dados de faturamento por estado
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        // Calcular o valor total do faturamento
        double valorTotal = 0.0;
        for (double valor : faturamentoPorEstado.values()) {
            valorTotal += valor;
        }

        // Criar uma lista de entradas para ordenação
        List<Map.Entry<String, Double>> listaDeEntradas = new ArrayList<>(faturamentoPorEstado.entrySet());

        // Ordenar a lista do maior para o menor percentual
        double finalValorTotal = valorTotal;
        Collections.sort(listaDeEntradas, (a, b) -> {
            double percentualA = (a.getValue() / finalValorTotal) * 100;
            double percentualB = (b.getValue() / finalValorTotal) * 100;
            return Double.compare(percentualB, percentualA);
        });

        // Imprimir o percentual de representação ordenado
        System.out.println("Percentual de representação por estado (do maior para o menor):");
        for (Map.Entry<String, Double> entry : listaDeEntradas) {
            String estado = entry.getKey();
            double faturamento = entry.getValue();
            double percentual = (faturamento / valorTotal) * 100;
            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }
    }
}
