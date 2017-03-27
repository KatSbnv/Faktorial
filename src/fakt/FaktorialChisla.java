package fakt;

import java.util.Scanner; // импортируем класс


public class FaktorialChisla {
    public static int result;

    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        n = scan.nextInt();
        result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        System.out.println(result); //расчет факториала нерекурсивный
    }

    public static void main(String[] args) {
        int n;
        do {

            if (n == 0 || n == 1)
                System.out.println(result);
            if (n < 0)
                System.out.println("Вы ввели отрицательное число!");}

            while (n < 0);




    }
}

