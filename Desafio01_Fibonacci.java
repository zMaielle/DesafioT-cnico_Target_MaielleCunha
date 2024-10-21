/**
 *
 * @author Maielle Cunha
 */
import java.util.Scanner;

public class Desafio01_Fibonacci {
       
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se ele pertence a sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println("O numero " + numero + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O numero " + numero + " não pertence a sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean pertenceFibonacci(int numero) {
        int a = 0, b = 1;
        
        if (numero == 0 || numero == 1) {
            return true;
        }

        int proximoNumero = a + b;
        while (proximoNumero <= numero) {
            if (proximoNumero == numero) {
                return true;
            }
            a = b;
            b = proximoNumero;
            proximoNumero = a + b;
        }

        return false; 
    }
}
