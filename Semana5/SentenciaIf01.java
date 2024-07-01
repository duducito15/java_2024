package Semana5;
public class SentenciaIf01 {
    public static void main(String[] args) {
        String respuesta = "";

        System.out.println("¿Cuál es la capital de Venezuela?");
        respuesta = System.console().readLine();

        if (respuesta.equals("Caracas")) {
            System.out.println("Eres un genio, debes estar en Sistemas");
        } else {
            System.out.println("Recoge tu pico y pala, ve a la chacra");
        }
    }
}
