package contabanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String agencia;
        do {
            System.out.println("Por favor, digite o número da Agência (4 dígitos):");
            agencia = scanner.nextLine();
            if (agencia.length() != 4 || !agencia.matches("[0-9]+")) {
                System.out.println("Por favor, informe uma agência válida com 4 dígitos.");
            }
        } while (agencia.length() != 4 || !agencia.matches("[0-9]+"));

        int numeroConta;
        do {
            System.out.println("Por favor, digite o número da Conta (6 dígitos):");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, informe uma conta válida com 6 dígitos.");
                scanner.next();
            }
            numeroConta = scanner.nextInt();
            if (String.valueOf(numeroConta).length() != 6) {
                System.out.println("Por favor, informe uma conta válida com 6 dígitos.");
            }
        } while (String.valueOf(numeroConta).length() != 6);

        scanner.nextLine();

        String nomeCliente;
        do {
            System.out.println("Por favor, digite o nome do Cliente:");
            nomeCliente = scanner.nextLine();
            if (!nomeCliente.matches("[a-zA-Z ]+")) {
                System.out.println("Por favor, informe um nome válido contendo apenas letras.");
            }
        } while (!nomeCliente.matches("[a-zA-Z ]+"));

        double saldo;
        do {
            System.out.println("Por favor, digite o saldo:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, informe um saldo válido.");
                scanner.next();
            }
            saldo = scanner.nextDouble();
        } while (saldo < 0);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}