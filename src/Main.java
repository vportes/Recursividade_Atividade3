import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static boolean par(int numero) {
        if (numero == 0) {
            return true;
        } else {
            return impar(numero - 1);
        }
    }

    public static boolean impar(int numero) {
        if (numero == 0) {
            return false;
        } else {
            return par(numero - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qualquer letra para encerrar o programa.\n");
        while (true){
            System.out.print("Digite um número: ");
            try {
                int numero = sc.nextInt();
                if (numero < 0) {
                    System.out.println("Número negativo não é valido.\n");
                } else {
                    //utilizar a função par()
                    System.out.println("\nO número " + numero + (par(numero) ? " é " : " não é ") + "par.");
                    //utilizar a função impar()
                    System.out.println("O número " + numero + (impar(numero) ? " é " : " não é ") + "impar.\n");
                /*
                System.out.println("O numero é par?" + par(numero));
                System.out.println("O numero é impar?" + impar(numero));
                 */
                }
            } catch (InputMismatchException e) {
                System.out.println("Encerrando o programa.");
                break;
            }
        }
    }
}
