package com.company;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            System.out.println(sum);
        }
        System.out.println(sum);
        sum = 0;
        int i = 0;
        while (i < array.length) {
            sum = sum + array[i];
            i++;
        }
        System.out.println(sum);
        sum = 0;
        i = 0;
        do {
            sum = sum + array[i];
            i++;
        } while (i < array.length);
        System.out.println(sum);

        for (int j = 1; j < 11; j++ ) {
            System.out.println(1 + "/" + j);
        }
        int n = 5;
        System.out.println(factorial(n));

    }

    public static void Rand(String[] args) {
        Random random = new Random();
        int[] mass = new int[random.nextInt(100)];
        for ( int i = 0; i < mass.length; i++)
        {
            System.out.println(mass[i]);
        }

    }
    static int factorial (int n)
    {
        int f = 1;
        for ( int i = 2; i < n + 1; i++) {
            f = f * i;
        }
        return f;
    }

}
