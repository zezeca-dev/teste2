import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        // Criando o scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar a quantidade de notas
        System.out.print("Digite o número de notas que deseja calcular: ");
        int quantidade = scanner.nextInt();

        // Verificar se a quantidade é válida
        if (quantidade <= 0) {
            System.out.println("Quantidade de notas inválida!");
            return;
        }

        // Variável para armazenar a soma das notas
        double soma = 0;

        // Capturar as notas
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        // Calcular e exibir a média
        double media = soma / quantidade;
        System.out.printf("A média das notas é: %.2f%n", media);

        // Fechar o scanner
        scanner.close();
    }
}
