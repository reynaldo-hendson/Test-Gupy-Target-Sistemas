package com.teste.target.desafio_03;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
 * • O menor valor de faturamento ocorrido em um dia do mês;
 * • O maior valor de faturamento ocorrido em um dia do mês;
 * • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
 *
 * IMPORTANTE:
 * a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
 * b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
 */
public class Teste_03 {
    public static void main(String[] args) {
        try {
            //leitura do arquivo
            String content = new String(Files.readAllBytes(Paths.get("E:\\Projetos\\Teste Target\\target\\target\\src\\main\\java\\com\\teste\\target\\desafio_03\\faturamento.json")));
            JSONArray faturamentoMensal = new JSONArray(content);

            Double menorFaturamento = null;
            Double maiorFaturamento = 0.0;
            int diaMenorValor = -1;
            int diaMaiorValor = -1;

            for (int i = 0; i < faturamentoMensal.length(); i++) {
                JSONObject jsonObject = faturamentoMensal.getJSONObject(i);

                // Obter os valores "dia" e "valor" de cada objeto
                int dia = jsonObject.getInt("dia");
                double valor = jsonObject.getDouble("valor");

                // Inicializar menorValor e maiorValor com o primeiro valor encontrado
                if (menorFaturamento == null || valor < menorFaturamento) {
                    menorFaturamento = valor;
                    diaMenorValor = dia;
                }

                if (maiorFaturamento == null || valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                    diaMaiorValor = dia;
                }
            }

            // Variáveis para cálculo da média
            double totalFaturamento = 0.0;
            int diasComFaturamento = 0;

            // Primeiro loop para calcular a média mensal
            for (int i = 0; i < faturamentoMensal.length(); i++) {
                JSONObject jsonObject = faturamentoMensal.getJSONObject(i);

                double valor = jsonObject.getDouble("valor");

                if (valor > 0) {
                    totalFaturamento += valor;
                    diasComFaturamento++;
                }
            }

            // Calcular a média mensal
            double mediaMensal = (diasComFaturamento > 0) ? totalFaturamento / diasComFaturamento : 0.0;

            // Variável para contar dias acima da média
            int diasAcimaDaMedia = 0;

            // Segundo loop para contar dias com faturamento acima da média
            for (int i = 0; i < faturamentoMensal.length(); i++) {
                JSONObject jsonObject = faturamentoMensal.getJSONObject(i);

                double valor = jsonObject.getDouble("valor");

                if (valor > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }


            // Imprimir resultados
            if (menorFaturamento != null && maiorFaturamento != null  && diasAcimaDaMedia != 0) {
                System.out.println("Menor valor de faturamento: " + menorFaturamento + " no dia " + diaMenorValor);
                System.out.println("Maior valor de faturamento: " + maiorFaturamento + " no dia " + diaMaiorValor);
                System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
                System.out.printf("Media mensal: R$ %.2f", mediaMensal);
            }


        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
