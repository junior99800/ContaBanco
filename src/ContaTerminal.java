
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura dos dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Pedindo o nome do usuário
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Pedindo agencia do usuário
        System.out.println("Por favor, digite o numero da Agencia!: ");
        String agencia = scanner.nextLine();

        // Pedindo numero do usuário
        System.out.println("Por favor, digite o numero da Conta!: ");
        int num = scanner.nextInt();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo os dados recebidos
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia + ", conta " + num + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o Scanner após uso
        scanner.close();
    }
}
