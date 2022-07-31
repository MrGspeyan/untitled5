/**
 * Created by User on 20.02.2022.
 */
public class Light {

    public static void main(String[]args) {

        int lightspeed;
        long days;
        long distance;
        long seconds;

        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = days * lightspeed;

        System.out.print("In " + days);
        System.out.print(" days light will pass about ");
        System.out.println(distance + " miles");
    }
}
