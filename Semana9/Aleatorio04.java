package Semana9;

public class Aleatorio04 {
    public static void main(String[] args) {
        /*
         * Reto 1: Hacer un programa en java que simula el lanzamiento de 2 dados
         * saldra un mensaje de ganador siempre y cuando el resultado de la suma de los
         * valores de los dados sea igual a 7
         */

        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;

        int suma = dado1 + dado2;

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Suma: " + suma);

        if (suma == 7) {
            System.out.println("¡Ganador!");
        } else {
            System.out.println("No ganaste...");
        }
    }
}
