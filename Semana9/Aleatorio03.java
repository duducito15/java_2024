package Semana9;

public class Aleatorio03 {
    public static void main(String[] args) {
        System.out.println("Genera al azar Piedra, Papel o Tijera");

        int mano = (int) (Math.random() * 3);

        switch (mano) {
            case 0:
                System.out.println("Piedra");
                break;
            case 1:
                System.out.println("Papel");
                break;
            case 2:
                System.out.println("Tijera");
                break;
            default:
                break;
        }
    }
}
/* Reto 1: Hacer un programa en java que simula el lanzamiento de 2 dados
 saldra un mensaje de ganador siempre y cuando el resultado de la suma de los 
 valores de los dados sea igual a 7
*/