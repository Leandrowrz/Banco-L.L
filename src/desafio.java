import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nome = "Raquel Gouveia";
        String tipoConta = "Corrente";
        double saldo = 8000;
        int opcao = 0;

        System.out.println("*************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n*************************************");


        String menu = """
                **  Digite sua opção  **
               
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado: " + saldo);
            } else if (opcao == 2) {
                System.out.println(" Qual o valor a Transferir: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há Saldo suficiente para operação");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor Adquirido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo Saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção Inválida");
            }
        }

    }
}