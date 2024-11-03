//Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.

public class hw_task_2 {
    public static void main(String[] args) {
        int [] arr = {1, 3, 2, 6};
        differenceBetweenMaxAndMin(arr);
    }


    public static void differenceBetweenMaxAndMin(int[] arr) {
        int max = 0;
        int min = arr [0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int diff = max - min;
        System.out.println("Минимальное значение = " + min);
        System.out.println("Максимальное значение = " + max);
        System.out.println("Разница между max и min = " + diff);
    }

}
