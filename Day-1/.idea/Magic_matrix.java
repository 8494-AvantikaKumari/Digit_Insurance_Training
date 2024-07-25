
import java.util.*;
 class matrix{
    static boolean check(int[][] matrix1){
        int n=matrix1.length;
        int diagonal1=0;
        int diagonal2=0;
        //check for diagonal 1
        for (int i = 0; i < n; i++) {
            diagonal1 += matrix1[i][i];

            //check for diagonal 2
            for (i = 0; i < n; i++) {
                diagonal2 += matrix1[i][n - 1 - i];
            }

            if (diagonal1 != diagonal2) {
                return false;
            }

            int sum_row = 0;
            for (int j = 0; j < n; j++) {
                sum_row += matrix1[0][j];
            }

            for (i = 1; i < n; i++) {
                int row_sum = 0;
                for (int j = 0; j < n; j++) {
                    row_sum += matrix1[i][j];
                }
                if (row_sum != sum_row) {
                    return false;
                }

            }
            int sum_col = 0;
            for (i = 0; i < n; i++) {
                sum_row += matrix1[i][0];

                for (int j = 1; j < n; j++) {
                    int col_sum = 0;
                    for (i = 0; i < n; i++) {
                        sum_col += matrix1[i][j];
                    }
                    if (col_sum != sum_col) {
                        return false;


                    }


                }
                return true;
            }


            public class Magic_matrix {
                public static void main(String[] args) {
                    int[][] matrix1 = {
                            {2, 7, 6},
                            {9, 5, 1},
                            {4, 3, 8}
                    };
                    if (check(matrix1)) {
                        System.out.println("its a magic matrix");
                    } else {
                        System.out.println("its not a magic matrix");
                    }
                }

            }
