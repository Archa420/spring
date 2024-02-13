package rvt;

public class Sorter {
    public static int smallest(int[] array) {
        int smallest = array[0];

        int[]numbers = {6, 5, 8, 7, 11};
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
    return smallest;
    }
    
}
