import model.Folha;
import model.Pessoa;

// Dentro de Professor.java (Apenas um exemplo simples)
public class Professor extends Pessoa implements Folha { // <-- IMPLEMENTAÇÃO AQUI
    // ... atributos e construtor existentes

    @Override
    public double calcularSalarioBruto() {
        // Exemplo: Salário base fixo
        return 5000.00;
    }

    @Override
    public double calcularImpostos() {
        // Exemplo: 10% de imposto
        return calcularSalarioBruto() * 0.10;
    }

    @Override
    public double calcularSalarioLiquido() {
        return calcularSalarioBruto() - calcularImpostos();
    }
}