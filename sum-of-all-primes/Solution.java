import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

// solution

class Solution {

    public static int sumOfPrimes(int n) {
        // fill in
        // with solution
        int sum = 0;
        for(int i=2; i<=n; i++){
            if(isPrimeNumber(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPrimeNumber(int n){
        for(int i=2; i<=n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    // print your findings using this function!
    public static void log() {
        System.out.println(sumOfPrimes(2));
    }

}


public class MainTest {

    // tests

    @Test
    public void sumOfPrimesForTwoTest() {
        assertEquals("sumOfPrimes(2) should equal 2", Solution.sumOfPrimes(2), 2);
    }

    @Test
    public void sumOfPrimesForThirtyTest() {
        assertEquals("sumOfPrimes(30) should equal 129", Solution.sumOfPrimes(30), 129);
    }

    @Test
    public void sumOfPrimesForFiftyFiveTest() {
        assertEquals("sumOfPrimes(55) should equal 381", Solution.sumOfPrimes(55), 381);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MainTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }

}
