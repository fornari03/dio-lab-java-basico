import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        String nome, agencia;
        int numero;
        double saldo;

        System.out.print("Por favor, digite o nome do cliente: ");
        nome = input.nextLine();

        System.out.print("Por favor, digite a agência do cliente: ");
        agencia = input.next();

        System.out.print("Por favor, digite o número do cliente: ");
        numero = input.nextInt();

        System.out.print("Por favor, digite o saldo do cliente: ");
        saldo = input.nextDouble();

        System.out.printf(Locale.US, "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + String.format("%d", numero) + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.");

        input.close();
    }
}
