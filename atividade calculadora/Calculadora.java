/**
 * Classe que implementa operações básicas de uma calculadora.
 * Suporta as quatro operações fundamentais: soma, subtração, multiplicação e divisão.
 */
public class Calculadora {
    
    /**
     * Soma dois números.
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma
     */
    public double somar(double a, double b) {
        return a + b;
    }
    
    /**
     * Subtrai o segundo número do primeiro.
     * @param a primeiro número (minuendo)
     * @param b segundo número (subtraendo)
     * @return resultado da subtração
     */
    public double subtrair(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplica dois números.
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da multiplicação
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    /**
     * Divide o primeiro número pelo segundo.
     * @param a dividendo
     * @param b divisor
     * @return resultado da divisão
     * @throws ArithmeticException se o divisor for zero
     */
    public double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return a / b;
    }
}
