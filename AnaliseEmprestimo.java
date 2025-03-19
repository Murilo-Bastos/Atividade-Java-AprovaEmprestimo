package service;

public class AnaliseEmprestimo {
    private static final double ValorMaxEmprestimo = 50000.0;

    // Método para verificar se o empréstimo pode ser concedido
    public boolean podeConcederEmprestimo(double rendaAnual, double valorEmprestimo) {
        return (valorEmprestimo <= ValorMaxEmprestimo) && (rendaAnual >= 3 * valorEmprestimo);
    }
}
