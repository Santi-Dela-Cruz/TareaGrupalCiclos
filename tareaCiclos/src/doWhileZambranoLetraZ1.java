public class doWhileZambranoLetraZ1 {
    public void doWhileZambranoZ(int tamano, String letra) {
        int cont = 1;

        // Primera linea 
        do {
            System.out.print(letra);
            cont++;
        } while (cont <= tamano);
        System.out.println();
        cont = 1;

        // Lineas medias 
        do {
            int espacios = tamano - cont - 1;
            do {
                System.out.print(" ");
                espacios--;
            } while (espacios > 0);
            System.out.println(letra);
            cont++;
        } while (cont < tamano - 1);

        // Ultima linea 
        cont = 1;
        do {
            System.out.print(letra);
            cont++;
        } while (cont <= tamano);
        System.out.println();
    }

}
