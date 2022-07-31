/**
 * Created by User on 20.02.2022.
 */
public class Conversion {

    public static void main(String[]args){

        byte b;

        int i = 257;

        double d = 323.142;

        System.out.println("conversion type byte into type int. ");

        b = (byte)i;

        System.out.println("i and b " + i + " " + b);

        System.out.println("conversion type double into int. ");

        i = (int)d;

        System.out.println("d and i " + d + " " + i);

        System.out.println("conversion type double into type byte. ");

        b = (byte)d;

        System.out.println("d and b " + d + " " + b);


    }
}
