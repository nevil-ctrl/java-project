package com.nevill;

import java.util.Random;
import java.util.Scanner;

public class dataType {
    public static void Get() {
        Scanner scan = new Scanner(System.in);

    }
}


//        System.out.println("Ввдеите операцию(+,-,*,/):");
//        char operator = scan.next().charAt(0);
//
//
//        System.out.println("Введите числа");
//        double num1 = scan.nextDouble();
//        double num2 = scan.nextDouble();
//
//        double result = calculate(num1, num2, operator);
//        System.out.println("Результат: " + result);
//
//    }
//
//    public static double calculate(double num1, double num2, char operator) {
//        double result = 0;
//        switch (operator) {
//            case '+':
//                result = num1 + num2;
//                break;
//            case '-':
//                result = num1 - num2;
//                break;
//            case '*':
//                result = num1 * num2;
//                break;
//            case '/':
//                if (num2 != 0) {
//                    result = num1 / num2;
//                } else {
//                    System.out.println("На ноль делить нельзя");
//                    result = Double.NaN;
//                }
//                break;
//            case '%':
//                result = num1 % num2;
//                break;
//            case '^':
//                result = Math.pow(num1, num2);
//                break;
//            default:
//                System.out.println("Ошибка: неверный оператор");
//                result = Double.NaN;
//
//        }
//        return result;


//целочисленные типы данных

// byte - от -128 до 127 и занимает 1 байт
// short - от -32768 до 32767 и занимает 2 байта
// int - от -2147483648 до 2147483647 и занимает 4 байта
// long - от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт

//float num = 4.3455324f;
//double num2 = 5.2341234243d;
//Разница в возможном количестве цифр после точки

//символы
//char symbol = '&';
//String word = "Angelina";

//boolean


//practic


// Первый вариант
        /*
        int[] nums = new int[6];
        System.out.println("Введите значения массива:");
        nums[0] = scan.nextInt();
        nums[1] = scan.nextInt();
        nums[2] = scan.nextInt();
        nums[3] = scan.nextInt();
        nums[4] = scan.nextInt();
        nums[5] = scan.nextInt();

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Elements:" + nums[i]);
        }
        */

// Второй вариант
//        int[] arr = new int[6];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Введите число:");
//            int value = scan.nextInt();
//            arr[i] = value;
//        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Элемент [" + i + "]: " + arr[i]);
//        }

//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//            System.out.println("Minimal:" + min);
//        }
//        int max = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//            System.out.println("Maximum:" + max);
//        }
//    }
//
//}


//(
//        System.out.print("Введите имя пользвоателя");
//String user_name = scan.nextLine();
//        System.out.println("Добро пожаловать, " + user_name + "на наш сайт");
//        System.out.println(user_name + "Укажите пожалуйста свой возраст");
//int user_age = scan.nextInt();
//        System.out.println("Спасибо," + user_name + "ваш возраст равен:" + user_age + "Верно?");
//        if (user_age >= 18) {
//        System.out.println("Вот ваш военный билетик");
//        } else {
//                System.out.println("Вы свободны");
//        }
//
//
//        float num1 = 10, num2 = 40;
//float res;
//res += 10;
//res++;
//        System.out.println(res = num1 + num2);
//
//        System.out.println("Ввдеите операцию(+,-,*,/):");
//char operator = scan.next().charAt(0);
//
//
//        System.out.println("Введите числа");
//double num1 = scan.nextDouble();
//double num2 = scan.nextDouble();
//
//double result = calculate(num1, num2, operator);
//        System.out.println("Результат: " + result);
//
//    }
//
//public static double calculate(double num1, double num2, char operator) {
//    double result = 0;
//    switch (operator) {
//        case '+':
//            result = num1 + num2;
//            break;
//        case '-':
//            result = num1 - num2;
//            break;
//        case '*':
//            result = num1 * num2;
//            break;
//        case '/':
//            if (num2 != 0) {
//                result = num1 / num2;
//            } else {
//                System.out.println("На ноль делить нельзя");
//            }
//            break;
//        default:
//            System.out.println("Ошибка: неверный оператор");
//
//    }
//    return result;)


//shdhaisdhfawuidf

//  System.out.println("Введите свою роль:");
//String role = scan.nextLine();
//        System.out.println("Введите пароль:");
//String pass = scan.nextLine();
//
//        if (role.equals("admin") && pass.equals("12344") ) {
//        System.out.println("Данные пользователей");
//        } else {
//                System.out.println("Введите свое имя:");
//String name = scan.nextLine();
//        }


//Циклы

//        for (float i = 0; i <= 10; i++) {
//            System.out.println("Значение:" + i);
//        }

//        float i = 0;
//        while (i < 10) {
//            System.out.println("Значение:" + i);
//            i++;
//        }

//        float i = 10;
//        do {
//            System.out.println("Значение:" + i);
//            i *= 100;
//        } while (
//                i < 10
//        );

//        for (float i = 5; i < 25; i += 2) {
//        if (i % 3 == 0) {
//        continue;
//        }
//        if (i >= 17) {
//        break;
//        }
//        System.out.println("Значение:" + i);
//        }

//массивы

//int[] nums = new int[]{1, 4, 6, 2, 64};
//        System.out.println(nums[2]);
//
//        for (int i = 0; i <= nums.length; i++) {
//        System.out.println("Element:" + nums[i]);
//        }

//Многомерные массивы

//char[][] nums = new char[2][2];
//nums[1][1] = 'h';
//        System.out.println(nums[1][1]);
//
//byte[][] nums1 = new byte[][]{
//        {1, 2},
//        {3, 5},
//        {5, 22}
//};
//        System.out.println(nums1[2][0]);
//        for (byte i = 0; i < nums1.length; i++) {
//        System.out.println("Массив1:" + i);
//            for (byte q = 0; q < nums1[i].length; q++) {
//        System.out.println("Значения:" + nums1[i][q]);
//            }
//                    }


//Задача 1. Проверка возраста
//        System.out.println(" Введите свой возраст;");
//        int age = scan.nextInt();
//        if (age >= 18) {
//            System.out.println("Вы взрослый" + age);
//        } else if (age >= 12 && age < 18) {
//            System.out.println("Вы подросток" + age);
//        } else {
//            System.out.println("Вы ребенок");
//        }
//Задача 2. Таблица умножения

//        System.out.println("Введите число от 1 до 10:");
//        int factor = scan.nextInt();
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("Умножение:" + factor * i);
//        }

//Задача 3. Сумма чисел
//        int summ = 0;
//        System.out.println("Введите число:");
//        int N = scan.nextInt();
//        for (int i = 1; i <= N; i++) {
//            summ += i;
//        }
//        System.out.println("Сумма:" + summ);

//Задача 4. Четные числа
//        int even = 0;
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println("Четные:" + i);
//            }
//        }
//Задача 5. Количество положительных чисел

//        int[] arr = {-1, 5, 7, -3, 0, 2, 7, 2, 1, -6};
//        int positive = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                positive ++;
//            }
//
//        }
//        System.out.println("Позитивные:" + positive);

//Задача 6. Среднее значение массива

//        int[] numbers = new int[5];
//        int sum = 0;
//
//        System.out.println("Введите 5 чисел:");
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = scan.nextInt();
//            sum += numbers[i];
//        }
//
//        double average = sum / numbers.length;
//
//        System.out.println("Среднее арифметическое: " + average);

//Задача 7. Второй максимум

//        int max1 = 0;
//        int max2 = 0;
//
//        int[] arr = {5, 1, 9, 3, 8};
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max1) {
//                max2 = max1;
//                max1 = arr[i];
//
//            } else if (arr[i] > max2) {
//                max2 = arr[i];
//            }
//        }
//        System.out.println("Самое большое число: " + max1);
//        System.out.println("Второе по величине число: " + max2);
//

//Задача 8. Разворот массива ( пока не достает знаний, но предположительно формула должна быть такая arr.length - 1 - i наверное, как бы находя парный элемент по индексу с конца)

//Задача 9. Угадай число

//        int randomNum = random.nextInt(100);
//        System.out.println("Угадайте число от 1 до 100:");
//        int userNum = -1;
//
//
//        while (randomNum != userNum) {
//            userNum = scan.nextInt();
//
//            if (randomNum == userNum) {
//                System.out.println("Вы угадали число" + randomNum);
//            } else if (randomNum < userNum) {
//                System.out.println("Меньше");
//            } else if (randomNum > userNum) {
//                System.out.println("Больше");
//            }
//        }

//Задача 10. Калькулятор 2.0


//        double currentResult = 0;
//        boolean isFirstRun = true;
//
//        while (true) {
//            double num1;
//            if (isFirstRun) {
//                System.out.println("Введите первое число:");
//                num1 = scan.nextDouble();
//                isFirstRun = false;
//            } else {
//                num1 = currentResult;
//                System.out.println("Текущий результат: " + num1);
//            }
//            System.out.println("Введите оператор(+,-,*,/, %, ^) или же q  для выхода:");
//            char operator = scan.next().charAt(0);
//
//            if (operator == 'q') {
//                System.out.println("Завершение работы");
//                break;
//            }
//
//            System.out.println("Введите второе число:");
//            double num2 = scan.nextDouble();
//
//            currentResult = dataType.calculate(num1, num2, operator);
//            System.out.println("Результат:" + currentResult);
//
//
//        }


//Коллекции в Java

//ArrayList идеален для частого чтения и поиска элементов, а LinkedList — для постоянной вставки и удаления элементов в начале или середине списка.

//        LinkedList<Integer> numbers = new LinkedList<>();
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(8);
//        numbers.add(9);
//        numbers.add(1, 59);
//        System.out.println(numbers.size());

//        System.out.println(numbers.get(1));
//        numbers.clear();
//        numbers.remove(0);

//        for (Integer el : numbers) {
//            System.out.println(el);
//        }

//Function

//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner scan = new Scanner(System.in);
//
//        short num = 7;
//        int result = summ((short) 7, num);
//        info(String.valueOf(result));
//
//    }
//
//    public static int summ(short a, short b) {
//        int res = a + b;
//        String result = "Результат" + res;
//        info(result);
//        return res;
//    }
//
//    public static void info(String word) {
//        System.out.print(word);
//        System.out.println("!");
//    }
//
//}


//Колекции

//byte[] array = new byte[]{5, 2, 7};
//
//int summ1 = summArray(array);
//        System.out.println("Сумма:" + summ1);
//    }
//
//public static int summArray(byte[] arr) {
//    int summa = 0;
//    for (byte i = 0; i < arr.length; i++) {
//        summa += arr[i];
//    }
//    return summa;
