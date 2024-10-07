package Funciones;

public class Matematicas {

    // Funcion que detemrina si un numero entero positivo es Primo
    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }

    // Funcion que calcula el area de un cuadrado
    public static double areaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    // Funcion que calcula el area de un circulo
    public static double areaCirculo(double radio) {
        return 3.1416 * radio * radio;
    }

    // Funcion que calcula el area de un triangulo
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Funcion que calcula el area de un Rectangulo
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Funcion que cuente el numero de digitos que tiene un numero
    public static int digitos(int x) {
        // cuente los digitos
        int n = 0;
        while (x > 0) {
            x = x / 10;
            n++;
        }
        return n;
    }

    // Funcion que convierta en palos
    public static String convierteEnPalos(int n) {
        String resultado = "";
        while (n > 0) {
            int residuo = n % 10;
            if (residuo == 0) {
                resultado = " - " + resultado;
            } else {
                for (int i = 0; i < residuo; i++) {
                    resultado = "|" + resultado;
                }
            }
            n = n / 10;
        }

        return resultado.trim();
    }
}
