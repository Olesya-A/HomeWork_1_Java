/**
 Задание 3.
Реализовать простой калькулятор (операции + - / * )
Пример работы программы:

Введите число 1: 2
Введите число 2: 3
Введите операцию: +
Ответ: 5
Введите число 1: 2
Введите число 2: 3
Введите операцию: а
Ответ: Такой операции нет
 */

 import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        float num1 = iScanner.nextFloat();
        System.out.print("Введите число 2: ");
        float num2 = iScanner.nextFloat();
        System.out.print("Введите операцию (+ - / *): ");
        String operation = iScanner.next();
        float result = 0;
        switch (operation) {
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
            default:
                System.out.print("Такой операции нет.\n");
                break;
        }
        System.out.printf("Ответ: %.2f.\n", result);
        iScanner.close();
    }
}