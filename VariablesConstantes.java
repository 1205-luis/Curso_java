public class VariablesConstantes {
    
    public static void main(String[] args) {
        
        String name = "luis";
        System.out.println(name);

        name = "eduardo";
        System.out.println(name);

        /*
        Esto no se puede hacer porque java es de tipo fuerte, por lu cual no se le puede pasar un int a una variable ya designada como string.
         
        name = "20";
        System.out.println(name);

        */

        int age = 20;
        System.out.println("tiene " + age + " años");

        // constantes
        /*
        para definir una constante se debe agregar un "final al inicio"
        y para una buena practica e identificar las constantes se debe poner la variable en Mayus.
        */
        final String EMAIL = "luis123@gmail.com";
        System.out.println(EMAIL);

        /*
        "var" es una asignación a una variable, que lo toma como tipo string, int, double, boolean...
        pero es una cosa u otra, no se puede poner "var int..." o es una o es la
        */
        var email ="luis1@gmail.com";
        System.out.println(email);

        var years = 20;
        System.out.println(years);

        var decimal = 3.1415;
        System.out.println(decimal);

    }
}
