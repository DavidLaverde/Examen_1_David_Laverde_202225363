package examenTMB;

public class Main {
    public static void main(String[] args) {
        Persona hombre = new Hombre(70, 175, 30);
        Persona mujer = new Mujer(60, 165, 25);

        System.out.println("TMB del hombre: " + hombre.calcularTMB());
        System.out.println("TMB de la mujer: " + mujer.calcularTMB());
    }
}