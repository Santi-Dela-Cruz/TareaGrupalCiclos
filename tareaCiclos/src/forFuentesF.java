package carlosfuentes;
import java.util.Scanner;

public class forFuentesF {
    public void apellido(String[] args) {
     Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ingrese el tamaño: ");
        int tamano = scanner.nextInt();

        System.out.print("Ingrese el carácter: ");
        char caracter = scanner.next().charAt(0);

        for (int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.println();

        for (int i = 0; i < tamano / 2; i++) {
            System.out.println(caracter);
            for (int j = 0; j < tamano - 1; j++) {
                if (i == tamano / 4) {
                    System.out.print(caracter);
                }
            }
            System.out.println(caracter);
        }
         
       
    }
}
