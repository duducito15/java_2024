package Semana14;

import Funciones.Matematicas;

public class Funcion3 {
    public static void main(String[] args) {
        /*
         * Crear una función que convierta el número n a un sistema de palos
         * y lo devuelva en una cadena de caracteres. 
         * Por ejemplo el 4016 en decimal 
         * es el |||| - - | - |||||| en el sistema de palos.
         * 
         * 356 -> ||| - ||||| - ||||||
         */

         System.out.println("el numero 356 en palotes es "+Matematicas.convierteEnPalos(356));
    }
}
