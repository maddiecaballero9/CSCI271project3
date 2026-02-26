/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: MadelynReyes
* OS: 
* Compiler: java
* Date: feb 23, 2026
*
* Purpose: 
* This program takes in a string from a user and outputs the
* length of the word that the user inputted using recursive
* function.
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
* Description: Recursively calculates the number of characters in a string.
* 
* Parameters:
* Name is the string whose length we are calculating.
* index is where currently at
* Pre: 
* name is initalized 
* post:
* returns the number of charaters in the string
* called by: Q1
* calls: none
********************************************************************/

import java.util.Scanner;
public class Q1 {
	    public static void main(String[] args) {
	        Scanner names = new Scanner(System.in);  //this reads input from the user
	    
	        System.out.println("Enter your name");    //print this out
	        String name = names.nextLine();           //takes in that name
	        int result = numOfLetters(name,0);        //calls recursive function 
	        System.out.println("Numbers of letters: " + result);  // then prints that output from thr recurive function
	    }
    public static int numOfLetters(String name, int index) {
	if (name.length() == index) {       //base case
		return 0;
	}else {                            //recursive case: calls the function and its increaing index by 1 everytime it goes through this
        return 1 + numOfLetters(name,index + 1);
    }
    }
}
/* Time complexity: O(n)
*n is length of string
*creates a new string of length n-1 
*/
