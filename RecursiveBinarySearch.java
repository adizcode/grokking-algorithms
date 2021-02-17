class Implementation {
    
    Integer binarySearch(List<Integer> list, int low, int high, int item) {

        // Base case: Search space is empty
        if (low >= high) {
            return null;
        }

        // Recursive case: Search within a reduced search space
        int mid = low + ((high - low) / 2);
        int guess = list.get(mid);

        if (guess == item) {
            return mid;
        }

        else if (guess > item) {
            high = mid - 1;
        }

        else {
            low = mid + 1;
        }
        
        return binarySearch(list, item, low, high);
    }
}
