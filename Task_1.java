/**
 * Задание 1.
 Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n
 */

 import java.util.Scanner;

 public class Task_1 {
     public static void main(String[] args) {
         try {
             Scanner iScanner = new Scanner(System.in);
             System.out.print("Введите число n: ");
             int num = iScanner.nextInt();
             int sum = 0;
             for (int i = 1; i <= num; i++) {
                 sum += i;
             }
             System.out.printf("Сумма чисел от 1 до %d равна: %d. \n", num, sum);
             int fact = 1;
             for (int i = 1; i <= num; i++) {
                 fact *= i;
             }
             System.out.printf("Произведение чисел от 1 до %d равно: %d.", num, fact);
             iScanner.close();
         } catch (Exception e) {
             System.out.println("Введите число!");
         }
         
     }
 }
 