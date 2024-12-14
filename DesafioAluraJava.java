import java.util.Random;
import java.util.Scanner;

public class DesafioAluraJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 900.00;

        System.out.println("**************************");
        System.out.println("Dados Iniciais do Cliente Itaú");
        System.out.println("Nome do cliente: Samuel");
        System.out.println("Tipo de conta: Corrente");
        System.out.printf("Saldo Inicial: %.2f%n", saldo);
        System.out.println("**************************");

        System.out.print("Deseja realizar alguma operação? (S/N): ");
        String login = sc.nextLine();

        if(login.equalsIgnoreCase("S") || login.equalsIgnoreCase("s")){
            System.out.println("Login com sucesso!");

            int operacao = 0;
            while (operacao != 4) {
                System.out.println("Operações: ");

                System.out.println("1 - Consultar saldo");
                System.out.println("2 - Receber valor");
                System.out.println("3 - Transferir valor");
                System.out.println("4 - Sair");
                System.out.print("Digite sua opção: ");
                operacao = sc.nextInt();

                if (operacao == 1) {
                    System.out.printf("Seu saldo: %.2f%n", saldo);
                }
                else if (operacao == 2){
                    System.out.println("Digite o valor que deseja receber: ");
                    double valorRecebido = sc.nextDouble();

                    saldo += valorRecebido;

                    System.out.println("Seu saldo agora: " + saldo);
                }
                else if (operacao == 3){
                    System.out.println("Digite o valor que deseja transferir: ");
                    double valorTransferido = sc.nextDouble();

                    if(valorTransferido > saldo){
                        System.out.println("Não há saldo para realizar a transferência!");
                        continue;
                    }

                    saldo -= valorTransferido;

                    System.out.printf("Seu saldo ficou: %.2f%n", saldo);
                }
                else if (operacao == 4){
                    System.out.println("Saindo da conta...");
                }
                else{
                    System.out.println("Valor invalido!");
                }

            }

        }
        else if (login.equalsIgnoreCase("N") || login.equalsIgnoreCase("n")){
            System.out.println("Saindo do sistema...");
        }else{
            System.out.println("Valor invalido!!");
        }

    }
}