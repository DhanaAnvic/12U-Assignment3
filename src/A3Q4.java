/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A3Q4 {

    public void countingSort(int[] n){
        //create a tracker for the array, so ot can track the number of arrays
        int [] tracker = new int [101];
        
        //runs through the set array
        for(int i = 0; i < n.length; i++){
            //for every spot in the tracker it will add 1 more
            tracker[n[i]] ++;
        }
        //create a variable to keep track the position
        int tr = 0; 
        
        //runs through the second set of numbers
        for(int i = 0; i < tracker.length; i++){
            //if the tracker array number is not equal to zero
            while(tracker[i] != 0){
                //sort the array
                n[tr] = i;
                //connect the first list of numbers to the second list of numbers
                tr++;
                //subtract 1 from the number each time
                tracker[i]--;
                
            }
            
        }
        
    }
    public static void main(String[] args) {
        
        //test out the boundaries
        A3Q4 test = new A3Q4();
        
        // Create an array containing 8 numbers
        int[] numList = {15, 21, 3, 78, 90, 3, 2, 2};
        
        for (int i = 0; i < numList.length; i++) {
            // Calling the method
            test.countingSort(numList);
            // Printing the method
            System.out.println(numList[i]);
    }
}
}

