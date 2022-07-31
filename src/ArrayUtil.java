/**
 * Created by User on 23.03.2022.
 */
public class ArrayUtil {

    public static void main(String[] args) {

        //1.Bubble sort

        int[]arr = {5,7,8,11,23,56,12,5,0,1,4,65,98,75,2,3,54,112,135};

//        for(int i = 0; i < arr.length; i++){
//
//            for(int j = 0; j < arr.length - 1; j++){
//                if(arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//
//                    for(int g : arr){
//
//                        System.out.print(g + " | ");
//                    }
//                    System.out.println();
//                }
//            }
//        }
//         2.Selection sort

//        for(int i = 0; i < arr.length; i++){
//
//            int minimumIndex = i;
//
//            for(int j = minimumIndex + 1; j < arr.length; j++){
//
//                if(arr[minimumIndex] > arr[j]){
//                    minimumIndex = j;
//                }
//            }
//            if(arr[i] != arr[minimumIndex]){
//                int tmp = arr[i];
//                arr[i] = arr[minimumIndex];
//                arr[minimumIndex] = tmp;
//
//                for(int g : arr){
//
//                    System.out.print(g + " | ");
//                }
//                System.out.println();
//            }
//        }
        //3.Insertion sort
       for(int i = 0; i < arr.length; i++){
           int index = i;
           int val1 = arr[i];
           for(int j = i - 1; j >= 0 && val1 < arr[j]; j--){
               arr[j + 1] = arr[j];
               index = j;
           }
           arr[index] = val1;
           for(int k : arr){
               System.out.print(k + " | ");
           }
           System.out.println();
       }


//        //4.Linear search
//        int index = -1;
//        int key = 112;
//        for(int i = 0; i < arr.length; i++){
//            if(index == -1 && arr[i] == key){
//                index = i;
//            }
//        }
//        System.out.print(index);
//        System.out.println();
//        System.out.println("................................................");
//
//        //5.Binary search
//
//       int[]brr = {1,2,5,6,8,12,15,23,35,54,58,65,67,71,75,78,};
//
//       int start = 0;
//       int end = brr.length - 1;
//       int index1 = -1;
//       int key1 = 250;
//
//       for(;end >= start && index1 == -1; ){
//           int mid = (start + end) / 2;
//
//           if(brr[mid] > key1){
//               end = mid - 1;
//           }else if(brr[mid] < key1){
//               start = mid + 1;
//           }else{
//               index1 = mid;
//           }
//       }
//       System.out.println(index1);
//        System.out.println();
//        System.out.println("........................................................");
//
//        //.Բազմապատկման աղյուսակ մասսիվի կիրառմամբ
//
//        int[][]arr3 = new int[11][11];
//        for(int i = 0; i < arr3.length; i++){
//            for(int j = 0; j < arr3[i].length; j++){
//                arr3[i][j] = i * j;
//            }
//        }
//        for(int i = 0; i < arr3.length; i++){
//            for(int j = 0; j < arr3.length; j++){
//                System.out.println(i + " * " + j + " = " + arr3[i][j]);
//            }
//            System.out.println(".................................");
//        }
//
//
//
//        //.Ստեղծել 50 էլեմենտանի մասիվ, ներառել 0-49 թվերը, անցնել մասիվի վրայով, հաշվել մասիվի էլեմենտների գումարը
//
//        int[]grr = new int[50];
//
//        for(int i = 0; i < grr.length; i++){
//            grr[i] = i;
//
//        }
//        double sum = 0.0;
//        for(int i : grr){
//            sum += i;
//        }
//        System.out.print(sum + " | ");
//        System.out.println();
//        System.out.println(".................................");
//
//        //.Գտնել մասիվի ամենամեծ անդամը
//
//        int max = brr[0];
//        for(int i = 0; i < brr.length; i++){
//            if(max < brr[i]){
//                max = brr[i];
//            }
//        }
//        System.out.print(max);
//        System.out.println();
//        System.out.println(".....................................");
//
//        int min = brr[0];
//        for(int i = 0; i < brr.length; i++){
//            if( min > brr[i]){
//
//            }
//        }
//        System.out.print(min);
//
//        System.out.println();
//        System.out.println(".....................................");
//
//        int [][][] grr1 = new int [5][5][5];
//          int val = 3;
//        for(int i = 0; i < grr1.length; i++){
//
//            for(int j = 0; j < grr1[i].length; j++){
//
//                for(int l = 0; l < grr1[i][j].length; l++){
//
//                    grr1[i][j][l] = val;
//                    val += 3;
//                }
//            }
//        }
//        for(int [][] b : grr1){
//            for(int[]s : b) {
//                for (int u : s) {
//                    System.out.print(u + " | ");
//                }
//                System.out.println();
//            }
//            System.out.println(".....................................");
//        }
//        System.out.println(15 >>> 2);
        }
    }








