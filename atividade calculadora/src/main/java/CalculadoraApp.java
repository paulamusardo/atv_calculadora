import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe principal que implementa a interface gráfica da calculadora.
 * Fornece uma interface visual completa para realizar operações matemáticas básicas.
 */
public class CalculadoraApp {
    private Calculadora calc = new Calculadora();
    private JTextField num1, num2, resultado;
    private JComboBox<String> operacao;
    private JButton calcularBtn, limparBtn;
    
    /**
     * Construtor da aplicação da calculadora.
     * Inicializa todos os componentes da interface gráfica.
     */
    public CalculadoraApp() {
        JFrame frame = new JFrame("🧮 Calculadora Avançada");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        // Configurar cores e tema
        frame.getContentPane().setBackground(new Color(240, 248, 255));
        
        // Painel principal com bordas
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(240, 248, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        
        // Título
        JLabel titulo = new JLabel("🧮 Calculadora Avançada");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(new Color(25, 25, 112));
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(titulo, gbc);
        
        // Primeiro número
        gbc.gridwidth = 1; gbc.anchor = GridBagConstraints.EAST;
        JLabel labelNum1 = new JLabel("Primeiro número:");
        labelNum1.setFont(new Font("Arial", Font.BOLD, 14));
        labelNum1.setForeground(new Color(70, 130, 180));
        gbc.gridx = 0; gbc.gridy = 1;
        mainPanel.add(labelNum1, gbc);
        
        num1 = new JTextField(15);
        num1.setFont(new Font("Arial", Font.PLAIN, 14));
        num1.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(70, 130, 180), 2),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        gbc.gridx = 1; gbc.gridy = 1; gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(num1, gbc);
        
        // Operação
        JLabel labelOp = new JLabel("Operação:");
        labelOp.setFont(new Font("Arial", Font.BOLD, 14));
        labelOp.setForeground(new Color(70, 130, 180));
        gbc.gridx = 0; gbc.gridy = 2; gbc.anchor = GridBagConstraints.EAST;
        mainPanel.add(labelOp, gbc);
        
        String[] operacoes = {"➕ Soma", "➖ Subtração", "✖️ Multiplicação", "➗ Divisão"};
        operacao = new JComboBox<>(operacoes);
        operacao.setFont(new Font("Arial", Font.PLAIN, 14));
        operacao.setBackground(Color.WHITE);
        operacao.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(70, 130, 180), 2),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        gbc.gridx = 1; gbc.gridy = 2; gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(operacao, gbc);
        
        // Segundo número
        JLabel labelNum2 = new JLabel("Segundo número:");
        labelNum2.setFont(new Font("Arial", Font.BOLD, 14));
        labelNum2.setForeground(new Color(70, 130, 180));
        gbc.gridx = 0; gbc.gridy = 3; gbc.anchor = GridBagConstraints.EAST;
        mainPanel.add(labelNum2, gbc);
        
        num2 = new JTextField(15);
        num2.setFont(new Font("Arial", Font.PLAIN, 14));
        num2.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(70, 130, 180), 2),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        gbc.gridx = 1; gbc.gridy = 3; gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(num2, gbc);
        
        // Resultado
        JLabel labelResultado = new JLabel("Resultado:");
        labelResultado.setFont(new Font("Arial", Font.BOLD, 14));
        labelResultado.setForeground(new Color(70, 130, 180));
        gbc.gridx = 0; gbc.gridy = 4; gbc.anchor = GridBagConstraints.EAST;
        mainPanel.add(labelResultado, gbc);
        
        resultado = new JTextField(15);
        resultado.setFont(new Font("Arial", Font.BOLD, 14));
        resultado.setEditable(false);
        resultado.setBackground(new Color(255, 255, 224));
        resultado.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(255, 165, 0), 2),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        gbc.gridx = 1; gbc.gridy = 4; gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(resultado, gbc);
        
        // Botões
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(new Color(240, 248, 255));
        
        calcularBtn = new JButton("🧮 Calcular");
        calcularBtn.setFont(new Font("Arial", Font.BOLD, 14));
        calcularBtn.setBackground(new Color(34, 139, 34));
        calcularBtn.setForeground(Color.WHITE);
        calcularBtn.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        calcularBtn.setFocusPainted(false);
        calcularBtn.addActionListener(new CalcularListener());
        
        limparBtn = new JButton("🗑️ Limpar");
        limparBtn.setFont(new Font("Arial", Font.BOLD, 14));
        limparBtn.setBackground(new Color(220, 20, 60));
        limparBtn.setForeground(Color.WHITE);
        limparBtn.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        limparBtn.setFocusPainted(false);
        limparBtn.addActionListener(new LimparListener());
        
        buttonPanel.add(calcularBtn);
        buttonPanel.add(limparBtn);
        
        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 2; gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(buttonPanel, gbc);
        
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    /**
     * Listener para o botão calcular.
     * Executa a operação selecionada e exibe o resultado.
     */
    private class CalcularListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                double resultadoCalculo = 0;
                
                switch (operacao.getSelectedIndex()) {
                    case 0: // Soma
                        resultadoCalculo = calc.somar(a, b);
                        break;
                    case 1: // Subtração
                        resultadoCalculo = calc.subtrair(a, b);
                        break;
                    case 2: // Multiplicação
                        resultadoCalculo = calc.multiplicar(a, b);
                        break;
                    case 3: // Divisão
                        resultadoCalculo = calc.dividir(a, b);
                        break;
                }
                
                resultado.setText(String.format("%.2f", resultadoCalculo));
                resultado.setForeground(new Color(0, 100, 0));
                
            } catch (NumberFormatException ex) {
                resultado.setText("❌ Entrada inválida!");
                resultado.setForeground(Color.RED);
            } catch (ArithmeticException ex) {
                resultado.setText("❌ " + ex.getMessage());
                resultado.setForeground(Color.RED);
            }
        }
    }
    
    /**
     * Listener para o botão limpar.
     * Limpa todos os campos da calculadora.
     */
    private class LimparListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            num1.setText("");
            num2.setText("");
            resultado.setText("");
            operacao.setSelectedIndex(0);
            num1.requestFocus();
        }
    }
    
    /**
     * Método principal da aplicação.
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraApp();
        });
    }
}
