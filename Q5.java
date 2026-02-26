/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: MadelynReyes
* OS: 
* Compiler: java
* Date: feb 24, 2026
*
* Purpose: 
* This program takes in a string from a user and outputs the
* the string the user inputted and prints it backwards
* 
* *************************************************************************/
/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* <Madelyn Reyes>
********************************************************************/
/*******************************************************************
* Description: Recursively reverses a string.
*
* Parameters: word is the string to reverse
*
* Pre: word was initialized
*
* Post:Returns the string reversed
*
* Returns: String is the reversed string
* 
* Called by:Q5
* Calls:recursion
********************************************************************/ 
import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //gets the input from user
	    
	    System.out.println("Enter your the word");
        String word = input.nextLine();     //reads in the word inputted
        System.out.println("This is the word backwards " + backwards(word));  // the way its going to be outputted also it calls the recursion function backwards
	        
	}
    public static String backwards(String word) {
        if (word.length() == 0) {     // base case if empty
            return word;
        }
        else {   //otherwise then that it reverse the string getting the first latter and putting it at the end 
            return backwards(word.substring(1)) + word.charAt(0); 
        }
    }
}

/*
*n length of string
*Time complexity is O(n)
*Space complexity is O(n)
*
*/

