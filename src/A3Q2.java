/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A3Q2 {
    
    //create a method to return and array list and looking for the smalelst number in the list of array   
    public int smallerMissingNumber(int []array, int start, int end){
        
    // create an if statement that is the starting number is greater than the ending number
    // then it will return to the end and add 1
    if (start > end){
            return end + 1;
    }
    // create an if statement that if the starting number is not equal to the first number in the array
    // it will return to the starting point
     if (start != array[start]){
            return start;
     }
     //create a varible mid that adds the starying point to the ending number and divide it by 2
     int mid = (start + end) / 2;
 
     // Left half has all elements from 0 to mid
     if (array[mid] == mid){
          return smallerMissingNumber(array, mid + 1, end);
        }
        return smallerMissingNumber(array, start, mid);
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        A3Q2 test = new A3Q2();
        int arr[] = {0, 1, 2, 3, 7, 8, 9, 11, 12};
        int n = arr.length;
        System.out.println("First Missing element is : " + test.smallerMissingNumber(arr, 0, n - 1));
}
}
