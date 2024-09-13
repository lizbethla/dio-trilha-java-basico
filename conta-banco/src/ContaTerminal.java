import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, Digite Nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite Agência:");
        String agencia = scanner.next();

        System.out.println("Digite Numero de Conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite Saldo:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + ", conta " + numero
                + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
