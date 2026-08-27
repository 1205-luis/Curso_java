public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        //operadores aritmeticos
        var a = 5;
        var b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b); //el modulo es el sobrante de la división entre las varibles


        //operadores de asignación 

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        //asignación directa
        a += 1;
        System.out.println(a);
        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 3;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        //operadores de comparación (Relacionales)

        System.out.println(a == b);
        System.out.println(a == 0);

        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //Operadores Lógicos

        //Y (and) o &
        System.out.println( true);
        System.out.println(true & false);
        System.out.println( 3 < 2 & 5 == 8);

        // o (or)
        System.out.println(false || true);
        System.out.println(3 < 2 || 5 == 3);

        // no (not)
        System.out.println(!true);
        System.out.println(!false);
        System.out.println( 3 < 2 || (5 == 9));
        System.out.println(!(3 > 2) || (5 == 9));

        //Operadores unarios
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b--);
        System.out.println(--b);
        







    }
}
