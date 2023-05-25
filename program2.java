// 2. Вычислить n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        
        System.out.println("Произведение  чисел от 1 до n : " + result);
    }
}