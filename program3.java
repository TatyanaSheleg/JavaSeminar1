// 3. Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)

public class program3 {
    public static void main(String[] args) {

        for (int j = 0; j < 1000; j++) {
            int k = 0;
            for (int i = 1; i < j + 1; i++) {
                if (j % i == 0) {
                    k++;
                }
            }
            if (k == 2) {
                System.out.print(j + " ");
            }
        }
    }
}
