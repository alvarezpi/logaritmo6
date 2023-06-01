package es.iesmz.ed.algoritmes;

public class AnioTest {
    public static void main(String[] args) {
        // Prueba con un año sin dígitos repetidos
        Anio anio1 = new Anio(2023);
        int cantidadDigitosRepetidos1 = anio1.digitsDiferents();
        System.out.println("Año: 2023");
        System.out.println("Cantidad de dígitos repetidos: " + cantidadDigitosRepetidos1); // Debe imprimir "Cantidad de dígitos repetidos: 1"

        // Prueba con un año con un dígito repetido
        Anio anio2 = new Anio(2024);
        int cantidadDigitosRepetidos2 = anio2.digitsDiferents();
        System.out.println("Año: 2024");
        System.out.println("Cantidad de dígitos repetidos: " + cantidadDigitosRepetidos2); // Debe imprimir "Cantidad de dígitos repetidos: 0"

        // Prueba con un año con múltiples dígitos repetidos
        Anio anio3 = new Anio(2005);
        int cantidadDigitosRepetidos3 = anio3.digitsDiferents();
        System.out.println("Año: 2005");
        System.out.println("Cantidad de dígitos repetidos: " + cantidadDigitosRepetidos3); // Debe imprimir "Cantidad de dígitos repetidos: 1"
    }
}