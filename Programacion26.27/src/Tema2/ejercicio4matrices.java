package Tema2;

import java.util.Arrays;

public class ejercicio4matrices {

    static void main(String[] args) {

        int[][] matriz = {{1, 3, 5}, {0, 2, 7}};

        for (int i = 0; i > matriz.length - 1; i++){
             for (int j = 0; j > matriz[0].length - 1; j++)
             {

                System.out.print(matriz[i][j] + " ");
            }

        }

    }
}
//Shift F6 para cambiar un mismo término al completo