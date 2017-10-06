/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A3Q5 {

    public void insertionSort(String[] word){
        //start going through the array of word
        for(int i = 0; i < word.length; i++){
            //create a varible to keep track the position
            int term = i;
            //create a while statement that if when position is greater than 0 and if it is not in alphabetical switch them
            while(term > 0 && word[term - 1 ].compareToIgnoreCase(word[term]) > 0){
                // Switch the integers to arrange themselves in alphabetical order
                String temp = word[term];
                word[term] = word[term -1];
                word[term-1] = temp;
                // Continue to decrease until the very last word 
                term--;
                
            }
        
        }
        
    }
    public static void main(String[] args) {
        A3Q5 test = new A3Q5();
        
        // String of words!
        String[] wordList = {"Banana", "Hi", "Chair", "Cellphone", "Facebook", "Math"};
        // Printing the elements individually
        for (int i = 0; i < wordList.length; i++) {
            // Calling the method
            test.insertionSort(wordList);
            // Printing the method
            System.out.println(wordList[i]);
    }
}
}
