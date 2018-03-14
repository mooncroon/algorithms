package com.grecha.test;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println(binary(numbers, 16));
    }
    public static int binary(int array[], int item){
        int lowest = 0;
        int higher = array.length-1;
        while(lowest<=higher) {
            int middle = (lowest+higher) /2;
            if (item == array[middle])
                return middle;
            else if (item < array[middle])
                higher = middle-1;
            else if (item > array[middle])
                lowest = middle+1;
        }
        return -1;
    }
}
