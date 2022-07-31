/**
 * Created by User on 17.02.2022.
 */
public class HovoNew {

    public static void main(String[]args){

        /*

        *           0  1
        * *         1  2
        * * *       2  3
        * * * *     3  4
        * * * * *   4  5


        */

        int height = 5;

        for(int i = 0; i < height; i++){

            for(int j = 0; j <= i; j++){

                System.out.print("* ");
            }

            System.out.println();

        }
          System.out.println("--------------");

          /*

          * * * * *   0  5
          * * * *     1  4
          * * *       2  3
          * *         3  2
          *           4  1

          */

          for(int i = 0; i < height; i++){

              for(int j = height; j > i; j--){

                  System.out.print("* ");
              }
               System.out.println();
          }
              System.out.println("--------------");


               /*

                      *     0  4    0 1
                    * *     1  3    1 2
                  * * *     2  2    2 3
                * * * *     3  1    3 4
              * * * * *     4  0    4 5

                */

              for(int i= 0;i < height; i++){

                  for(int j = height - 1; j >= i; j--){

                      System.out.print("  ");


                  }
                      for(int j = height - i; j <= height;j++){

                        System.out.print("* ");
                      }
                      System.out.println();

              }
                       System.out.println("--------------");

                   /*

                   * * * * *    0  0    0  5
                     * * * *    1  1    1  4
                       * * *    2  2    2  3
                         * *    3  3    3  2
                           *    4  4    4  1
                    */

                   for(int i = 0; i < height; i++){

                       for(int j = height - i; j < height;j ++){

                           System.out.print("  ");

                       }
                            for(int j = height; j <= (height - i - 1); j++){

                              System.out.print("* ");
                            }
                   }
                   System.out.println();


                           /*
                                        *              4         4(5-4) * 2 - 1       1
                                      * * *            3         3(5-3) * 2 - 1       3
                                    * * * * *          2         2(5-2) * 2 - 1      5
                                  * * * * * * *        1         1(5-1) * 2 - 1       7
                                * * * * * * * * *      0         0(5-0) * 2 - 1       9
                                  * * * * * * *       -1         1       7
                                    * * * * *         -2         2       5
                                      * * *           -3         3       3
                                        *             -4         4       1

                                  */


                    for(int i = height ; i > - height; i--){

                        int k = i;

                        if(i < 0){

                        k = - i;
                    }

                     for(int j = 0; j < k; j++){


                            System.out.print("  ");
                        }

                        for(int j = 0; j < (height - k) * 2 - 1; j++){



                         System.out.print("* ");
                       }

                        System.out.println();

                    }
                    System.out.println("..........................................");



              }
       }
