package Semana14;

import Funciones.Matematicas;

public class Funcion1 {
    public static void main(String[] args) {

        System.out.println("Ingrese un número entero positivo: ");
        int n = Integer.parseInt(System.console().readLine());

        if (Matematicas.esPrimo(n)) {
            System.out.println("El " + n + " es primo");
        } else {
            System.out.println("El " + n + " NO es primo");
        }
    }


}
