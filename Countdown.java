class Implementation {

    void countdown(int i) {
        System.out.println(i);

        // Base case
        if (i <= 1) {
            return;
        }

        // Recursive case
        countdown(i-1);
    }
}
