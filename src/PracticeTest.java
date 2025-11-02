import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    

    // TODO: Make tests for each problem you solve
    
    // TEST 2 --> Longest word arrayList
  @Test
    void testLongestWord() {
        ArrayList<String> words = new ArrayList<>(List.of("apple", "banana", "pear"));
        String actual = Practice.longestWord(words);
        assertEquals("banana", actual); // longest starting with 'a'
    }


    // Test 3 Hash Set test --> Count between N and M
    @Test
    void testCountWordsBetweenNAndM_HashSet() {
        HashSet<String> words = new HashSet<>(Arrays.asList("hi", "hello", "fantastic", "great"));
        int actual = Practice.countWords(words, 3, 8);
        assertEquals(2, actual); // "hello", "great"
    }



    //test 4: Hashmap values--> int odd even diff 
        @Test
    void testOddEvenDiff_HashMapValues() {
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("A", 2);
        numbers.put("B", 5);
        numbers.put("C", 8);
        int actual = Practice.oddEvenDiff(numbers);
        // evens = 2 + 8 = 10, odds = 5, diff = 10 - 5 = 5
        assertEquals(5, actual);
    }


    //test 5: Hashmap --> Secondlargest keys
       @Test
    void testSecondLargest_HashMapKeys() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("banana", 1);
        map.put("apple", 2);
        map.put("cherry", 3);
        String actual = Practice.secondLargest(map);
        assertEquals("banana", actual); // alphabetically: apple, banana, cherry
    }
}

