package edu.labs.LAB14.matrix;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int A[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0, 1, 2}
        };
        int B[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2}
        };
        //перемножуємо рядки першої матриці на стовпці другої
        int C[][] = multiplyByMatrix(A, B);
        int C1[][] = multiplyByMatrixConcurency(A, B);

        System.out.println(toString(C));
        System.out.println(toString(C1));

    }

    public static int[][] multiplyByMatrix(int[][] m1, int[][] m2) {
        int m1ColLength = m1[0].length; // m1 columns length
        int m2RowLength = m2.length;    // m2 rows length
        if (m1ColLength != m2RowLength) return null; // matrix multiplication is not possible
        int mRRowLength = m1.length;    // m result rows length
        int mRColLength = m2[0].length; // m result columns length
        int[][] mResult = new int[mRRowLength][mRColLength];
        for (int i = 0; i < mRRowLength; i++) {         // rows from m1
            for (int j = 0; j < mRColLength; j++) {     // columns from m2
                for (int k = 0; k < m1ColLength; k++) { // columns from m1
                    mResult[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return mResult;
    }

    public static String toString(int[][] m) {
        String result = "";
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                result +=  m[i][j] + "  ";
            }
            result += "\n";
        }
        return result;
    }

    public static int[][] multiplyByMatrixConcurency(int[][] m1, int[][] m2) {
        ExecutorService executorService = Executors.newWorkStealingPool();
        int m1ColLength = m1[0].length; // m1 columns length
        int m2RowLength = m2.length;    // m2 rows length
        if (m1ColLength != m2RowLength) return null; // matrix multiplication is not possible
        int mRRowLength = m1.length;    // m result rows length
        int mRColLength = m2[0].length; // m result columns length
        int[][] mResult = new int[mRRowLength][mRColLength];
        for (int i = 0; i < mRRowLength; i++) {         // rows from m1
            executorService.submit(new RowMultiplicator(mRColLength,m1ColLength,i,mResult,m1,m2));
        }
        executorService.shutdown();
        return mResult;
    }

    private static class RowMultiplicator implements Runnable{
        private int mRColLength;
        private int m1ColLength;
        private int i;
        private int[][] mResult;
        private int[][] m1;
        private int[][] m2;

        public RowMultiplicator(int mRColLength, int m1ColLength, int i, int[][] mResult, int[][] m1, int[][] m2) {
            this.mRColLength = mRColLength;
            this.m1ColLength = m1ColLength;
            this.i = i;
            this.mResult = mResult;
            this.m1 = m1;
            this.m2 = m2;
        }

        @Override
        public void run() {
            for (int j = 0; j < mRColLength; j++) {     // columns from m2
                for (int k = 0; k < m1ColLength; k++) { // columns from m1
                    mResult[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
    }
}
