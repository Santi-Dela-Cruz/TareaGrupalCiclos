public class WhileZambranoLetraZ {
    public void whileZambranoZ(int tamano, String letra) {
        int cont = 1;

        // Primera linea
        while (cont <= tamano) {
            System.out.print(letra);
            cont++;
        }
        System.out.println();
        cont = 1;

        // Lineas medias 
        while (cont < tamano - 1) {
            int espacios = tamano - cont - 1;
            while (espacios > 0) {
                System.out.print(" ");
                espacios--;
            }
            System.out.println(letra);
            cont++;
        }

        // Ultima linea
        cont = 1;
        while (cont <= tamano) {
            System.out.print(letra);
            cont++;
        }
        System.out.println();
    }
}
