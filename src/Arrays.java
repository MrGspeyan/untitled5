/**
 * Created by User on 06.03.2022.
 */
public class Arrays {

    public static void main(String[]args){

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i *2;

            System.out.print(arr[i]+ " | ");
        }

       int[]brr = {1,5,6,7,8,0,2};
        int min = brr[0];
        for(int i = 0; i < brr.length; i++){
            if(min < brr[i]){
                min = brr[i];
            }
        }
        System.out.println();
        System.out.println(min);
    }
}
