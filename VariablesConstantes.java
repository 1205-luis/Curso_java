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
    }
}
