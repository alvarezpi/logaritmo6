package es.iesmz.ed.algoritmes;

/**
 * Esta es una clase que determina si un número es o no hyperpar.
 * @author: Pilar Alvarez
 * @version: 01/06/2023/
 */
public class Hyperpar {

    //Campo de la clase
    private long numero;

    /** Constructor para la serie de números hyperpar
     * @param numero El parámetro define el número que se analizará
     */
    public Hyperpar(long numero) {
        this.numero = numero;
    }

    /**
     * Método que devuelve si es o no hyperpar, dividiendo cada digito por 2.
     * @return si es false o true
     */
    public boolean esHyperPar() {
        /*return (numero % 4 == 0);*/
        long resto;
        while (numero != 0) {
            resto = numero % 10; // Obtener el dígito menos significativo
            if (resto % 2 != 0) {
                return false; // Si el dígito no es divisible por 2, retornar falso
            }
            numero = numero / 10; // Eliminar el dígito menos significativo
        }
        return true; // Todos los dígitos son divisibles por 2
    }


}

