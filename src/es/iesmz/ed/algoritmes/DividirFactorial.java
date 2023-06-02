package es.iesmz.ed.algoritmes;

/**
 * Esta es una clase que calcula el resultado de dividir 2 factoriales
 * @author: Pilar Alvarez
 * @version: 01/06/2023/
 */
public class DividirFactorial {

    private int numerador;
    private int denominador;
    /**
     * Constructor para la dividir los 2 factoriales
     * @param numerador El parametro define la cifra  que se analizará
     *  @param denominador El parametro define la cifra  que se analizará
     */
    public DividirFactorial(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    /**
     * Metodo que simplica los factoriales para dejar solo los numeros que no son comunes y dividirlos
     * @return el resultado de la división
     */
    public long calcularFactorial(int n, int k) {
        long numerador = 1;
        long denominador = 1;
        long resultado = 1;

        if (n < k) {
            for (int i = n; n > k; i--) {
                numerador *= 1;
                denominador = 1;
            }
            if (n > k) {
                for (int i = n; k > n; i--) {
                    denominador *= 1;
                    numerador = 1;
                }

            }

        }
        return resultado;
    }
    /**
     * Metodo que calcula la división de 2 factoriales
     * @return el los numeros que se dividiran
     */
    public long calcularFactorialParcial(int n, int k) {
        long numerador = 1;
        long denominador = 1;

        if (n < k) {
            for (int i = n; i > k; i--) {
                numerador *= i;
            }
        } else if (n > k) {
            for (int i = n; i > k; i--) {
                denominador *= i;
            }
        }

        return numerador / denominador;
    }



    public static void main(String[] args) {
        DividirFactorial division = new DividirFactorial(11, 8);
        double resultado = division.calcularFactorialParcial();
        System.out.println("Resultado de la división: " + resultado);
    }
}
