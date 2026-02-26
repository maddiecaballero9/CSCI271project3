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
* Description: Recursively counts how many times a digit occurs in an integer.
*
* Parameters:
*   list is the integer to search for
*   digit is the digit to count
*
* Pre:
*   list >= 0
*   digit is 0-9
*
* Post:
*   Returns number of times digit appears in list
*
* Returns: int is the count of digit in list
*
* Called by: Q4
* Calls:recursion
********************************************************************/ 
import java.util.Scanner;
public class Q4 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);  //input from the user 
	    
	        System.out.println("Enter your the numbers");   // the list of the numbers
	        int list = input.nextInt();    // reads the integer the user inputted 
	        System.out.println("Enter the digit"); // the number you want to find
	        int digit = input.nextInt();    // reads the digit the user inputted 
	        
	        int result = numOfDigit(list,digit);       // calls the recursion function numOfDigits
	        System.out.println("Numbers of time digit appear: " + result); // the way its going to be outputted
	    }
    public static int numOfDigit(int list,int digit) {
        if (list == 0) {      //base case
            return 0;
        }
        int lastNum = list % 10;    //gets the last number of the list
        if (lastNum == digit) {     //if the last number is the same as digit
            list /= 10;             // it removes the last number
            return 1 + numOfDigit(list,digit);  //it adds one and then it go through recursion again
        } else {
            list /= 10;     //if not the same then it just removes the last number
            return numOfDigit(list,digit);  //it goes through recursion again but it doesnt add anything
        }
    }
}

/*
*n number of digits in the number
*Time complexity is O(n)
*Space complexity is O(n)
*
*/
