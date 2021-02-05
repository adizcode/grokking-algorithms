class Implementation {

    Integer binarySearch(List<Integer> list, int item) {

        // Track the portion of list being searched in
        int low = 0;
        int high = list.size() - 1;

        // While the list hasn't been narrowed down to one element
        while (low <= high) {

            // Check the middle element
            int mid = (low + high) / 2;
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
