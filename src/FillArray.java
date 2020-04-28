import java.util.Scanner;

public class FillArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Размерность = ");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        // Заполняем с числа 1
        int count = 1;
        // Начальные координаты обхода
        int i = 0;
        int j = 0;
        // Узнаем количество спиралей в обходе
        int coils = size / 2;
        // Заполним первую ячейку
        array[i][j] = count;
        count++;
        // Создаем цикл по количеству спиралей
        for (int round = 0; round < coils; round++) {
            // Пока следующая ячейка не вышла за пределы массива и она не заполнена -
            // фиксируем кооридинаты, заполняем ячейку значением count, увеличиваем count на 1
            while (true) {
                if (j + 1 < size && array[i][j + 1] == 0) {
                    j++;
                    array[i][j] = count;
                    count++;
                } else {
                    break;
                }
            }
            //Аналогично для всех направлений спирали
            while (true) {
                if (i + 1 < size && array[i+ 1][j] == 0) {
                    i++;
                    array[i][j] = count;
                    count++;
                } else {
                    break;
                }
            }
            while (true) {
                if (j - 1 >= 0 && array[i][j - 1] == 0) {
                    j--;
                    array[i][j] = count;
                    count++;
                } else {
                    break;
                }
            }
            while (true) {
                if (i - 1 >= 0 && array[i - 1][j] == 0) {
                    i--;
                    array[i][j] = count;
                    count++;
                } else {
                    break;
                }
            }
        }
        // Если размерность не четная - придется ручками заполнить последнюю ячейку
        if (size % 2 != 0) {
            array[i][j + 1] = count;
        }
        // Любуемся полученным массивом с выводом "по красоте"!!!
        for (int ii = 0; ii < size; ii++) {
            for (int jj = 0; jj < size; jj++) {
                System.out.printf("%02d ", array[ii][jj]);
            }
            System.out.println();
        }


    }
}
