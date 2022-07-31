/**
 * Created by User on 03.04.2022.
 */
public class BinaryCalculator {
    public static void main(String[] args) {
        System.out.println(xor(5, 7));
        System.out.println(or(5, 7));
        System.out.println(and(5, 7));
        System.out.println(add(5, 7));
        System.out.println(sub(-55, -15));
        System.out.println(multi(5, 7));

    }

    static int multi(int x, int y) {
        int[] arrX = toBinary(x);
        int[] arrY = toBinary(y);
        int[] result = new int[32];

        for (int i = arrY.length - 1; i >= 0; i--) {
            if (arrY[i] == 1) {
                int tmp = 0;
                for (int j = arrX.length - 1; j - (31 - i) >= 0; j--) {
                    int value = arrX[j] + result[j - (31 - i)] + tmp;
                    if (value < 2) {
                        result[j - (31 - i)] = value;
                        tmp = 0;
                    } else {
                        result[j - (31 - i)] = value % 2;
                        tmp = 1;
                    }
                }
            }
        }
        int value = toDecimal(result);

        return value;
    }

    static int sub(int x, int y) {
        int value = add(x, -y);
        return value;
    }

    static int add(int x, int y) {

        int[] arrX = toBinary(x);
        int[] arrY = toBinary(y);
        int[] result = new int[32];

        int tmp = 0;
        for (int i = arrX.length - 1; i >= 0; i--) {
            int value = arrX[i] + arrY[i] + tmp;
            if (value < 2) {
                result[i] = value;
                tmp = 0;
            } else {
                result[i] = value % 2;
                tmp = 1;
            }
        }
        int value = toDecimal(result);

        return value;
    }

    static int and(int x, int y) {

        int[] arrX = toBinary(x);
        int[] arrY = toBinary(y);
        int[] result = new int[32];

        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] == 1 && arrY[i] == 1) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }
        int value = toDecimal(result);

        return value;
    }

    static int or(int x, int y) {

        int[] arrX = toBinary(x);
        int[] arrY = toBinary(y);
        int[] result = new int[32];

        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] == 0 && arrY[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = 1;
            }
        }
        int value = toDecimal(result);

        return value;
    }

    static int xor(int x, int y) {

        int[] arrX = toBinary(x);
        int[] arrY = toBinary(y);
        int[] result = new int[32];

        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] != arrY[i]) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }
        int value = toDecimal(result);

        return value;
    }

    static int[] toBinary(int value) {

        int[] arr = new int[32];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = value & 1;
            value = value >> 1;
        }
        return arr;
    }

    static int toDecimal(int[] arr) {

        int value = 0;
        boolean isNegative = (arr[0] == 1);
        for (int i = arr.length - 1; i >= 1; i--) {
            if (isNegative) {
                if (arr[i] == 0) {
                    value += 1 << (31 - i);
                }
            } else {
                if (arr[i] == 1) {
                    value += 1 << (31 - i);
                }
            }
        }
        if (isNegative) {
            value++;
            value = -value;
        }
        return value;
    }


}




