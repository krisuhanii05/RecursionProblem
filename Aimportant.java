public class Aimportant{

     public static int[] allIndexes(int input[], int x, int startIndex) {
        // Base case: if we've reached the end of the array
        if(startIndex == input.length) {
            // No more elements: return empty array
            return new int[0];
        }
        // Recursively find indexes in the rest of the array
        int[] smallOutput = allIndexes(input, x, startIndex + 1);
        // If the current element matches
        if(input[startIndex] == x) {
            // Create new array of length +1 to store this index and previous ones
            int[] output = new int[smallOutput.length + 1];
            output[0] = startIndex; // Store the current index
            // Copy all previous found indexes to the new array
            for(int i = 0; i < smallOutput.length; i++) {
                output[i + 1] = smallOutput[i];
            }
            return output;
        } else {
            // Just return what we've got so far
            return smallOutput;
        }
    }

    // This function is called directly and sets off the recursion from index 0
    public static int[] allIndexes(int input[], int x) {
        return allIndexes(input, x, 0);
    }
    
    public static void main(String[] args){
        
    }
}

// Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in the output array (in increasing order).

// Do this recursively. Indexing in the array starts from 0.

// Hint:
// Try making a helper function with the required arguments and call the helper function from the allIndexes function.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 1 <= N <= 10^3
// Sample Input :
// 5
// 9 8 10 8 8
// 8
// Sample Output :
// 1 3 4