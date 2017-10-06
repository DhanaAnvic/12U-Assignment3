/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A3Q3 {
    
    //create a method to return the set of array and coung how many the ones are
    public int countOnes(int [] array){
        //create a variable to start the sum by 0
        int sum = 0;
        
        //goes through the list of array once
        for (int i= 0 ; i < array.length; i++){
            //if number equals to 1 it will add 1 each time
            if(array[i] == 1){
                sum++;       
            }
        }
        //return the sum
        return sum;
                    
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        A3Q3 test = new A3Q3();
        int array[] = {0, 0, 0, 0, 0, 1, 1, 1};
        int n = array.length;
        System.out.println("Count of ones is " + test.countOnes(array));
    }
}
