package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    int[] intArrays = getIntergers(5);
	    printArray(intArrays);
	    int[] swappedArrays = sortIntegers(intArrays);
        System.out.println("--------swapped(descending order)--------");
	    printArray(swappedArrays);
    }

    public static int[] getIntergers(int number) {
        int[] tmpArray = new int[number];
        System.out.println("Enter number " + number + " times. /r");
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = scanner.nextInt();
        }
        return tmpArray;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("numbers are " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int tmpMinValue = array[0];
        int tmpMinPosition = 0;
        int loopCnt = array.length;

        while(loopCnt != 0) {
            for (int i = 0; i < loopCnt; i++) {
                if (tmpMinValue > array[i]) {
                    tmpMinValue = array[i];
                    tmpMinPosition = i;
                }
            }
            // swap value at end of index with minimum value at the index
            array[tmpMinPosition] = array[loopCnt-1];
            // set value at end of index by minimum value in current array
            array[loopCnt-1] = tmpMinValue;
            tmpMinValue = array[0];
            tmpMinPosition = 0;
            loopCnt -= 1;
        }
        return array;
    }
}
