# Desafios de Estágio - Análise e Desenvolvimento

## Sobre

Este repositório contém os desafios para a candidatura à vaga de estágio em Análise e Desenvolvimento na Target Sistemas, localizada em São Paulo. A vaga foi publicada em 29 de agosto de 2024 e oferece a oportunidade de trabalhar remotamente.

## Descrição da Vaga

- **Tipo de Vaga**: Estágio
- **Modelo de Trabalho**: Remoto
- **Inclusão**: Vaga também disponível para Pessoas com Deficiência (PcD)

## Desafios

### Desafio 1: Soma
**Objetivo**: Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
 * Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
 * Imprimir(SOMA);
 * Ao final do processamento, qual será o valor da variável SOMA?

### Desafio 2: Fibonacci
**Objetivo**: Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
 * escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 *
 * IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

### Desafio 3: Análise de Faturamento Diário
Objetivo: Dado um JSON com o faturamento diário de uma distribuidora, calcule o menor e maior valor de faturamento e o número de dias em que o faturamento foi superior à média mensal, ignorando os dias sem faturamento.

### Desafio 4: Análise de Faturamento Mensal
Objetivo: Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
 * • SP – R$67.836,43
 * • RJ – R$36.678,66
 * • MG – R$29.229,88
 * • ES – R$27.165,48
 * • Outros – R$19.849,53
 *
 * Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora

### Desafio 5: Inversão de String

**Objetivo**: Escrever um programa que inverta os caracteres de uma string fornecida.

**Requisitos**:
- A string pode ser informada pelo usuário ou previamente definida no código.
- Evite o uso de funções prontas para inversão de string.

<h2 id="rodar">💿Como Rodar este projeto</h2>

```bash
# Clone o repositório 
$ git clone https://github.com/reynaldo-hendson/Test-Gupy-Target-Sistemas.git

# Acesse a pasta do projeto
$ cd Test-Gupy-Target-Sistemas

# Instale as dependências
$ mvn clean install

# Execute o projeto
Abra o projeto na IDE de sua preferência.

# Configurações Adicionais:
Se o projeto usa um banco de dados, certifique-se de configurar as informações de conexão no arquivo de configuração.

Consulte o arquivo application.properties (ou application.yml) para configurar outras propriedades da aplicação, como porta, URL da base de dados, é os ambientes.

```
<h2 id="tecnologias">🛠️Tecnologias Utilizadas</h2>

1. [Java 17](https://www.java.com/pt-BR/)
2. [Spring Boot 3](https://spring.io/projects/spring-boot)

<h2 id="autoras">👤Pessoas Autoras</h2>

<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/80369346?s=400&u=54e1acd301770d2fb4f98f840bc764a71294cfbc&v=4" width="100px;" alt="Reynaldo Hendson Profile Picture"/><br>
        <sub>
          <b>Reynaldo Hendson</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

[Linkedin](https://www.linkedin.com/in/reynaldo-hendson/)


