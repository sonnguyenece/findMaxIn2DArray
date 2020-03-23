import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input matrix columns : ");
        int col = scn.nextInt();
        System.out.print("Input matrix rows : ");
        int row = scn.nextInt();

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.println("Input row " + i + " element : ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        int max = matrix[0][0];
        System.out.println("Matrix display : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
                if (max < matrix[i][j]) max = matrix[i][j];
            }
            System.out.println();
        }
        String maxPos = "";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max == matrix[i][j]) {
                    max = matrix[i][j];
                    maxPos+="["+ i +"]["+ j +"] ";
                }
            }
            System.out.println();
        }

        System.out.printf("Max in matrix : %d in position %s", max, maxPos);

    }
}
