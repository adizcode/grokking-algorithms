class Implementation {

    Integer binarySearch(List<Integer> list, int item) {

        // Track the portion of list being searched in
        int low = 0;
        int high = list.size() - 1;

        // While the list hasn't been narrowed down to one element
        while (low <= high) {
            
            // Caution! The following line of code is responsible for causing the infamous overflow bug:
            // int mid = (low + high) / 2;
            // Use this equivalent statement instead:
            int mid = low + ((high - low) / 2);
            
            // Check the middle element
            int guess = list.get(mid);

            // Found the item
            if (guess == item) {
                return mid;
            }

            // The guess was too high
            if (guess > item) {
                high = mid - 1;
            }

            // The guess was too low
            else {
                low = mid + 1;
            }
        }

        // The item doesn't exist
        return null;
    }
}
