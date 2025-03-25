
import java.util.Scanner;

public class ContaTerminal {

    
    public static void main(String [] args) {
        Scanner cb = new Scanner(System.in);

        System.out.print("digite o número da agencia: ");
        int agencia = cb.nextInt();

        System.out.print("digite o número da conta: ");
        int numero = cb.nextInt();

        System.out.print("digite seu nome: ");
        String nomeCliente = cb.next();
        cb.close();

        double saldo = 237.48;

        System.out.print("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta " +numero+ " e seu saldo R$" +saldo+ " já está disponível para saque!");
        }
        
           
}
