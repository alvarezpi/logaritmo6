package es.iesmz.ed.algoritmes;

public class PolidivisibleTest {
    public static void main(String[] args) {
        Polidivisible polidivisible1 = new Polidivisible(102);
        System.out.println("¿Es polidivisible? " + polidivisible1.esPolidivisible());

        Polidivisible polidivisible2 = new Polidivisible(9876);
        System.out.println("¿Es polidivisible? " + polidivisible2.esPolidivisible());

        Polidivisible polidivisible3 = new Polidivisible(20456);
        System.out.println("¿Es polidivisible? " + polidivisible3.esPolidivisible());

        Polidivisible polidivisible4 = new Polidivisible(381654729);
        System.out.println("¿Es polidivisible? " + polidivisible4.esPolidivisible());
    }
}
