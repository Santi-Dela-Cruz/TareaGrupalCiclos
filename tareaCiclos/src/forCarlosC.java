package carlosfuentes;
import java.util.Scanner;

public class forCarlosC {
     public void inicial(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño: ");
        int tamaño = scanner.nextInt();

        System.out.println("Ingrese el carácter: ");
        char caracter = scanner.next().charAt(0);

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == 0 || i == tamaño - 1 || j == 0) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
