package com.lnu.home;

public class ArrayOperation {

    private int getMinimumOfArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private int[] changeElementsInArrayFromEnd(int[] array, int numberOfElementsForReplacing, int replaceElement) {
        int[] changedArray = array.clone();

        for (int i = 0; i < numberOfElementsForReplacing; i++) {
            changedArray[changedArray.length - 1 - i] = replaceElement;
        }
        return changedArray;
    }

    public void replaceOperation(int[] array, int numberOfElementsForReplacing) {
        int min = getMinimumOfArray(array);


        System.out.println("Previous array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int[] changedArray = changeElementsInArrayFromEnd(array, numberOfElementsForReplacing, min);

        System.out.println("\nChanged array: ");
        for (int i = 0; i < changedArray.length; i++) {
            System.out.print(changedArray[i] + " ");
        }
    }
}
