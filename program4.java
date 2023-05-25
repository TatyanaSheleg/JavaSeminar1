// 4. Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)

import java.util.Scanner;

public class program4 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int number_1, number_2, result;
        char oper;
 
        System.out.print("Введите первое число:");
        number_1 = scan.nextInt();
        System.out.print("Введите второе число:");
        number_2 = scan.nextInt();
        System.out.print("Введите оперцию(+,-,*,/):");
        oper = scan.next().charAt(0);
 
        boolean correct = true;
        switch (oper) {
            case '+':
                result = number_1 + number_2;
                break;
            case '-':
                result = number_1 - number_2;
                break;
            case '*':
                result = number_1 * number_2;
                break;
            case '/':
                result = number_1 / number_2;
                break;
            default:
                result = 0;
                correct = false;
        }
 
        System.out.println(correct ? "Результат: " + result : "Неверная операция!");
    }
}
