package Semana13;

public class ArrayBi03 {
    public static void main(String[] args) {

        int[][] n = new int[3][2];

        int f, c;

        for (f = 0; f < 3; f++) {
            for (c = 0; c < 2; c++) {
                n[f][c] = (int)(Math.random()*100+0);
            }
        }

        for ( f = 0; f < 3 ; f++) { // para las filas
            System.out.print("Fila "+f+": ");

            for (c = 0; c < 2; c++) { // para las columnas
                System.out.printf("%10d", n[f][c]);                
            }
            System.out.println();
         }
    }
}
