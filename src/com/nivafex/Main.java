package com.nivafex;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите 4 числа :  ");

        int[][] arr = new int[2][2];

        String val0 = in.nextLine( );
        arr[0][0] = Integer.parseInt(val0);

        String val1 = in.nextLine( );
        arr[0][1]  = Integer.parseInt(val1);

        String val2 = in.nextLine( );
        arr[1][0]  = Integer.parseInt(val2);

        String val3 = in.nextLine( );
        arr[1][1]  = Integer.parseInt(val3);

        // System.out.println(Arrays.deepToString(arr));
        System.out.println();

        // Вывод матрицы
        System.out.println("Матрица :");
        for  (int[]  row :  arr) {
            for (int element : row) {
                System.out.printf("%3d", element);
            }
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = i+1; j < 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Вывод транспонированой матрицы
        System.out.println("Транспонированая матрица");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }


        int l = arr[0].length + arr[1].length;
        int[] newArr = new int[l];
        int k = 0;


            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    // System.out.print(arr[i][j]);
                    newArr[k] = arr[i][j];
                    k++;
                }
            }

        System.out.println();

        System.out.println("Массив :");
        System.out.print(Arrays.toString(newArr));
        System.out.println();
        System.out.println();

        Arrays.sort(newArr);
        System.out.println("Сортированный массив :");
        System.out.println(Arrays.toString(newArr));

    }
}


