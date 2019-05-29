package mashin;

import java.util.Arrays;

public class ArrayAlgoritmSort {

    public static void main(String[] args) {
        int[] arr = {4, 8, 1, 0, 16, -45, 0, 0};
//сортировка вставками
        for (int i = 0; i < arr.length; i++) {
   /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
               /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
/*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
                if (i != min_i) {
                    int tmp = arr[i];
                    arr[i] = arr[i];
                    arr[min_i] = tmp;
                }
            }
        }

//        for (int m : arr) {
//            System.out.println(m);
//        }


//сортировка пузырьком
        int [] mas = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));

    }
}



