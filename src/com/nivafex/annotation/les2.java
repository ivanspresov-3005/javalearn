package com.nivafex;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число? :  ");
        String valOne = in.nextLine( );
        int i1 = Integer.parseInt(valOne);

        System.out.print("Введите второе число? : ");
        String valTwo = in.nextLine();
        int i2 = Integer.parseInt(valTwo);

        System.out.println(i1 + i2);

    }
}