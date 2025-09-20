# 🧮 Calculadora Avançada

Uma calculadora completa em Java com interface gráfica moderna e testes unitários abrangentes.

## 📋 Funcionalidades

- ✅ **Quatro operações básicas**: Soma, Subtração, Multiplicação e Divisão
- ✅ **Interface gráfica moderna**: Design atrativo com cores e ícones
- ✅ **Tratamento de erros**: Validação de entrada e divisão por zero
- ✅ **Testes unitários completos**: Cobertura de todos os casos especiais
- ✅ **Documentação JavaDoc**: Documentação completa de todas as classes e métodos

## 🚀 Como Executar

### Pré-requisitos
- Java 8 ou superior
- IDE compatível (Eclipse, IntelliJ IDEA, VS Code, etc.)

### Execução da Interface Gráfica

#### Opção 1: Usar o script automático (Windows)
```bash
# Execute o script que compila e executa automaticamente
executar.bat
```

#### Opção 2: Compilação manual
```bash
# Compilar o projeto
javac -cp src\main\java src\main\java\*.java

# Executar a aplicação
java -cp src\main\java CalculadoraApp
```

### Execução dos Testes
Para executar os testes unitários, você precisará do JUnit 5. Se estiver usando uma IDE moderna, ela geralmente já inclui o JUnit.

```bash
# Se estiver usando Maven
mvn test

# Se estiver usando Gradle
gradle test

# Ou execute diretamente na IDE
```

## 📁 Estrutura do Projeto

```
📦 Calculadora
├── 📁 src/
│   ├── 📁 main/java/
│   │   ├── 📄 Calculadora.java          # Classe principal com operações matemáticas
│   │   └── 📄 CalculadoraApp.java       # Interface gráfica da aplicação
│   └── 📁 test/java/
│       └── 📄 CalculadoraTest.java      # Testes unitários
├── 📄 pom.xml                           # Configuração Maven
├── 📄 executar.bat                      # Script de execução Windows
└── 📄 README.md                         # Este arquivo
```

## 🧪 Testes Implementados

### Operações Básicas
- ✅ Soma com números positivos, negativos e decimais
- ✅ Subtração com diferentes cenários
- ✅ Multiplicação incluindo casos com zero
- ✅ Divisão com tratamento de divisão por zero

### Casos Especiais
- ✅ Divisão por zero (lança ArithmeticException)
- ✅ Valores extremos (Double.MAX_VALUE, Double.MIN_VALUE)
- ✅ Precisão com números decimais
- ✅ Validação de entrada inválida

## 🎨 Interface Gráfica

A interface inclui:
- 🎨 **Design moderno** com cores atrativas
- 📱 **Layout responsivo** com GridBagLayout
- 🎯 **Ícones visuais** para melhor experiência do usuário
- ⚠️ **Feedback visual** para erros e sucessos
- 🧹 **Botão de limpeza** para resetar campos

## 📚 Documentação

Todas as classes e métodos estão documentados com JavaDoc, incluindo:
- Descrição da funcionalidade
- Parâmetros de entrada
- Valores de retorno
- Exceções possíveis
- Exemplos de uso

## 🔧 Tecnologias Utilizadas

- **Java Swing**: Interface gráfica
- **JUnit 5**: Framework de testes
- **JavaDoc**: Documentação de código
- **GridBagLayout**: Layout avançado para interface

## 👨‍💻 Desenvolvido por

Projeto desenvolvido como atividade de Programação Orientada a Objetos (POO) - 4º Semestre.

---

*Para dúvidas ou sugestões, consulte a documentação JavaDoc no código fonte.*
