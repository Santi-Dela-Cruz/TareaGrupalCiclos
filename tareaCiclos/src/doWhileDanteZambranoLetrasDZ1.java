public class doWhileDanteZambranoLetrasDZ1 {
    
        public void doWhileDanteZambranoDZ(int tamano, String letra) {
            int cont = 1;
            int cont2 = 0;
    
            // Primera linea
            System.out.print(letra + letra + letra + " ");
            do {
                System.out.print(letra);
                cont++;
            } while (cont <= tamano - 3);
            System.out.print("  ");
            cont = 1;
            do {
                System.out.print(letra);
                cont++;
            } while (cont <= tamano);
            System.out.println();
            cont = 1;
            cont2 = 0;
    
            // Lineas medias 
            do {
                System.out.print(letra + " " + " ");
                cont++;
                do {
                    System.out.print(" ");
                    cont2++;
                } while (cont2 < tamano - 3);
                System.out.print(letra + "  ");
                int espacios = tamano - cont - 1;
                do {
                    System.out.print(" ");
                    espacios--;
                } while (espacios > 0);
                System.out.println(letra);
                cont2 = 0;
            } while (cont < tamano - 1);
    
            // Lineas Finales
            System.out.print(letra + letra + letra + " ");
            cont = 1;
            do {
                System.out.print(letra);
                cont++;
            } while (cont <= tamano - 3);
            System.out.print("  ");
            cont = 1;
            do {
                System.out.print(letra);
                cont++;
            } while (cont <= tamano);
            System.out.println();
        }
    
}
