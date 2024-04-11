//This program Removes all duplicate numbers in an array and return the original array, the unique numbers in the array and the removed numbers
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_duplicates {

    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {
        //Makes unique array
        List<Integer> uniqueArr = new ArrayList<>();
        //Adds unique elements to unique array
        for (int i = 0; i < arr.size(); i++) {
            if (!uniqueArr.contains(arr.get(i))) {
                uniqueArr.add(arr.get(i));
            //adds removed elements to removed list
            } else {
                removedElements.add(arr.get(i));
            }
        }
        return uniqueArr;
    }

    public static void main(String[] args) {
        // Test the function
        //This tests the function with list 1, 2, 2, 3, 4, 4, 5
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> removedElements = new ArrayList<>();
        List<Integer> uniqueArr = removeDuplicates(arr, removedElements);
        
        //Display original, unique and removed arrays
        System.out.println("Original array: " + arr);
        System.out.println("Unique array: " + uniqueArr);
        System.out.println("Removed elements: " + removedElements);
    }
}
