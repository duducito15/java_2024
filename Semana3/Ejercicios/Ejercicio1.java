package Semana3.Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Realizar un conversor de euros a soles, la cantidad de euros que se quiere
        // convertir
        // debe ser ingresada por teclado.
        int euros;
        double soles;

        System.out.println("Ingrese un monto en Euros: ");
        euros = Integer.parseInt(System.console().readLine());

        soles = euros * 4.09;
        System.out.println("El valor en soles es: "+soles);

    }
}
