package Semana5.Ejercicios;

public class Ejercicio01s5 {
    public static void main(String[] args) {
        /*
         * Ejercicio 1
         * Escribe un programa en que dado un número del 1 a 7
         * escriba el correspondiente nombre del día de la semana.
         * 
         */
        int numero = 0;

        System.out.println("Ingrese un numero del 1 al 7: ");
        numero = Integer.parseInt(System.console().readLine());

        if (numero == 1) {
            System.out.println("Lunes");
        }
        if (numero == 2) {
            System.out.println("Martes");
        }
        if (numero == 3) {
            System.out.println("Miercoles");
        }
        if (numero == 4) {
            System.out.println("Jueves");
        }
        if (numero == 5) {
            System.out.println("Viernes");
        }
        if (numero == 6) {
            System.out.println("Sábado");
        }
        if (numero == 7) {
            System.out.println("Domingo");
        }

    }
}
