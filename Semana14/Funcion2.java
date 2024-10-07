package Semana14;

import Funciones.Matematicas;

public class Funcion2 {
    public static void main(String[] args) {
        double l, b, a, r;
        int op;

        System.out.println("Ingresa el numero de la operacion a realizar");
        System.out.println("--------------------------------------------");
        System.out.println("1. Area del cuadrado");
        System.out.println("2. Area del circulo");
        System.out.println("3. Area del triangulo");
        System.out.println("4. Area del rectangulo");

        op = Integer.parseInt(System.console().readLine());

        switch (op) {
            case 1:
                System.out.println("AREA DEL CUADRADO");
                System.out.println("-----------------");
                System.out.println("Ingrese el lado del cuadrado: ");
                l = Double.parseDouble(System.console().readLine());
                System.out.println("El area del cuadrado es: " + Matematicas.areaCuadrado(l));
                break;
            case 2:
                System.out.println("AREA DEL CIRCULO");
                System.out.println("----------------");
                System.out.println("Ingrese el radio del circulo: ");
                r = Double.parseDouble(System.console().readLine());
                System.out.println("El area del cuadrado es: " + Matematicas.areaCirculo(r));
                break;
            case 3:
                System.out.println("AREA DEL TRIANGULO");
                System.out.println("-------------------");
                System.out.println("Ingrese la base del triangulo: ");
                b = Double.parseDouble(System.console().readLine());
                System.out.println("Ingrese la altura del triangulo: ");
                a = Double.parseDouble(System.console().readLine());
                System.out.println("El area del triangulo es: " + Matematicas.areaTriangulo(b, a));
                break;
            case 4:
                System.out.println("AREA DEL RECTANGULO");
                System.out.println("-------------------");
                System.out.println("Ingrese la base del rectangulo: ");
                b = Double.parseDouble(System.console().readLine());
                System.out.println("Ingrese la altura del rectangulo: ");
                a = Double.parseDouble(System.console().readLine());
                System.out.println("El area del rectangulo es: " + Matematicas.areaRectangulo(b, a));
                break;

            default:
                break;
        }

    }
}
