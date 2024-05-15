public class forDanteZambranoLetrasDZ {
    
        public void forDanteZambranoDZ(int tamano,String letra) {
            // Imprimir la primera fila de la D y la primera fila de la Z
            System.out.print(letra + letra + letra + " ");
            for (int i = 0; i < tamano - 3; i++) {
                System.out.print(letra);
            }
            System.out.print("  ");
            for (int i = 0; i < tamano; i++) {
                System.out.print(letra);
            }
            System.out.println();
    
            // Imprimir las filas intermedias de la D y las filas intermedias de la Z
            for (int i = 1; i < tamano - 1; i++) {
                System.out.print(letra + " " + " ");
                for (int j = 0; j < tamano - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print(letra + "  ");
                for (int j = 0; j < tamano - i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println(letra);
            }
    
            // Imprimir la última fila de la D y la última fila de la Z
            System.out.print(letra + letra + letra + " ");
            for (int i = 0; i < tamano - 3; i++) {
                System.out.print(letra);
            }
            System.out.print("  ");
            for (int i = 0; i < tamano; i++) {
                System.out.print(letra);
            }
            System.out.println();
        }
    

}
