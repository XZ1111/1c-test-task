package ru.gy;

public class Main {

    public static void main(String[] args) {

        /*Проверка первой задачи*/
        System.out.println("Проверка первой задачи");
        arrayQuestion();
        System.out.println("---------------------------");

        /*Проверка второй задачи*/
        System.out.println("Проверка второй задачи");
        divisionQuestion(16, 3);
        System.out.println("---------------------------");

        /*Проверка третьей задачи*/
        System.out.println("Проверка третьей задачи");
        System.out.println(ifElseQuestion(0));
        System.out.println(ifElseQuestion(1));
        System.out.println("---------------------------");

        /*Проверка четвертой задачи*/
        System.out.println("Проверка четвертой задачи");
        secondArrayQuestion(new int[]{1, 3, 5, 7, 9, 11, 13, 15, 16}, new int[]{2, 6, 8, 12, 14});
        System.out.println("---------------------------");

    }

    //Первая задача
    /*Необходимо найти сумму элементов, лежащих на побочной диагонали матрицы используя один оператор цикла.*/
    public static void arrayQuestion() {
        int[][] array = new int[5][5];

        array[0][4] = 1;
        array[1][3] = 1;
        array[2][2] = 1;
        array[3][1] = 1;
        array[4][0] = 1;

        int sum = 0;
        int length = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            int x = array[i][length - i];
            sum += x;
        }

        System.out.println(sum);
    }

    //Вторая задача
    /*Дано два числа. Первое число больше второго. Написать алгоритм, определяющий
        делится ли первое число на второе нацело без использования операций «/», «mod»,
        «%». Операцию округления также запрещено использовать.*/
    public static void divisionQuestion(int a, int b) {

        while (true) {
            if (a == b) {
                System.out.println("Делится");
                break;
            } else if (a < b) {
                System.out.println("Не делится");
                break;
            } else {
                a = subtraction(a, b);
            }
        }
    }

    private static int subtraction(int i, int x) {
        return i - x;
    }

    //Третья задача
    /*Необходимо, без использования любых других условных операторов (case, if, ? и пр.)
    и логических выражений, убрать условный оператор «Если» из следующего блока (А может принимать значение 0 или 1):
    Если (А = 0) Тогда B = 2;
    Иначе В = 1;
    КонецЕсли;*/

    public static int ifElseQuestion(int A) {
        return 2 - A;
    }

    //Четвертая задача
    /*Имеются два числовых массива, оба массива упорядочены по возрастанию.
        Необходимо написать алгоритм, за один цикл, выдающий значения обоих массивов в
        порядке возрастания*/
    public static void secondArrayQuestion(int[] a, int[] b) {
        if (a.length >= b.length) printArrays(a, b);
        else printArrays(b, a);
    }

    private static void printArrays(int[] a, int[] b) {
        int aMinIndex = 0;
        int bMinIndex = 0;

        for (int i = 0; i < a.length; i++) {
            if (i < b.length) {

                if (a[aMinIndex] < b[bMinIndex]) {
                    System.out.println(a[aMinIndex]);
                    aMinIndex++;
                } else {
                    System.out.println(b[bMinIndex]);
                    bMinIndex++;
                }

            } else System.out.println(a[i]);
        }
    }
}
