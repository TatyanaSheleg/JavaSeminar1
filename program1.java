// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n)

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        int sumN = n * (n + 1) / 2;

        System.out.println("Сумма  чисел от 1 до n : " + sumN);
    }
}