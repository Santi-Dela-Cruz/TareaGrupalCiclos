public class whileDanteZambranoLetrasDZ1 {
    public void whileDanteZambranoDZ(int tamano, String letra) {
        int cont = 1;
        int cont2 = 0;

        // Imprimir la primera fila de la D y la primera fila de la Z
        System.out.print(letra + letra + letra + " ");
        while (cont <= tamano - 3) {
            System.out.print(letra);
            cont++;
        }
        System.out.print("  ");
        cont = 1;
        while (cont <= tamano) {
            System.out.print(letra);
            cont++;
        }
        System.out.println();
        cont = 1;
        cont2 = 0;

        // Imprimir líneas medias de la D y líneas medias de la Z
        while (cont < tamano - 1) {
            System.out.print(letra + " " + " ");
            cont++;
            while (cont2 < tamano - 3) {
                System.out.print(" ");
                cont2++;
            }
            System.out.print(letra + "  ");
            int espacios = tamano - cont - 1;
            while (espacios > 0) {
                System.out.print(" ");
                espacios--;
            }
            System.out.println(letra);
            cont2 = 0;
        }

        // Imprimir la última fila de la D y la última fila de la Z
        System.out.print(letra + letra + letra + " ");
        cont = 1;
        while (cont <= tamano - 3) {
            System.out.print(letra);
            cont++;
        }
        System.out.print("  ");
        cont = 1;
        while (cont <= tamano) {
            System.out.print(letra);
            cont++;
        }
        System.out.println();
    }


}
