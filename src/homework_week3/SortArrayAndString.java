package homework_week3;

import java.util.Arrays;

public class SortArrayAndString {
    public static void arrayString() {
        int[] array1 = {27, 45, 5, 56, 77, 84, 95, 15, 55, 35, 67, 96};
        String[] array2 = {"Khilen", "Neha", "Rupal ", "Navil", "Aruna", "Jaydip", "KamleshRamgi"};
        System.out.println("Original value: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted Value : " + Arrays.toString(array1));
        System.out.println("Original value : " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted Value : " + Arrays.toString(array2));
    }
    public static void main(String[] args) {

        arrayString();
    }
}
