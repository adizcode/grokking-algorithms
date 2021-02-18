class Implementation {

    /*
     * This is a very naive implementation of quicksort.
     * A better way would be to pass the start and end indices of the sub-arrays alongside as arguments.
     * Partitioning of sub-arrays should be offloaded to a helper method.
     * Optimization: Pick the median as pivot to ensure O(n log n) in worst-case.
     */
     
    void quickSort(int[] arr) {

        // Base case: Arrays with 0 or 1 element are already sorted
        if (arr.length < 2) {
            return;
        }

        // Recursive case

        // Pick a pivot randomly from the array
        int rand = new Random().nextInt(arr.length);
        int pivot = arr[rand];

        // Split the array into: lessThanPivot (sub-array) + pivot + greaterThanPivot (sub-array)

        // Count the no. of lesser and greater elements (since arrays are of fixed-length)
        int lesserCount = 0;
        int greaterCount = 0;

        for (int i = 0; i < arr.length; i++) {

            // Skip over the pivot
            if (i == rand) {
                continue;
            }

            if (arr[i] <= pivot) {
                lesserCount++;
            }

            else {
                greaterCount++;
            }
        }

        // Initialize empty sub-arrays
        int[] lesser = new int[lesserCount];
        int[] greater = new int[greaterCount];

        // Fill the sub-arrays
        int lesserIndex = 0;
        int greaterIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            // Skip over the pivot
            if (i == rand) {
                continue;
            }

            if (arr[i] <= pivot) {
                lesser[lesserIndex++] = arr[i];
            }

            else {
                greater[greaterIndex++] = arr[i];
            }
        }

        // Recursively sort sub-arrays
        quickSort(lesser);
        quickSort(greater);

        // Merge lesser + pivot + greater to get back the original array, sorted
        int i = 0;

        for (int element : lesser) {
            arr[i++] = element;
        }

        arr[i++] = pivot;

        for (int element : greater) {
            arr[i++] = element;
        }
    }
}
