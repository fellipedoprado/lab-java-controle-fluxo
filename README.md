# Contador - Controle de Fluxo em Java

## 📋 Descrição
Este projeto implementa um programa contador em Java que demonstra o uso de controle de fluxo, tratamento de exceções e entrada de dados do usuário. O programa recebe dois parâmetros numéricos e realiza uma contagem incrementa baseada na diferença entre eles.

## 🚀 Funcionalidades
- Leitura de dois números inteiros via terminal
- Validação de parâmetros (segundo número deve ser maior que o primeiro)
- Contagem incrementa baseada na diferença entre os números
- Tratamento de exceções personalizado

## 📦 Estrutura do Projeto
```
lab-java-controle-fluxo/
 ├── src/
 │   ├── Contador.java
 │   └── ParametrosInvalidosException.java
 ├── bin/
 └── lib/
```

## 💻 Como Executar
1. Certifique-se de ter o Java Development Kit (JDK) instalado
2. Compile os arquivos fonte:
   ```bash
   javac src/*.java -d bin
   ```
3. Execute o programa:
   ```bash
   java -cp bin Contador
   ```

## 📌 Como Usar
1. Execute o programa
2. Digite o primeiro número quando solicitado
3. Digite o segundo número quando solicitado
4. O programa irá:
   - Realizar a contagem se o segundo número for maior que o primeiro
   - Exibir uma mensagem de erro caso o segundo número seja menor que o primeiro

## ⚠️ Tratamento de Exceções
O programa inclui tratamento para casos onde o segundo parâmetro é menor que o primeiro, lançando uma `ParametrosInvalidosException`.

## 🛠️ Tecnologias Utilizadas
- Java 21
