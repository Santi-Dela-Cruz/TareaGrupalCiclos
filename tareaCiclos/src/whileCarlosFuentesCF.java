package carlosfuentes;
import java.util.Scanner;

public class whileCarlosFuentesCF {
    public void inicialesWhile(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño:");
        int tamano = scanner.nextInt();

        System.out.println("Ingrese el carácter:");
        char caracter = scanner.next().charAt(0);

        int i = 0;
        while (i < tamano) {
            System.out.print(caracter);
            i++;
        }
        System.out.print(" ");

        i = 0;
        while (i < tamano) {
            System.out.print(caracter);
            i++;
        }
        System.out.println();

        i = 0;
        while (i < tamano / 2) {
            System.out.print(caracter);
            int j = 0;
            while (j < tamano - 1) {
                if (i == tamano / 4) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println(caracter);
            i++;
        }

        i = 0;
        while (i < tamano) {
            System.out.print(caracter);
            i++;
        }
    }
}
