package carlosfuentes;
import java.util.Scanner;

public class doWhileCarlosC {
     public void inicialDoWhile(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño: ");
        int tamaño = scanner.nextInt();

        System.out.println("Ingrese el carácter: ");
        char caracter = scanner.next().charAt(0);

        int i = 0;
        do {
            int j = 0;
            do {
                if (i == 0 || i == tamaño - 1 || j == 0) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < tamaño);
            System.out.println();
            i++;
        } while (i < tamaño);
    }
}
