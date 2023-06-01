package es.iesmz.ed.algoritmes;

import java.util.HashSet;
import java.util.Set;
/**
 * Esta es una clase que determina una serie de años con digitos repetidos
 * @author: Pilar Alvarez
 * @version: 01/06/2023/
 */
public class Anio {
    private final long anio;

    /**
     * Constructor para la serie de numeros Anio
     * @param anio El parametro define la cifra  que se analizará
     */
    public Anio(long anio) {
        this.anio = anio;
    }

    /**
     * Metodo que verifica cuantos digitos se repiten en la cifra año
     * @return si es false o true
     */
    public int digitsDiferents() {
        String anioString = String.valueOf(anio);
        Set<Character> digitosRepetidos = new HashSet<>();
        Set<Character> digitosVistos = new HashSet<>();

        for (char digito : anioString.toCharArray()) {
            if (digitosVistos.contains(digito)) {
                digitosRepetidos.add(digito);
            } else {
                digitosVistos.add(digito);
            }
        }

        return digitosRepetidos.size();
    }


}