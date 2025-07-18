package com.hoan.algo2025.playground;

class QuickSort {
    static void sort(int array[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            sort(array, low, pivotIndex - 1);
            sort(array, pivotIndex + 1, high);
        }
    }

    static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = { 10, 7, 8, 9, 1, 5 };
        sort(array, 0, array.length - 1);

        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

