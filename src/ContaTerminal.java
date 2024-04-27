import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //Criando um objeto Scanner para ler a entrada o usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que digite as suas informações

//        Nome do cliente
        System.out.println("Por favor, digite seu nome");
        String nameUser = scanner.nextLine();

//        Nome da agência
        System.out.println("Por favor, digite o nome da Agência!");
        String agencyUser = scanner.nextLine();

//        Numero da agência
        System.out.println("Por favor, digite o número da Agência");
        int numeroAgencia = Integer.parseInt(scanner.nextLine());

//        Saldo do cliente
        System.out.println("Digite o saldo da sua conta: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        // Exibindo a mensagem
        System.out.println(
                "Olá " + nameUser + "," + "obrigado por criar uma conta em nosso banco, sua agência é " +
                agencyUser + " conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque."
        );

    }
}
