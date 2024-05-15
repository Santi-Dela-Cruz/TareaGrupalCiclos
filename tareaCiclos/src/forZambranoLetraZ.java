public class forZambranoLetraZ {
   

    public void forZambranoZ(int tamano, String disenoLetra) {
        
        // Primera linea
        for (int i = 0; i < tamano; i++) {
            System.out.print(disenoLetra);
        }
        System.out.println();

        // Lineas medias
        for (int i = 1; i < tamano - 1; i++) {
            for (int j = 0; j < tamano - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(disenoLetra);
        }

        // Ultima linea
        for (int i = 0; i < tamano; i++) {
            System.out.print(disenoLetra);
        }
        System.out.println();
    }


}