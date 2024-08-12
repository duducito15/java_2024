package Semana9;

public class Aleatorio01 {
    public static void main(String[] args) {
        System.out.println("Generar 10 números aleatorios");

        for (int i = 1; i <11 ; i++) {
<<<<<<< HEAD
            //System.out.println(Math.random()); // genera numeros comprendidos entre 0 y 1
=======
           // System.out.println(Math.random()); 
>>>>>>> 63093b9a453aa27101878081a5bce951cd080798

            //System.out.println(Math.random()*10); // genera numeros comprendidos entre 0 y 10 con decimales

            System.out.println((int)(Math.random()*10+1)); // genera numeros aleatorios entre 0 y 10 pero enteros
        }
    }
}
