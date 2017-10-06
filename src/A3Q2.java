/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A3Q2 {
    
    public void swap (int [] array, int pos1, int pos2){
        //swapping two positons together
        int temp = array[pos1];
        array [pos1] = array [pos2];
        array[pos2] = temp;
    }
    
        //create a method for the selection sort
        public void selectionSort(int [] array){
            //keeping track on what position we are in
            for(int position = 0; position < array.length; position++ ){
                //go through the rest of the numbers and find the smaller number
                for(int i = position + 1; i < array.length; i++){
                    //Did we find the smaller number
                    if(array[i] < array[position]){
                        //swap the numbers
                        swap(array, i, position);
                    }
                }
            }
        }
  
    
    //create a method to return and array list and looking for the smallest number in the list of array   
    public int smallestMissingNum(int[]array){
        // create a varible to start the position at 0
            int missingNum = 0;
            // if it does not work go back to selection sort
            selectionSort(array);
        
          // create a for loop to go through the list of numbers
        for(int j = 0; j < array.length; j++){
            //if the missing number equals to the number it was looking for, it will ad 1 each time
            if(missingNum == array[j]){
                missingNum++;
            }
       
        }
        //return the missing number
        return missingNum;
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        A3Q2 test = new A3Q2();
        
        //create an array of numbers
        int arr[] = {0, 1, 2, 3, 7, 8, 9, 11, 12};
        
        //print out the smallest numbers on the list of array listed above
        System.out.println("the smallest missing number:" + test.smallestMissingNum(arr));
}
}
