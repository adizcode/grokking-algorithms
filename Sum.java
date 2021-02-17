class Implementation {

    // Compute the sum of an array recursively
    int sum(int[] arr, int n) {

        // Base case
        if (n <= 0) {
            return 0;
        }

        // Recursive case
        return sum(arr, n - 1) + arr[n - 1];
    }
}
