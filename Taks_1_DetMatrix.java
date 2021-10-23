import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DET {

    public static void getCofactor(int mat[][], int temp[][],
                                   int p, int q, int n) {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {

                if (row != p && col != q) {
                    temp[i][j++] = mat[row][col];

                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }


    public int determinantOfMatrix(int mat[][], int n) {
        int D = 0;
        if (n == 1)
            return mat[0][0];


        int temp[][] = new int[n][n];


        int sign = 1;


        for (int f = 0; f < n; f++) {
            getCofactor(mat, temp, 0, f, n);
            D += sign * mat[0][f]
                    * determinantOfMatrix(temp, n - 1);

            sign = -sign;
        }

        return D;
    }

    public void failInput(String path, int[][]matrix, int N) throws FileNotFoundException {

        File file = new File(path);

        System.out.println(file.exists());

        Scanner sc = new Scanner(file);

        matrix = new int[N][N];

        while (sc.hasNextLine()) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = sc.nextInt();
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        System.out.println(determinantOfMatrix(matrix, matrix.length));


    }


    public void failOuPut(String failInPutName,String failOutPutName, int[][] matrix , int N) throws IOException {
        matrix = new int[N][N];
        String str = "результат определения матрицы =  ";
        FileOutputStream outputStream = new FileOutputStream(failOutPutName);
        byte[] strToBytes = str.getBytes();
        outputStream.write(strToBytes);
        File file = new File(failInPutName);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
        }


        int result = determinantOfMatrix(matrix, matrix.length);
        String res = Integer.toString(result);
        byte[] strToBytes2 = res.getBytes();
        outputStream.write(strToBytes2);


        outputStream.close();
    }


}


