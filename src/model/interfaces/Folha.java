package model;

// Define um contrato que qualquer classe que a implementar deve seguir
public interface Folha {
    double calcularSalarioBruto();
    double calcularImpostos();
    double calcularSalarioLiquido();
}