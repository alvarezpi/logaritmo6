package es.iesmz.ed.algoritmes;

public class DividirFactorialTest {
    public static void main(String[] args) {
        // Prueba con numerador mayor que el denominador
        DividirFactorial division1 = new DividirFactorial(5, 3);
        double resultado1 = division1.divisio();
        System.out.println("Resultado de la división (5 / 3): " + resultado1); // Debe imprimir "Resultado de la división (5 / 3): 20"

        // Prueba con numerador igual al denominador
        DividirFactorial division2 = new DividirFactorial(6, 6);
        double resultado2 = division2.divisio();
        System.out.println("Resultado de la división (6 / 6): " + resultado2); // Debe imprimir "Resultado de la división (6 / 6): 1"

        // Prueba con numerador menor que el denominador
        DividirFactorial division3 = new DividirFactorial(4, 6);
        double resultado3 = division3.divisio();
        System.out.println("Resultado de la división (4 / 6): " + resultado3); // Debe imprimir "Resultado de la división (4 / 6): 0.03333333333"
    }

}
