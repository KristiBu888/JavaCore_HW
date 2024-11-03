//Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.

public class hw_task_3 {
    public static void main(String[] args) {
        int [] arr = {1, 3, 0, 2, 0, 0, 6};
        zerosNeighbors(arr);
    }

    public static void zerosNeighbors(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (arr[i+1] == 0){
                    System.out.println("true");
                }
            }
        
        }   
    }
}
