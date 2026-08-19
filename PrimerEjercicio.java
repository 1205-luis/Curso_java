public class PrimerEjercicio {

    public static void main(String[] args) {
        
        //esta primera linea imprime mi nombre.
        System.out.println("Mi nombre es Luis Eduardo soto");

        // esta linea lo que hace es que cada palabra se imprima en una linea.
        System.out.println("hola \nmundo");

        // esta linea imprime datos sobre mi.
        System.out.println("Tengo 20 años \nsoy de Cali\nme gusta el color negro y el azul");

        // Esta linea no entiendo que hace, pero es diferente al system.out
        System.err.println("esto que hace");

        //En esta linea voy a imprimir una frase en varios print
        System.out.println("En");
        System.out.println("Cali");
        System.out.println("hace");
        System.out.println("calor");

        //En esta linea voy a utilizar el codigo ascii
        char letra = 'A';
        int codigoAscii = (int) letra;

        System.out.println("El código ASCII de " + letra + " es: " + codigoAscii);
        // Salida: El código ASCII de A es: 65
    }
    
}
