package com.example.dsa.pattern;

public class Patterns {
    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    public static void getRightHalfPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            for (int k = i; k <= row; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*

     *
     * *
     * * *
     * * * *
     * * * * *
     */
    public static void getLeftHalfPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = row - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *

     */
    public static void getFullPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            int j = 1;
            while (j <= (row - i)) {
                System.out.print(" ");
                j++;
            }
            while (j <= row) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
    }

    /*

     * * * * *
     * * * *
     * * *
     * *
     *

     */
    public static void getInvertRightHalfPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--) {
                System.out.print("* ");
            }
            for (int k = i; k <= row; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void getInvertLeftHalfPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = row - i + 2; j <= row; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= row; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void getInvertFullPyramid(int row) {

        for (int i = 1; i <= row; i++) {
            int j = 1;
            while (j < i) {
                System.out.print(" ");
                j++;
            }
            while (j <= row) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
    }

    public static void getRhombusPattern(int row) {
        for (int i = 1; i <= row; i++) {
            int j = 1;// for cols
            while (j < i) {
                System.out.print(" ");
                j++;
            }
            for (int k = 1; k <= row; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void getDiamondPattern(int row) {
        for (int i = 1; i < 2 * row; i++) {
            int j = 1;
            if (i <= row) {
                while (j <= row - i) {
                    System.out.print(" ");
                    j++;
                }
            } else {
                while (j <= i - row) {
                    System.out.print(" ");
                    j++;
                }
            }
            while (j <= row) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
    }

    public static void getHourGlassPattern(int row) {
        for (int i = 1; i <= 2 * row - 1; i++) {
            int j = 1;
            if (i <= row) {
                while (j < i) {
                    System.out.print(" ");
                    j++;
                }
            } else {
                while (j < 2 * row - i) {
                    System.out.print(" ");
                    j++;
                }
            }
            while (j <= row) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
    }

    public static void getHollowSquarePattern(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i > 1 && i < row && j > 1 && j < row) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void getHollowFullPyramid(int row) {
        for (int i = 1; i <= row; i++) {
          /*  for (int j = 0; j < 2 * (row - i) - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0 || k == 2 * i || i == row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }*/

            int j = 1;
            while (j <= (row - i)) {
                System.out.print(" ");
                j++;
            }
            int k = j;
            while (j <= row) {
                if (j > k && j < row && i < row) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                j++;
            }
            System.out.println();
        }
    }

    public static void getInvertHollowFullPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            int j = 1;
            while (j < i) {
                System.out.print(" ");
                j++;
            }
            int k = j;
            while (j <= row) {
                if (j > k && j < row && i > 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                j++;
            }
            System.out.println();
        }
    }

    public static void getHollowDiamondPattern(int row) {
        for (int i = 1; i < 2 * row; i++) {
            int j = 1;
            if (i <= row) {
                while (j <= row - i) {
                    System.out.print(" ");
                    j++;
                }
            } else {
                while (j <= i - row) {
                    System.out.print(" ");
                    j++;
                }
            }
            int k = j;
            while (j <= row) {
                if (j > k && j < row && i > 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                j++;
            }
            System.out.println();
        }
    }

    public static void getHollowHourGlassPattern(int row) {
        for (int i = 1; i <= 2 * row - 1; i++) {
            int j = 1;
            if (i <= row) {
                while (j < i) {
                    System.out.print(" ");
                    j++;
                }
            } else {
                while (j < 2 * row - i) {
                    System.out.print(" ");
                    j++;
                }
            }
            int k = j;
            while (j <= row) {
                if (j > k && j < row && i > 1 && i < 2 * row - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                j++;
            }
            System.out.println();
        }
    }

    public static void getFloydTriangle(int row) {
        int value = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + (value++));
            }
            for (int k = i; k <= row; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void getPascalTriangle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < row - i; j++) {
                System.out.print(" ");
            }
            int value = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + value);
                value = value * (i - k) / k;
            }
            System.out.println();
        }
    }
}
