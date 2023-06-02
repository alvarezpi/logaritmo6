package es.iesmz.ed.algoritmes;

public class SumaDescendenteTest {
    public static void main(String[] args) {
        SumaDescendenteTest test = new SumaDescendenteTest();
        test.testCalcularSumaDescendente();
    }

    public void testCalcularSumaDescendente() {
        SumaDescendente suma1 = new SumaDescendente(4578);
        int resultado1 = suma1.calcularSumaDescendente();
        System.out.println("Suma descendente de 4578: " + resultado1);

        SumaDescendente suma2 = new SumaDescendente(12345);
        int resultado2 = suma2.calcularSumaDescendente();
        System.out.println("Suma descendente de 12345: " + resultado2);

        SumaDescendente suma3 = new SumaDescendente(987654321);
        int resultado3 = suma3.calcularSumaDescendente();
        System.out.println("Suma descendente de 987654321: " + resultado3);
    }
}
