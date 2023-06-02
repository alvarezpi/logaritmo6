package es.iesmz.ed.algoritmes;

import java.util.ArrayList;
import java.util.List;

/**
* Esta es una clase que describe unos cables para hacer una conexion
* @author: Pilar Alvarez
* @version: 02/06/2023/
*/
public class Cableado {
    private List<String> conectores;
/**
* Constructor que recibe un vector de conectores en forma de array de Strings
* @param conectores El parametro define la cifra  que se analizará
*
*/
    public Cableado(String[] conectores) {
        this.conectores = new ArrayList<>();
        for (String conector : conectores) {
            this.conectores.add(conector);
        }
    }

/**
* Metodo que cuenta los conectores machos y hembras por lo que seuman a ambos contadores
* @return el resultado de la división
*/
    public boolean esPotConnectar() {
        int numMachos = 0;
        int numHembras = 0;

        for (String conector : conectores) {
            if (conector.equals("*HM") || conector.equals("MH")) {
                numMachos++;
                numHembras++;
            } else if (conector.equals("*HH")) {
                numHembras += 2;
            } else if (conector.equals("*MM")) {
                numMachos += 2;
            }
        }

        return numMachos % 2 == 0 && numHembras % 2 == 0;
    }
}
