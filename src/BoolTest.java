/**
 * Created by User on 20.02.2022.
 */
public class BoolTest {

    public static void main(String[]args){

        boolean b;

        b = false;
        System.out.println("b equals " + b);

        b = true;
        System.out.println("b equals " + b);

             if(b)
            System.out.println("This code will work. ");

             b = false;
             if(b)
                 System.out.println("This code will not work. ");

             System.out.println("10 > 9 equals " + (10 > 9));
    }
}
