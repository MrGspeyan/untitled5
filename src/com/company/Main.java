package com.company;

public class Main {

    public static void main(String[] args) {




            /*1.tpel bazmapatkman axyusaky

            0 * 0 = 0
            0 * 1 = 0
            ---------

             */
        for (int i1 = 0; i1 <= 10; i1++) {

            for (int j = 0; j <= 10; j++) {

                System.out.println(i1 + " * " + j + " = " + (i1 * j));
            }
            System.out.print(" ");
            System.out.println("-------------------");

            /*2. print simple triangles

            *            0  1
            * *          1  2
            * * *        2  3
            * * * *      3  4
            * * * * *    4  5

             */

        }

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("* ");

            }


            System.out.println();







            /*

            * * * * *        0  5
            * * * *          1  4
            * * *            2  3
            * *              3  2
            *                4  1


             */


        }
        System.out.println("-------------");
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < (height - i); j++) {

                System.out.print("* ");

            }
            System.out.println();


                /*

                * * * * *    0  0   5
                  * * * *    1  1   4
                    * * *    2  2   3
                      * *    3  3   2
                        *    4  4   1
                 */

        }
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < (i - height); ) {

                System.out.println(" ");

                System.out.print("* ");


                    /*

                    * * * * * * * * *    0   0     0   9   (0  5)-> 9    (5 * 2 - 0 * 2 - 1)
                      * * * * * * *      1   1     1   7   (1  5)-> 7    (5 * 2 - 1 * 2 - 1)
                        * * * * *        2   2     2   5   (2  5)-> 5    (5 * 2 - 2 * 2 - 1)
                          * * *          3   3     3   3   (3  5)-> 3    (5 * 2 - 3 * 2 - 1)
                            *            4   4     4   1   (4  5)-> 1    (5 * 2 - 4 * 2 - 1)

                     */


            }


        }
        System.out.println("---------------");

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("  ");


            }
            for (int j = 0; j < (height * 2 - i * 2 - 1); j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------");


           /*

                   *            0  4   (5 - 0 - 1)    0   1      (0 * 2 + 1)
                 * * *          1  3   (5 - 1 - 1)    1   3      (1 * 2 + 1)
               * * * * *        2  2   (5 - 2 - 1)    2   5      (2 * 2 + 1)
             * * * * * * *      3  1   (5 - 3 - 1)    3   7      (3 * 2 + 1)
           * * * * * * * * *    4  0   (5 - 4 - 1)    4   9      (4 * 2 + 1)


            */

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < (height - i - 1); j++) {

                System.out.print("  ");
            }

            for (int j = 0; j < (i * 2 + 1); j++) {

                System.out.print("* ");


            }
            System.out.println();

            /*

                          *            0  4 (5 - 0 - 1)    0  1
                        * * *          1  3 (5 - 1 - 1)    1  3
                      * * * * *        2  2 (5 - 2 - 1)    2  5
                    * * * * * * *      3  1 (5 - 3 - 1)    3  7

                  * * * * * * * * *    0  0         0  9   (5 * 2 - 0 * 2 - 1)
                    * * * * * * *      1  1         1  7   (5 * 2 - 1 * 2 - 1)
                      * * * * *        2  2         2  5   (5 * 2 - 2 * 2 - 1)
                        * * *          3  3         3  3   (5 * 2 - 3 * 2 - 1)
                          *            4  4         4  1   (5 * 2 - 4 * 2 - 1)
             */

        }
        System.out.println("----------------");

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < (height - i); j++) {

                System.out.print("  ");


            }
            for (int j = 0; j < i * 2 - 1; j++) {

                System.out.print("* ");
            }
            System.out.println();

            //(5 * 2 - 0 * 2 - 1)
        }

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("  ");
            }
            for (int j = 0; j < (height * 2 - i * 2 - 1); j++) {

                System.out.print("* ");
            }
            System.out.println();


                                /*



                                            *             4  4    4  1   (5 * 2 - 4 * 2 - 1)
                                          * * *           3  3    3  3   (5 * 2 - 3 * 2 - 1)
                                        * * * * *         2  2    2  5   (5 * 2 - 2 * 2 - 1)
                                      * * * * * * *       1  1    1  7   (5 * 2 - 1 * 2 - 1)
                                    * * * * * * * * *     0  0    0  9   (5 * 2 - 0 * 2 - 1)
                                      * * * * * * *      -1  1    1  7
                                        * * * * *        -2  2    2  5
                                          * * *          -3  3    3  3
                                            *            -4  4    4  1

                                 */


        }
        System.out.println("----------------");

        //(5 * 2 - 4 * 2 - 1)

        for (int i = height; i > -height; i--) {

            int k = i;

            if (i < 0) {

                k = -i;

            }
            for (int j = 0; j < k; j++) {

                System.out.print("  ");

            }
            for (int j = 0; j < (height * 2 - k * 2 - 1); j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------");



                            /*

                             * * * * *    0  0             0  5 (5 - 0 = 5)
                               * * * *    1  1             1  4 (5 - 1 = 4)
                                 * * *    2  2             2  3 (5 - 2 = 3)
                                   * *    3  3             3  2 (5 - 3 = 2)
                                     *    4  4             4  1 (5 - 4 = 1)

                            */


        for (int i = 0; i < height; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("  ");
            }
            for (int j = 0; j <= (height - i - 1); j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------");

        /*

                                        *     0  4     0   1     (5 )
                                      * *     1  3     1   2     (5 )
                                    * * *     2  2     2   3     (5 )
                                  * * * *     3  1     3   4     (5 )
                                * * * * *     4  0     4   5     (5 )

                                */
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < (height - i - 1); j++) {

                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++)

                System.out.print("* ");

            System.out.println();

        }
        System.out.println("---------------");



          }


    }
























































