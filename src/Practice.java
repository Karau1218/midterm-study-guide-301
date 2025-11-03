import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.TreeSet;

public class Practice {

    /**
     * Returns the difference between the largest and smallest integer in an array.
     * @return the difference between the largest and smallest number
     */
    // Using array
    public static int maxDiff(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxnum = nums[0];
        int minnum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxnum) {
                maxnum = nums[i];
            }
            if (nums[i] < minnum) {
                minnum = nums[i];
            }
        }

        return maxnum - minnum;
    }

    /**
     * Finds the longest word in an ArrayList that starts with a specific character.
     * return the longest word that starts with the given character
     */
    // Using ArrayList
   public static String longestWord(ArrayList<String> words) {
    if (words.isEmpty()) return "";

    String longest = "";

    for (String word : words) {
        if (word.length() > longest.length()) {
            longest = word;
        }
    }

    return longest;
}


    /**
     * Counts how many words in a HashSet have length > n and < m
     * 
     * @param words HashSet of words
     * n - minimum length
     * m - maximum length
     * @return the number of words in the set with length between n and m
     */
    // Using HashSet
    public static int countWords(HashSet<String> words, int n, int m) {
        int count = 0;

        for (String word : words) {
            int length = word.length();
            if (length > n && length < m) {
                count++;
            }
        }

        return count;
    }

    /**
     * Finds the difference between the sum of even and odd numbers in a HashMap (values)
     * numbers - HashMap with Integer values
     * return difference between sum of even and odd numbers
     */
    // Using HashMap (values)
    public static int oddEvenDiff(HashMap<String, Integer> numbers) {
        int evenSum = 0;
        int oddSum = 0;

        for (int num : numbers.values()) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        return evenSum - oddSum; // returns the difference
    }

    /**
     * Finds the second-largest key in a HashMap (keys)
     * words - HashMap with String keys
     * return the second-largest key alphabetically, or null if not enough keys
     */
    // Using HashMap (keys)
    public static String secondLargest(HashMap<String, Integer> words) {
        TreeSet<String> sortedKeys = new TreeSet<>(words.keySet());

        if (sortedKeys.size() < 2) {
            return null; // Not enough keys
        }

        sortedKeys.pollLast(); // remove largest
        return sortedKeys.last(); // second-largest
    }
}
