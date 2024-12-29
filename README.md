# Java ArrayIndexOutOfBoundsException

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`. The `bug.java` file contains the erroneous code, attempting to access an array element outside its valid index range (0-4 for a 5-element array). The `bugSolution.java` file shows the corrected version, preventing the exception by checking the array bounds before access.

## How to Run
1. Clone the repository.
2. Compile and run the `bug.java` file (expect an exception).
3. Compile and run the `bugSolution.java` file (should execute without error).

## Lesson Learned
Always carefully check array indices to avoid `ArrayIndexOutOfBoundsException` runtime errors.  Implement appropriate bounds checking before accessing array elements.