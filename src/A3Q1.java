/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A3Q1 {

    //create a method to swap the first position and second position
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
                for(int i = position + 1; i < array.length; i++){
                    if(array[i] < array[position]){
                        swap(array, i, position);
                    }
                }
            }
            
        }
        
    public static void main(String[] args) {
        
        A3Q1 test = new A3Q1();
        
         int[] numbers = new int[10];
          for(int  i = 0; i < numbers.length; i++){
        //make a random number
        //generating random numbers between 1 and 100
        numbers[i] = (int)(Math.random() * 101);
          }
        
          //BEFORE
     System.out.println("BEFORE:");
     for(int  i = 0 ; i < numbers.length; i++){
      System.out.println(numbers[i]);
  }
     //SORT HERE
     test.selectionSort(numbers);
  
    //AFTER
     System.out.println("AFTER");
     for(int  i = 0 ; i < numbers.length; i++){
      System.out.println(numbers[i]);
    }
}
}
