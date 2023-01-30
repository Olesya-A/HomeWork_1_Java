/**
 * Задание 2.
 * Вывести все простые числа от 1 до 1000
 */

 public class Task_2 {
    public static void main(String[] args) {
        int n = 1000;
        int k = 0;
        // пробегаем все числа от 2 до 1000
        for (int i = 2; i < n; i++) {
            // пробегаем все числа от 2 до текущего
            for (int j = 2; j < i; j++) {
                // ищем количество делителей
                if (i % j == 0) {
                    k = +1;
                }
            }
            // если делителей нет, выводим на печать
            if (k == 0) {
                System.out.println(i);
            } else {
                k = 0;
            }
        }
    }
}
