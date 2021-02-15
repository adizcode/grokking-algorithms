class Implementation {

    void selectionSort(int[] arr) {

        // Sort the array one element at a time
        for (int i = 0; i < arr.length; i++) {

            // Find index of the next smallest element
            int smallestIndex = findSmallestIndex(arr, i);

            // Swap the current element with the smallest element
            // Thereby sorting all elements so far
            swap(arr, i, smallestIndex);
        }
    }

    int findSmallestIndex(int[] arr, int startIndex) {

        // Store index of the smallest value
        int smallestIndex = startIndex;

        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] < arr[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    void swap(int[] arr, int indexOne, int indexTwo) {

        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
}
