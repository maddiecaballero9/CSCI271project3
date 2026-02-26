/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: MadelynReyes
* OS: 
* Compiler: java
* Date: feb 23, 2026
*
* Purpose: 
* This program reads feom a list of numbers from user and 
* finds which number is the max using recursion function.
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
* 
* Description: Recursively finds the maximum number in an array.
*
* Parameters:
*   arr is the array of integers
*   total is the number of elements from the start
*
* Pre:
*   arr was initialized with total > 0
*
* Post:
*   Returns the max number in the array
*
* Returns: int is the max value in arr
*
* Called by: Q3
* Calls: recursion
********************************************************************/ 
import java.util.Scanner;
public class Q3 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in); //this reads input from the user
	    
	        System.out.println("Enter the total numbers in your list"); // asking how many numbers in total is in the list
	        int total = input.nextInt();   //takes in from the user the numbers in the whole list
	        int[] arr = new int[total];    //creates a int array using the total which is from the user
	        
	        System.out.println("Enter the numbers");  //enter the numbers with spaces inbetween
	        for (int i =0; i < total; i++) {       //loop for the array and stores the numbers into the array
                arr[i] = input.nextInt();         //if total is 3 then the loop will run until i gets to 2 and store it in the array we created
            }
            
	        int result = maxOfNum(arr, total);   //calling the recursion function maxOfNum
	        System.out.println("The max number is: " + result); //the way it will be outputted 
	    }
    public static int maxOfNum(int[] arr, int total) {
         if (total == 1) {      //base case
            return arr[0];
        }
        int maxNum = maxOfNum(arr,total - 1);   //recursion finding the max in the array
        if (arr[total - 1] > maxNum) {       //compare the last element with the number that is at the max 
            return arr[total - 1];       //return the last element
        } else {
            return maxNum;      // and if it doesnt find a bigger num then thats the max
        }

    }
}
/*
*n is the total number of elements
*Time complexity is O(n)
*Space complexity is O(n)
*
*/

