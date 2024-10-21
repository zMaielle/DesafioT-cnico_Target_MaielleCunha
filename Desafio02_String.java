/**
 *
 * @author Maielle Cunha
 */
import java.util.Scanner;

public class Desafio02_String {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();

        int contador = contarLetraA(texto);

        if (contador > 0) {
            System.out.println("A letra 'a' (maiuscula ou minuscula) existe na string.");
            System.out.println("Quantidade de vezes que a letra 'a' aparece: " + contador);
        } else {
            System.out.println("A letra 'a' (maiuscula ou minuscula) não existe na string.");
        }

        scanner.close();
    }

    public static int contarLetraA(String texto) {
      
        int contador = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        return contador; 
    }
}
