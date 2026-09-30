import java.util.Scanner;


public class pedirDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre peorra: ");
        String nombre = sc.nextLine();
        System.out.print("ingresa tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("que comida te gusta loca: ");
        String comida = sc.nextLine();

        System.out.println("hola " + nombre + " tenes " + edad + " años y te gusta " + comida );
       sc.close();  
    }
    /*
    para poder pedirle al usuario que ingrese datos se debe primero que todo importar el java.util.Scanner
    para poder pedir datos se crea una variable como Scanner (nombre que se le quiere dar a la variable) = new Scanner(System.in "esto es para que se pueda imprimir la opcion para entrar datos por teclado").
    para los textos se usa el nextLine(), para los numeros se usa el nextInt(), para los decimales se usa el nextDouble(), para los booleans nextBolean().
    */

}
