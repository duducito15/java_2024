package Semana9;

public class Aleatorio01 {
    public static void main(String[] args) {
        System.out.println("Generar 10 números aleatorios");

        for (int i = 1; i <11 ; i++) {
            //System.out.println(Math.random()); 

            //System.out.println(Math.random()*10);

            System.out.println((int)(Math.random()*10+1));
        }
    }
}
