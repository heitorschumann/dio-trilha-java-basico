import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String agencia, nomeCliente;
        int numeroConta;
        double saldo;

        System.out.println("Por favor, digite o numero da Agência! ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o numero da Conta! ");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o valor do primeiro depósito ");
        saldo = scanner.nextDouble();

        System.out.println("Por favor, digite seu Nome! ");
        nomeCliente = scanner.next() + " " + scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque ");

    }
}
