package Semana3;

public class SaludoNombre {
    public static void main(String[] args) {
        // Lectura de datos desde teclado
        String nombre;
        System.out.println("Por favor, escribe tu nombre: ");
        nombre = System.console().readLine();
        System.out.println("Hola " + nombre);
    }
}
