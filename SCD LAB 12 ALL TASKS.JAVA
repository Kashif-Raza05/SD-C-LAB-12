import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class squaretest {
    @Test
    void test() {
        // Create an instance of the lab12 class
        lab12 obj = new lab12();
        // Call the square method on the obj instance
        int output = obj.square(5);
        // Check if the square of 5 is 25
        assertEquals(25, output);
    }
    @Test
    void testCountA() {
        lab12 obj = new lab12();
        // Test case with some 'a' and 'A' characters
        int output1 = obj.countA("Apples and Avocados");
        assertEquals(4, output1);
        // Test case with no 'a' or 'A' characters
        int output2 = obj.countA("Hello World");
        assertEquals(0, output2);
        // Test case with all 'a' and 'A' characters
        int output3 = obj.countA("aaaaAAA");
        assertEquals(7, output3);
    }
}

public class maxmin {
    // Method to find maximum integer in an array
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    // Method to find minimum integer in an array
    public int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}

import static org.junit.jupiter.api.Assertions.*;

class maxminTest {

    @Test
    void testFindMax() {
        maxmin obj = new maxmin();
        int[] arr = {1, 2, 3, 4, 5};
        int max = obj.findMax(arr);
        assertEquals(5, max);
    }

    @Test
    void testFindMin() {
        maxmin obj = new maxmin();
        int[] arr = {1, 2, 3, 4, 5};
        int min = obj.findMin(arr);
        assertEquals(1, min);
    }
}

public class MathOperations {

    // Method to check if number is odd
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }

    // Method to check if number is even
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to check if number is prime
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to calculate factorial
    public int factorial(int num) {
        if (num == 0) return 1;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
public class MathOperations {
    // Method to check if number is odd
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }
    // Method to check if number is even
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
    // Method to check if number is prime
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    // Method to calculate factorial
    public int factorial(int num) {
        if (num == 0) return 1;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {
    MathOperations obj = new MathOperations();

    @Test
    void testIsOdd() {
        assertTrue(obj.isOdd(5)); // 5 is odd
        assertFalse(obj.isOdd(4)); // 4 is not odd
    }

    @Test
    void testIsEven() {
        assertTrue(obj.isEven(4)); // 4 is even
        assertFalse(obj.isEven(5)); // 5 is not even
    }

    @Test
    void testIsPrime() {
        assertTrue(obj.isPrime(7)); // 7 is prime
        assertFalse(obj.isPrime(9)); // 9 is not prime
        assertFalse(obj.isPrime(1)); // 1 is not prime
    }

    @Test
    void testFactorial() {
        assertEquals(120, obj.factorial(5)); // 5! = 120
        assertEquals(1, obj.factorial(0)); // 0! = 1
    }
}

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllTests.class })
public class AllTests {

}
