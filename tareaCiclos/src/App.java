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

        System.out.println("- Kevin De La Cruz");
        serieFor for_KD = new serieFor();
        whileSerieKD  while_KD = new whileSerieKD();
        doWhileSerieKD doWhile_KD = new doWhileSerieKD();
        for_KD.forKevinK(9, '*');
        for_KD.forDelaCruzD(9, '*');
        for_KD.forKevinDelaCruzKD(9, 9, '*');
        while_KD.whileKevinK(9, '*');
        while_KD.whileDelaCruzD(9, '*');
        while_KD.whileKevinDelaCruzKD(9, 9, '*');
        doWhile_KD.doWhileKevinK(9, '*');
        doWhile_KD.doWhileDelaCruzD(9, '*');
        doWhile_KD.doWhileKevinDelaCruzKD(9, 9, '*');
    }
}
