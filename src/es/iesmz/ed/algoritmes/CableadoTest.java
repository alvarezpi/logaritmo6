package es.iesmz.ed.algoritmes;

public class CableadoTest {
    public static void main(String[] args) {
        Cableado cableado1 = new Cableado(new String[]{"*HM"});
        System.out.println("¿Se puede formar un círculo? " + cableado1.esPotConnectar());

        Cableado cableado2 = new Cableado(new String[]{"*HH"});
        System.out.println("¿Se puede formar un círculo? " + cableado2.esPotConnectar());

        Cableado cableado3 = new Cableado(new String[]{"*HM", "*MH"});
        System.out.println("¿Se puede formar un círculo? " + cableado3.esPotConnectar());

        Cableado cableado4 = new Cableado(new String[]{"*HM", "*HH", "MM"});
        System.out.println("¿Se puede formar un círculo? " + cableado4.esPotConnectar());
    }
}
