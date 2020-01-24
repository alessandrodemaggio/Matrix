package matrice;

import java.io.File;
import java.util.*;

public class Matrix {

    public static void main(String[] args) {
        File F1= new File ("matrix.txt");
        Scanner input = new Scanner(System.in);
        int numero = 1;
        int[][] matrice = new int[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                matrice[r][c] = numero;
                numero++;
                System.out.print(matrice[r][c] + "-");
            }
        }
        System.out.println(" ");
        for (int r = 2; r >= 0; r--) {
            for (int c = 2; c >= 0; c--) {
                System.out.print(matrice[r][c] + " ");

            }

        }
        System.out.println();

    }

}
