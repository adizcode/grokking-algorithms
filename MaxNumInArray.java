class Implementation {
    
    int maxNumInArray(int[] arr, int n) {

        // Base case #1
        if (n <= 0) {
            return 0;
        }

        // Base case #2
        if (n == 1) {
            return arr[n - 1];
        }

        // Recursive case
        int subMax = maxNumInArray(arr, n - 1);
        return Math.max(subMax, arr[n - 1]);
    }
}
