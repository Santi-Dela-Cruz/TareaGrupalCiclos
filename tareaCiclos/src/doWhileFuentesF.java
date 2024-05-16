import java.util.Scanner;

public class doWhileFuentesF {
    public void apellidoDoWhile(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ingrese el tamaño: ");
        int tamano = scanner.nextInt();
    
        System.out.print("Ingrese el carácter: ");
        char caracter = scanner.next().charAt(0);
    
        int i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.println();
    
        i = 0;
        do {
            System.out.println(caracter);
            int j = 0;
            do {
                if (i == tamano / 4) {
                    System.out.print(caracter);
                }
                j++;
            } while (j < tamano - 1);
            System.out.println(caracter);
            i++;
        } while (i < tamano / 2);
    }
}
