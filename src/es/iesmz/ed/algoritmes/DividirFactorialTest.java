package es.iesmz.ed.algoritmes;

public class DividirFactorialTest {
    public static void main(String[] args) {
        DividirFactorialTest test = new DividirFactorialTest();
        test.testCalcularFactorialParcial();
    }

    public void testCalcularFactorialParcial() {
        DividirFactorial divisor = new DividirFactorial();

        // Ejemplo 1: n < k
        int n1 = 5;
        int k1 = 8;
        long resultado1 = divisor.calcularFactorialParcial(n1, k1);
        System.out.println("Factorial parcial de " + n1 + " y " + k1 + ": " + resultado1);

        // Ejemplo 2: n > k
        int n2 = 10;
        int k2 = 6;
        long resultado2 = divisor.calcularFactorialParcial(n2, k2);
        System.out.println("Factorial parcial de " + n2 + " y " + k2 + ": " + resultado2);

        // Ejemplo 3: n = k
        int n3 = 8;
        int k3 = 8;
        long resultado3 = divisor.calcularFactorialParcial(n3, k3);
        System.out.println("Factorial parcial de " + n3 + " y " + k3 + ": " + resultado3);
    }

}
