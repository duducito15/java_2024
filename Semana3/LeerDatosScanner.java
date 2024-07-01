package Semana3;

import java.util.Scanner;

public class LeerDatosScanner {
    public static void main(String[] args) {
        //La Clases Scanner
        Scanner lee = new Scanner(System.in);

        System.out.print("Introduce tu nombre y edad separados por un espacio: ");
        String nombre = lee.next();
        int edad = lee.nextInt();

        System.out.println("Tu nombre es: "+ nombre +", tu edad es: "+edad);





    }
}
