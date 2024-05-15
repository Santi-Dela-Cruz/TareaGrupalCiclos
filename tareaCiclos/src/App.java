public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("TAREA GRUPAL CICLOS");
        System.out.println("- Jonathan Cuasapaz");
        ForJonathanLetraJ fj = new ForJonathanLetraJ();
        ForJonathanLetraC fc = new ForJonathanLetraC();
        ForJonathanLetrasJC fjc = new ForJonathanLetrasJC();
        WhileJonathanLetraJ wj = new WhileJonathanLetraJ();
        WhileJonathanLetraC wc = new WhileJonathanLetraC();
        WhileJonathanLetrasJC wjc = new WhileJonathanLetrasJC();
        DoWhileJonathanLetraJ dwj = new DoWhileJonathanLetraJ();
        DoWhileJonathanLetraC dwc = new DoWhileJonathanLetraC();
        DoWhileJonathanLetrasJC dwjc = new DoWhileJonathanLetrasJC();
        fj.imprimirLetraJFor(7, '+');
        fc.imprimirLetraCFor(7, '+');
        fjc.imprimirLetrasJCFor(7, '+');
        wj.imprimirLetraJWhile(7, '+');
        wc.imprimirLetraCWhile(7, '+');
        wjc.imprimirLetrasJCWhile(7, '+');
        dwj.imprimirLetraJDoWhile(7, '+');
        dwc.imprimirLetraCDoWhile(7, '+');
        dwjc.imprimirLetrasJCDoWhile(7, '+');
        System.out.println();

        System.out.println("- Kevin De La Cruz");
        serieFor for_KD = new serieFor();
        whileSerieKD  while_KD = new whileSerieKD();
        doWhileSerieKD doWhile_KD = new doWhileSerieKD();
<<<<<<< HEAD
        for_KD.imprimir_forKevinLetraK(9, '*');
        for_KD.imprimir_forDelaCruzLetraD(9, '*');
        for_KD.imprimir_forKevinDelaCruzLetrasKD(9, 9, '*');
        while_KD.imprimir_whileKevinLetraK(9, '*');
        while_KD.imprimir_whileKevinDelaCruzLetrasKD(9, 9, '*');
        while_KD.imprimir_whileKevinDelaCruzLetrasKD(9, 9, '*');
        doWhile_KD.imprimir_doWhileKevinLetraK(9, '*');
        doWhile_KD.imprimir_doWhileDelaCruzLetraD(9,'*');
        doWhile_KD.imprimir_doWhileKevinDelaCruzLetrasKD(9, 9, '*');
=======
        for_KD.forKevinK(9, '*');
        for_KD.forDelaCruzD(9, '*');
        for_KD.forKevinDelaCruzKD(9, 9, '*');
        while_KD.whileKevinK(9, '*');
        while_KD.whileDelaCruzD(9, '*');
        while_KD.whileKevinDelaCruzKD(9, 9, '*');
        doWhile_KD.doWhileKevinK(9, '*');
        doWhile_KD.doWhileDelaCruzD(9, '*');
        doWhile_KD.doWhileKevinDelaCruzKD(9, 9, '*');
        System.out.println();

        System.out.println("- Marcos Cuenca");
        System.out.println("Letras con ciclo For");
        System.out.println();

        ForMarcosLetraM imprimirMCicloFor = new ForMarcosLetraM();
        imprimirMCicloFor.imprimirMFor('*', 7);
        System.out.println();
        ForMarcosLetraC imprimirCCicloFor = new ForMarcosLetraC();
        imprimirCCicloFor.imprimirCFor('*', 7);
        System.out.println();
        ForMarcosLetraMC imprimirMCCicloFor = new ForMarcosLetraMC();
        imprimirMCCicloFor.imprimirMCFor('*', 7);
        System.out.println();

        System.out.println("Letras con ciclo While");
        WhileMarcosLetraM imprimirMCicloWhile = new WhileMarcosLetraM();
        imprimirMCicloWhile.imprimirMWhile('*', 7);
        System.out.println();
        WhileMarcosLetraC imprimirCCicloWhile = new WhileMarcosLetraC();
        imprimirCCicloWhile.imprimirCWhile('*', 7);
        System.out.println();
        WhileMarcosLetraMC imprimirMCCicloWhile = new WhileMarcosLetraMC();
        imprimirMCCicloWhile.imprimirMCWhile('*', 7);
        System.out.println();

        System.out.println("Letras con ciclo Do While");
        DoWhileMarcosLetraM imprimirMCicloDoWhile = new DoWhileMarcosLetraM();
        imprimirMCicloDoWhile.imprimirMDoWhile('*', 7);
        System.out.println();
        DoWhileMarcosLetraC imprimirCCicloDoWhile = new DoWhileMarcosLetraC();
        imprimirCCicloDoWhile.imprimirCDoWhile('*', 7);
        System.out.println();
        DoWhileMarcosLetraMC imprimirMCCicloDoWhile = new DoWhileMarcosLetraMC();
        imprimirMCCicloDoWhile.imprimirMCDoWhile('*', 7);
        System.out.println();
>>>>>>> 823844f7e861bee8e260760c2deeb0efd179d536
    }
}
