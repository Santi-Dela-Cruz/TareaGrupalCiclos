package carlosfuentes;
import java.util.Scanner;

public class whileCarlosC {
    public  void inicialWhile(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño: ");
        int tamaño = scanner.nextInt();

        System.out.println("Ingrese el carácter: ");
        char caracter = scanner.next().charAt(0);

        int i = 0;
        while (i < tamaño) {
            int j = 0;
            while (j < tamaño) {
                if (i == 0 || i == tamaño - 1 || j == 0) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

