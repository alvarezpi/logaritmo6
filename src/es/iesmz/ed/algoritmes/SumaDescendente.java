package es.iesmz.ed.algoritmes;
/**
 * Esta es una clase que calcula la suma de un numero en forma descendente.Eliminando uno a uno
 * el digito mas significativo.
 * Ejemplo: 4578 = 4578 + 578 + 78 + 8 = 5242
 * @author: Pilar Alvarez
 * @version: 02/06/2023/
 */
public class SumaDescendente {
    private int numero;

    /**
     * Constructor para la suma de los digitos
     * @param numero El parametro define la cifra  que se analizará
     */
    public SumaDescendente(int numero){
        this.numero = numero;
    }
    /**
     * Metodo que elimina el digita y a continuacion suma los numeros
     * @return el resultado de la división
     */
    public int calcularSumaDescendente(){
        String numeroStr =String.valueOf(numero);
        int suma = 0;

        for (int i = 0; i < numeroStr.length(); i++){
            String subnumeroStr = numeroStr.substring(i);
            int subnumero = Integer.parseInt(subnumeroStr);
            suma += subnumero;
        }
        return suma;
    }

    public static void main(String[] args) {
        SumaDescendente suma = new SumaDescendente(325);
        int resultado = suma.calcularSumaDescendente();
        System.out.println("El resultado de la suma descendete es: " + resultado);
    }
}
