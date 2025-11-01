import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    
     // using array
    public static int maxDiff(int[] nums) {
        // TODO: implement this
        if(nums.length == 0) {
            return 0;
        }

        int maxnum = nums[0];
        int minnum = nums[0];

        // For loop for going through each number
        for (int i = 1; i < nums.length; i++){
            if(nums[i] > maxnum) {
                maxnum = nums[i];
            }
            if (nums[i] < minnum) {
                minnum = nums[i];
            }
        }
        int maxDiff = maxnum - minnum;
        return maxDiff;
    }


    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.


// find longestword --> ArrayList
 public static String longestword(ArrayList<String> words, char start) {
    String longest = "";

    // looping through the words
    for ( String word : words ) {
        if ( word.length() > 0 && word.charAt(0) == start) {
            if(word.length() > longest.length()) {
                longest = word;
            }
          
        }
        
        }
        return longest;
    
}

    //


 }



// countWordsBetweenNAndM” → HashSet
public static String countWordsBetweenNAndM(Set<String>words) {

//Set<String> words = new HashSet<String>();
    // using characters to loop
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


// oddEvenDiff” → HashMap (values)
public static int oddEvenDiff(HashMap<int> even) {
    






 }

// secondLargest” → HashMap (keys)
public static int secondLargest(int[] nums) {



 }


