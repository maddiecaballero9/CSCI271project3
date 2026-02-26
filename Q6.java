/*************************************************************************
* Project 3 for CSCI 271-001 Spring 2026
*
* Author: MadelynReyes
* OS: 
* Compiler: java
* Date: feb 25, 2026
*
* Purpose: 
* This program takes in a list of numbers and adds all the even numbers in 
* that list using a recursion function.
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
* Description: Recursively sums all even numbers in an array.
*
* Parameters:arr is the array of integers and index is the current index in the array
*
* Pre: arr was initialized and index >= 0
*
* Post: Returns sum of all even numbers in arr
*
* Returns: int is the sum of even numbers
*
* Called by: Q6
* Calls: recursion
********************************************************************/ 
import java.util.Scanner;
public class Q6 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);  ///gets the input from user
	    
	        System.out.println("Enter the total numbers in your list"); //ask for the total number your going to enter
	        int total = input.nextInt(); //takes in the size of the numbers 
	        int[] arr = new int[total];  //with that total size it makes the array and stores the number in there
	        
	        System.out.println("Enter the numbers");  //user has to input the numbers with space inbetween
	        for (int i =0; i < arr.length; i++) {    //its a loop for the arry and it fills in the array
                arr[i] = input.nextInt();  //say in the total you put 5 so arr.length is 5 so the loop will stop once you get to 4 and store the number input into the array
            }
            
	        int result = sumEven(arr, 0);   //calls the recursion function sumEven starting from index 0
	        System.out.println("The sum of even number is: " + result); //outputs the results
	    }
    public static int sumEven(int[] arr, int index) {
         if (index == arr.length) {       //base case
            return 0;
        }
        
        if (arr[index] % 2 == 0) {     //this checks if the number is even starting at 0
            return arr[index]+ sumEven(arr, index + 1);  //and if the number is even then it add the number and moved to the next index
        } else {
            return sumEven(arr, index + 1); //if not it doesnt add anything and moves to the next index
        }

    }
}

/*
*n length of string
*Time complexity is O(n)
*Space complexity is O(n)
*
*/
