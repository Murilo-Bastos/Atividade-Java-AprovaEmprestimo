package main;

import java.util.Scanner;
import service.AnaliseRenda;
import service.AnaliseEmprestimo;

public class EmprestimoBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados do usuário
        System.out.print("Digite sua renda anual: ");
        double renda = scanner.nextDouble();

        System.out.print("Digite o valor do empréstimo desejado: ");
        double valorEmprestimo = scanner.nextDouble();

        // Criando um objeto da classe AnaliseRenda
        AnaliseRenda analiseRenda = new AnaliseRenda(renda);
        
        // Criando um objeto da classe AnaliseEmprestimo
        AnaliseEmprestimo analiseEmprestimo = new AnaliseEmprestimo();

        // Verificando se o empréstimo pode ser concedido
        if (analiseEmprestimo.podeConcederEmprestimo(analiseRenda.getRendaAnual(), valorEmprestimo)) {
            System.out.println("Empréstimo APROVADO!");
        } else {
            System.out.println("Empréstimo Negado");
        }

        // Fechando o scanner
        scanner.close();
    }
}
