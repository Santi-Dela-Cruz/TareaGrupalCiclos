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
        for_KD.imprimir_forKevinLetraK(9, '*');
        for_KD.imprimir_forDelaCruzLetraD(9, '*');
        for_KD.imprimir_forKevinDelaCruzLetrasKD(9, 9, '*');
        while_KD.imprimir_whileKevinLetraK(9, '*');
        while_KD.imprimir_whileKevinDelaCruzLetrasKD(9, 9, '*');
        while_KD.imprimir_whileKevinDelaCruzLetrasKD(9, 9, '*');
        doWhile_KD.imprimir_doWhileKevinLetraK(9, '*');
        doWhile_KD.imprimir_doWhileDelaCruzLetraD(9,'*');
        doWhile_KD.imprimir_doWhileKevinDelaCruzLetrasKD(9, 9, '*');
        
        System.out.println();

        System.out.println("- Marcos Cuenca");
        System.out.println("Letras con ciclo For");
        System.out.println();

        forMarcosLetraM imprimirMCicloFor = new forMarcosLetraM();
        imprimirMCicloFor.imprimirMFor('*', 7);
        System.out.println();
        forMarcosLetraC imprimirCCicloFor = new forMarcosLetraC();
        imprimirCCicloFor.imprimirCFor('*', 7);
        System.out.println();
        forMarcosLetraMC imprimirMCCicloFor = new forMarcosLetraMC();
        imprimirMCCicloFor.imprimirMCFor('*', 7);
        System.out.println();

        System.out.println("Letras con ciclo While");
        whileMarcosLetraM imprimirMCicloWhile = new whileMarcosLetraM();
        imprimirMCicloWhile.imprimirMWhile('*', 7);
        System.out.println();
        whileMarcosLetraC imprimirCCicloWhile = new whileMarcosLetraC();
        imprimirCCicloWhile.imprimirCWhile('*', 7);
        System.out.println();
        whileMarcosLetraMC imprimirMCCicloWhile = new whileMarcosLetraMC();
        imprimirMCCicloWhile.imprimirMCWhile('*', 7);
        System.out.println();

        System.out.println("Letras con ciclo Do While");
        doWhileMarcosLetraM imprimirMCicloDoWhile = new doWhileMarcosLetraM();
        imprimirMCicloDoWhile.imprimirMDoWhile('*', 7);
        System.out.println();
        doWhileMarcosLetraC imprimirCCicloDoWhile = new doWhileMarcosLetraC();
        imprimirCCicloDoWhile.imprimirCDoWhile('*', 7);
        System.out.println();
        doWhileMarcosLetraMC imprimirMCCicloDoWhile = new doWhileMarcosLetraMC();
        imprimirMCCicloDoWhile.imprimirMCDoWhile('*', 7);
        System.out.println();
    }
}
