package Funciones;

public class Matematicas {
    
    //Funcion que detemrina si un numero entero positivo es Primo
    public static boolean esPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }

    //Funcion que calcula el area de un cuadrado
    public static double areaCuadrado(double lado){
        return Math.pow(lado, 2);
    }

    //Funcion que calcula el area de un circulo
    public static double areaCirculo(double radio){
        return 3.1416 * radio * radio;
    }

    //Funcion que calcula el area de un triangulo
    public static double areaTriangulo(double base, double altura){
        return base * altura;
    }
    //Funcion que calcula el area de un Rectangulo
    public static double areaRectangulo(double base, double altura){
        return (base * altura)/2;
    }

}
