package Semana12;

public class EjerArray02 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que genere 50 números enteros aleatorios de 0 a 100
         * y que luego muestre esos números junto con la palabra “par” o “impar” según proceda.
         */
        int[] numeros = new int[50];
        int i;

        for (i = 0; i < numeros.length; i++) {
            numeros[i]= (int)(Math.random()*100+0);
        }

        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]+" par");
            } else {
                System.out.println(numeros[i]+" impar");
            }
        }

    }
}
