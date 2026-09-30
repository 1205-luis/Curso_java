public class condicionales {
    public static void main(String[] args){
        /*
        el if es una estructura de control que nos permite ejecutar un bloque de código si se cumple una condición.

        Se utilizan los operadores de comparación para evaluar la condición, como por ejemplo: ==, !=, >, <, >=, <=.
        */
        int edad = 20;
        if (edad >= 18){
            System.out.println("eres mayor de edad y puedes entrar a la discoteca");
        }
        System.out.println("fin del programa");

        /*
         else es una estructura de control que nos permite ejecutar un bloque de código si se cumple una condición y otro bloque de código si no se cumple la condición.
        */
        int edad2 = 15;
        if (edad2 >= 18){
            System.out.println("eres mayor de edad y puedes entrar a la discoteca");
        } else if (edad2 >= 13){
            System.out.println("eres adolescente y puedes entrar solo con acompañamiento");
        } else{
            System.out.println("no eres mayor de edad y no puedes entrar a la discoteca");
        }
        
        double nota = 5;
        if (nota == 5){
            System.out.println("Aprobado cvg ");
        }
        else if (nota == 3.5) {
            System.out.println("Pasaste cvg ");
        }
        else{
            System.out.println("No pasaste cvg ");
        }

        /*
        Combinación con condiciones
        */
       int años =  22;
       boolean licencia = true;

       if (años >= 18 && licencia){
            System.out.println("Puedes andar con el vehiculo ");
       }
       else if (años <= 17 || !licencia ){
            System.out.println("Usted no puede andar en vehiculo ");
       }
       else{
        System.out.println("Quedate en casa gnr ");
       }

    }

    
}
