public class forDanteLetraD {


    public void forDanteD(int tamano, String disenoLetra) {

        // Primera linea
        System.out.print(disenoLetra + disenoLetra + disenoLetra + " ");
        for (int i = 0; i < tamano - 3; i++) {
            System.out.print(disenoLetra);
        }
        System.out.println();

        // Lineas medias 
        for (int i = 1; i < tamano - 1; i++) {
            System.out.print(disenoLetra + " " + " ");
            for (int j = 0; j < tamano - 3; j++) {
                System.out.print(" ");
            }
            System.out.println(disenoLetra);
        }

        // Ultima linea
        System.out.print(disenoLetra + disenoLetra + disenoLetra + " ");
        for (int i = 0; i < tamano - 3; i++) {
            System.out.print(disenoLetra);
        }
        System.out.println();
    }

    

}
