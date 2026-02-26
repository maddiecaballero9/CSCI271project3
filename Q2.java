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
* character that the user inoutted to see how many times that
* speafic character pops up
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
*  Description: Recursively counts the number of times a character appears in a string.
*Parameters:
*   word is the string to search
*   chara is the character to count how many times it appears
* Pre:
*   word was initialized 
*   chara is a character
*
* Post:
*   Returns the number of time chara appeared in word
*
* Returns: int is the count of chara in word
*
* Called by: Q2
* Calls: recursion
* 
********************************************************************/ 
import java.util.Scanner;
public class Q2 {
	    public static void main(String[] args) {
	        Scanner word = new Scanner(System.in);   //this reads input from the user
	    
	        System.out.println("Enter your the word");
	        String words = word.nextLine();       //takes in the user input first the string 
	        System.out.println("Enter the character");
	        String charas = word.nextLine();      //then the character it wants us to count
	        
	        int result = numOfChara(words,charas.charAt(0));  //this calls the recursion function numOfChara
	        System.out.println("Numbers of character: " + result); //this shows how its going to be output
	    }
    public static int numOfChara(String word,char chara) {
        if (word.length() == 0) {  //base case for when the word reaches empty
            return 0;
        }
        if (word.charAt(0) == chara) {      //recursion checks if the first letter match chara
            return 1 + numOfChara(word.substring(1), chara); // and if it does it adds one and then checks the next letter in that string
        } else {
            return numOfChara(word.substring(1), chara); // does the same as above but doesnt add one 
        }
    }
}

/*
*n is the length of the string
*so the time complexity is O(n)
*Each call processes 1 character + substring
*/
