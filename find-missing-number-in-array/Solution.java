import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;

// solution

import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public static List<Integer> missingNumbers(int[] numArr) {
        // fill in
        // with solution
        int j = 0;
        List<Integer> missingNumbers = new ArrayList<Integer>();
        for(int i = numArr[0]; i <= numArr[numArr.length-1]; i++) {
            if(numArr[j] != i) {
                missingNumbers.add(i);
            } else {
                j++;
            }
        }
        return missingNumbers;
    }

    // print your findings using this function!
    public static void log() {
        System.out.println(missingNumbers(new int[] {}));
    }

}


public class MainTest {

    // tests

    @Test
    public void onlyOneMissingTest() {
        assertIterableEquals(Solution.missingNumbers(new int[] { 0, 1, 3 }), Arrays.asList(2));
    }

    @Test
    public void multipleMissingTest() {
        assertIterableEquals(Solution.missingNumbers(new int[] { 10, 11, 14, 17 }), Arrays.asList(12, 13, 15, 16));
    }

    @Test
    public void moreNumbersMissingThanNotTest() {
        assertIterableEquals(Solution.missingNumbers(new int[] { 3, 7, 9, 19 }),
                Arrays.asList(4, 5, 6, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18));
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
