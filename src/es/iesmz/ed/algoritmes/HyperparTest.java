package es.iesmz.ed.algoritmes;

public class HyperparTest {
    public static void main(String[] args) {

        // Prueba con números hyperpar
        Hyperpar hyperpar1 = new Hyperpar(259786);
        System.out.println("Número: " + hyperpar1.esHyperPar()); // Debe imprimir "Número: 16"
        System.out.println("¿Es hyperpar? " + hyperpar1.esHyperPar()); // Debe imprimir "¿Es hyperpar? true"

        Hyperpar hyperpar2 = new Hyperpar(41);
        System.out.println("Número: " + hyperpar2.esHyperPar()); // Debe imprimir "Número: 40"
        System.out.println("¿Es hyperpar? " + hyperpar2.esHyperPar()); // Debe imprimir "¿Es hyperpar? true"

        // Prueba con números no hyperpar
        Hyperpar noHyperpar1 = new Hyperpar(25);
        System.out.println("Número: " + noHyperpar1.esHyperPar()); // Debe imprimir "Número: 27"
        System.out.println("¿Es hyperpar? " + noHyperpar1.esHyperPar()); // Debe imprimir "¿Es hyperpar? false"

        Hyperpar noHyperpar2 = new Hyperpar(36);
        System.out.println("Número: " + noHyperpar2.esHyperPar()); // Debe imprimir "Número: 15"
        System.out.println("¿Es hyperpar? " + noHyperpar2.esHyperPar()); // Debe imprimir "¿Es hyperpar? false"

    }
}
