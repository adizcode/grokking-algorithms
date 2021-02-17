class Implementation {

    // Compute GCD using the Euclidean Algorithm
    // GCD of integers a and b is the same as the GCD of b and the remainder of a / b
    int gcd(int a, int b) {

        // Base case
        if (b == 0) {
            return a;
        }

        // Recursive case
        return gcd(b, a % b);
    }
}
