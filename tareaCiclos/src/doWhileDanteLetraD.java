public class doWhileDanteLetraD {
    
        public void doWhileDanteD(int tamano, String letra) {
            int cont = 1;
            int cont2 = 0;
    
            // Primera linea
            System.out.print(letra + letra + letra + " ");
            do {
                System.out.print(letra);
                cont++;
            } while (cont <= tamano - 3);
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
                System.out.println(letra);
                cont2 = 0;
            } while (cont < tamano - 1);
    
            // Ultima linea
            System.out.print(letra + letra + letra + " ");
            cont = 1;
            do {
                System.out.print(letra);
                cont++;
            } while (cont <= tamano - 3);
            System.out.println();
        }
    
      
        
    

}
