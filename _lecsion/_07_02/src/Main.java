import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

   /* T1: пользователь 10 раз вводит целые числа с клавиатуры, при вводе отрицательного
         числа ввод чисел необходимо прекратить.
 - Пользователь вводит целые числа с клавиатуры 10 раз
 - На входе int num
 - прекратить ввод, если пользователь ввел отрицательное число
 - либо 10 попыток закончились, либо сообщить, что было введено отрицательное число, программа остановлена.
 - прервать цикл, если было введено отрицательное число
 - запросить пользователя ввести число, в конце прграммы объяснить ему, что произошло.*/

        /*System.out.println(" Привет, мир");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите целое число: ");
            int num = scan.nextInt();
            System.out.println("Вы ввели число: " + num);
            if (num < 0) {
                System.out.println("Вы ввели отрицательное число");
                break;
            }
        }*/
        //----------------------------------------------------------------
        /* Дано натуральное число n. Написать программу, которая вычисляет сумму S = 2 + 4 + … + n.

Вводится число num с клавиатуры
подсчитать сумму всех ЧЕТНЫХ чисел, которые меньше или равны num
выведем значение суммы
Ключевой алгоритм:
запустить цикл, в котором:
проверять каждое число на то, четное оно или нет, суммировать будем только четные,
 НО пропускать НЕчетные числа (continue).
         */

        /*System.out.println(" Привет, мир");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = scan.nextInt();
        System.out.println("Вы ввели число: " + num);

        int sum = 0;

        for (int i = 2; i <= num; i++){
            if (i % 2 == 1) continue; // нашли нечетное число
            sum = sum +i;

        }
        System.out.println("Сумма всех чисел: " + sum);*/

        //---------------------------------------------------------------------------------------------------
        /* Задача 1. пользователь 10 раз вводит целые числа с клавиатуры,
         при вводе нечетного числа ввод чисел необходимо прекратить.
         */
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите целое число: ");
            int num = scan.nextInt();
            System.out.println("Вы ввели число: " + num);
            if (num < 0) {
                System.out.println("Вы ввели отрицательное число");
                break;
            }
        }
        //------------------------------------------------------------------------------------

        /* Задача 2. Дано натуральное число n. Написать программу, которая вычисляет сумму S = 2 + 4 + … + 2*n.

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = scan.nextInt();
        System.out.println("Вы ввели число: " + num);

        int sum = 0;
        //int n = num;

        for (int i = 2; i <= num; i++){
            if (i % 2 == 1) continue;
            sum = sum + i + num*2;
        }
        System.out.println("Сумма всех чисел: " + sum);
*/







    }
}