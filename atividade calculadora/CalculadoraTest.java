import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de testes unitários para a classe Calculadora.
 * Testa todas as operações básicas incluindo casos especiais como divisão por zero.
 */
public class CalculadoraTest {
    private Calculadora calc;
    
    /**
     * Configuração inicial para cada teste.
     * Cria uma nova instância da calculadora antes de cada teste.
     */
    @BeforeEach
    public void setUp() {
        calc = new Calculadora();
    }
    
    /**
     * Testa a operação de soma com diferentes cenários.
     */
    @Test
    public void testSomar() {
        // Teste básico
        assertEquals(5.0, calc.somar(2, 3), 0.001);
        
        // Teste com números negativos
        assertEquals(0.0, calc.somar(-2, 2), 0.001);
        
        // Teste com zero
        assertEquals(5.0, calc.somar(5, 0), 0.001);
        
        // Teste com números decimais
        assertEquals(3.5, calc.somar(1.2, 2.3), 0.001);
        
        // Teste com números grandes
        assertEquals(1000000.0, calc.somar(500000, 500000), 0.001);
    }
    
    /**
     * Testa a operação de subtração com diferentes cenários.
     */
    @Test
    public void testSubtrair() {
        // Teste básico
        assertEquals(2.0, calc.subtrair(5, 3), 0.001);
        
        // Teste com resultado negativo
        assertEquals(-1.0, calc.subtrair(2, 3), 0.001);
        
        // Teste com zero
        assertEquals(5.0, calc.subtrair(5, 0), 0.001);
        
        // Teste com números decimais
        assertEquals(1.1, calc.subtrair(3.4, 2.3), 0.001);
        
        // Teste com números negativos
        assertEquals(-5.0, calc.subtrair(-2, 3), 0.001);
    }
    
    /**
     * Testa a operação de multiplicação com diferentes cenários.
     */
    @Test
    public void testMultiplicar() {
        // Teste básico
        assertEquals(15.0, calc.multiplicar(3, 5), 0.001);
        
        // Teste com zero
        assertEquals(0.0, calc.multiplicar(5, 0), 0.001);
        
        // Teste com números negativos
        assertEquals(-15.0, calc.multiplicar(-3, 5), 0.001);
        
        // Teste com números decimais
        assertEquals(2.76, calc.multiplicar(1.2, 2.3), 0.001);
        
        // Teste com números grandes
        assertEquals(1000000.0, calc.multiplicar(1000, 1000), 0.001);
    }
    
    /**
     * Testa a operação de divisão com diferentes cenários.
     */
    @Test
    public void testDividir() {
        // Teste básico
        assertEquals(2.0, calc.dividir(10, 5), 0.001);
        
        // Teste com resultado decimal
        assertEquals(2.5, calc.dividir(5, 2), 0.001);
        
        // Teste com números negativos
        assertEquals(-2.0, calc.dividir(-10, 5), 0.001);
        
        // Teste com números decimais
        assertEquals(2.0, calc.dividir(4.6, 2.3), 0.001);
        
        // Teste com divisão que resulta em número muito pequeno
        assertEquals(0.001, calc.dividir(1, 1000), 0.001);
    }
    
    /**
     * Testa a divisão por zero, que deve lançar uma ArithmeticException.
     */
    @Test
    public void testDividirPorZero() {
        // Teste com divisor zero
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10, 0);
        });
        
        assertEquals("Divisão por zero não é permitida!", exception.getMessage());
        
        // Teste com dividendo zero e divisor zero
        ArithmeticException exception2 = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(0, 0);
        });
        
        assertEquals("Divisão por zero não é permitida!", exception2.getMessage());
    }
    
    /**
     * Testa operações com valores extremos.
     */
    @Test
    public void testValoresExtremos() {
        // Teste com Double.MAX_VALUE
        assertEquals(Double.MAX_VALUE, calc.somar(Double.MAX_VALUE, 0), 0.001);
        
        // Teste com Double.MIN_VALUE
        assertEquals(Double.MIN_VALUE, calc.somar(Double.MIN_VALUE, 0), 0.001);
        
        // Teste com números muito pequenos
        assertEquals(0.0000001, calc.somar(0.00000005, 0.00000005), 0.00000001);
    }
    
    /**
     * Testa a precisão das operações com números decimais.
     */
    @Test
    public void testPrecisaoDecimal() {
        // Teste de precisão com soma
        assertEquals(0.3, calc.somar(0.1, 0.2), 0.0000001);
        
        // Teste de precisão com subtração
        assertEquals(0.1, calc.subtrair(0.3, 0.2), 0.0000001);
        
        // Teste de precisão com multiplicação
        assertEquals(0.06, calc.multiplicar(0.2, 0.3), 0.0000001);
        
        // Teste de precisão com divisão
        assertEquals(0.5, calc.dividir(0.1, 0.2), 0.0000001);
    }
}
