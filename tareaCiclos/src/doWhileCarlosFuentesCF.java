
import java.util.Scanner;

public class doWhileCarlosFuentesCF {
     public void inicialesDoWhile(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño:");
        int tamano = scanner.nextInt();

        System.out.println("Ingrese el carácter:");
        char caracter = scanner.next().charAt(0);

        // Imprimir la primera línea
        int i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.print(" ");

        // Imprimir la segunda línea
        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.println();

        // Imprimir la parte central
        i = 0;
        do {
            System.out.print(caracter);
            int j = 0;
            do {
                if (i == tamano / 4) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < tamano - 1);
            System.out.println(caracter);
            i++;
        } while (i < tamano / 2);

        // Imprimir la última línea
        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
    }
}
