import java.io.IOException;
public class Projeto {
    public static void main(String[] args) throws IOException {
        System.out.println("Olá, mundo!");
        char ch;
        ch = 'X';
        System.out.println(("ch contains" + ch));
        ch++; // incrementa ch
        System.out.println("ch is now" + ch);

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'c';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.69;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println("Valor do tipoShort = " + tipoShort);
        System.out.println("Valor do tipoChar = " + tipoChar);
        System.out.println("Valor do tipoFloat = " + tipoFloat);
        System.out.println("Valor do tipoDouble = " + tipoDouble);
        System.out.println("Valor do tipoInt = " + tipoInt);
        System.out.println("Valor do tipoLong = " + tipoLong);
        System.out.println("Valor do tipoBooleano = " + tipoBooleano);

        // Demostra sequencias de escape em strings.
        System.out.println("\nFirst line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF\n");

        // Demonstra valores booleanos.
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        b = false;
        System.out.println("b is " + b);
        // valor booleano pode controlar a instrução if
        if(b) System.out.println("This is not executed.");
        b = false;
        if(b) System.out.println("This is not executed.");
        // o resultado de um operador relacional e um valor e um valor booleano
        System.out.println("10 > is" + (10 > 9 ));

        int count = 10; // da a cout um valor inicial igual a 10
        char chr = 'x';
    }
}

