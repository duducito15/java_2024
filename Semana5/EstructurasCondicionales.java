package Semana5;

public class EstructurasCondicionales {
    public static void main(String[] args) {
        //Estructura Condicional: Se utiliza para crear una bifurcacion en el flujo de 
        //ejecucion de las instrucciones del programa., esto depende 
        //de un valor o expresion condicional.
        String miFruta = "mandarina";

        if ("naranja".equals(miFruta)) {
            //Si la respuesta es verdadera
            System.out.println("son iguales");
        } else {
            //Caso que la respuesta sea falsa
            System.out.println("son distintas");
        }
    }
}
