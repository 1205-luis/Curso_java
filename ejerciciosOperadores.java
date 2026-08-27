public class ejerciciosOperadores {

    public static void main(String[] args) {

        //1
        System.out.println("Aquí empieza el ejercicio #1");
        int resultadoSuma = 15 + 5;
        System.out.println("el resultado de la suma es: " + resultadoSuma);

        int resultadoResta = 20 - 10;
        System.out.println("el resultado de la resta es: " + resultadoResta);

        int resultadoMulti = 2 * 4;
        System.out.println("El resultado de la multiplicación es: " + resultadoMulti);

        int resultadoMudulo = 10 % 5;
        System.out.println("El resultado del modulo es: " + resultadoMudulo);
        
        //2
        System.out.println("Aquí empieza el ejercicio #2");

        var a = 5 < 4;
        System.out.println("El resultado de la comparación es: " + a);

        var b = 6 >= 8;
        System.out.println("El resultado de la comparación es: " + b);

        var c = 2 != 8;
        System.out.println("El resultado de la comparación es: " + c);

        //3

        System.out.println("Aquí empieza el ejercicio #3");

        int e = 4;
        int f = 4;
        var d = e == f;
        System.out.println("El resultado de la comparación es: " + d);

        int g = 5;
        int h = 6;
        var i = h != g;
        System.out.println("El resultado de la comparación es: " + i);

        //4
        System.out.println("Aquí empieza el ejercicio #4");

        System.out.println("El resultado de la comparación es: " + (g <= f));
        System.out.println("El resultado de la comparación es: " + (h == f));

        //5

        System.out.println("Aquí empieza el ejercicio #5");

        System.out.println("El resultado del ope logico es: " + (5 == 8 & 10 < 5));
        System.out.println("El resultado del ope logico es: " + (h > e & f < g));

        //6 
        System.out.println("Aquí empieza el ejercicio #6");

        System.out.println(6 > 8 || 5 != 2 );

        //7 
        System.out.println("Aquí empieza el ejercicio #7");

        System.out.println(5 < 10 & 10 > 2 );

        //8

        System.out.println("Aquí empieza el ejercicio #8");

        System.out.println("E no es menor que H: " + (! (e < h)));

        //9
        System.out.println("Aquí empieza el ejercicio #9");

        System.out.println(++f);
        System.out.println(h);
        System.out.println(++h);
        //System.out.println(g);
        
        //10
        System.out.println("Aquí empieza el ejercicio #10");

        int j = 8;
        int q = 10;
        int l = 20;
        int p = 15;

        var x = l + q & j - p &  p * j;
        System.out.println(x);
         



        

        

    }
}
