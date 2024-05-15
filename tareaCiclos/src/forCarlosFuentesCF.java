package carlosfuentes;
import java.util.Scanner;

public class forCarlosFuentesCF {
    public void iniciales(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño");
        int tamano = scanner.nextInt();

        System.out.println("Ingrese el carácter");
        char caracter = scanner.next().charAt(0);

        
        for (int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.print(" ");
        for (int i = 0; i < tamano ; i++) {
            System.out.print(caracter);
        }
        System.out.println();

        for (int i = 0; i < tamano / 2; i++) {
            System.out.print(caracter);
            System.out.print(" ");
            for (int j = 0; j < tamano - 1; j++) {
                if (i == tamano / 4) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(caracter);
        }

        for (int i = 0; i < tamano ; i++) {
            System.out.print(caracter);
        }
        
        
    }
}

    

