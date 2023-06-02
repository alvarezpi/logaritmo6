package es.iesmz.ed.algoritmes;

/**
* Esta es una clase que describe unos cables para hacer una conexion
* @author: Pilar Alvarez
* @version: 02/06/2023/
 */
public class Polidivisible {
    private long numero;

    public Polidivisible(long numero) {
        this.numero = numero;
    }

    public boolean esPolidivisible() {
        int longitud = String.valueOf(numero).length();
        return esPolidivisibleRecursivo(numero, longitud);
    }

    private boolean esPolidivisibleRecursivo(long num, int longitud) {
        if (longitud == 1) {
            return true;
        }

        if (!tieneDigitosSecuenciales(num, longitud)) {
            return false;
        }

        long siguienteNum = num / 10;
        return esPolidivisibleRecursivo(siguienteNum, longitud - 1);
    }

    private boolean tieneDigitosSecuenciales(long num, int longitud) {
        String numeroStr = String.valueOf(num);

        for (int i = 0; i < longitud; i++) {
            int digito = Character.getNumericValue(numeroStr.charAt(i));
            if (digito != i) {
                return false;
            }
        }

        return true;
    }

}
