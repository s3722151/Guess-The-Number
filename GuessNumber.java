//https://www.w3schools.com/java/java_user_input.asp
import java.util.Scanner;


public class GuessNumber {
    public static void main(String[] args) {
      // Step 1: Generate a random number between 1 and 5
      // Use Java's Random class or Math.random() method
      // (Hint: You need to import java.util.Random if you use the Random class)
          // https://www.w3schools.com/java/tryjava.asp?filename=demo_howto_random_number2
      int randomNum = (int)(Math.random() * 11); // 0 to 10
  
      // Step 2: Prompt the user to guess the number
      // (Hint: You will need to take input from the user; consider using a Scanner)
       Scanner myObj = new Scanner(System.in);   
       int userInput = 0;  // Initialize a variable to store the user's guess

       // Step 3: Use a while loop to keep prompting the user until they guess the correct number
        // (Hint: While the user's guess does not equal the random number)

        while (userInput != randomNum ) {
          // Step 4: Prompt the user to guess the number
          // (Hint: Use System.out.print or System.out.println to display a message)
          System.out.println("Please guess the number between 1 and 10");

          // Step 5: Read the user's input and store it in a variable
          // (Hint: Use Scanner's nextInt() to get the guess from the user)
          int userInput = myObj.nextInt();

          // Step 6: Check if the guess is correct using an if-else statement
          // (Hint: Use if to check if the guess matches the randomly generated number)

          // Step 7: If the guess is incorrect, print a message telling the user it's wrong
          // (Example: "Number X is incorrect, try again.")
          if(randomNum != userInput){
            System.out.println(userInput + "Is not the generated number");
            System.out.println("Please enter another number");
                      
          }

          // Step 8: If the guess is correct, print a success message and break out of the loop
          // (Example: "Correct! The number is Y.")
          else if (randomNum == userInput){
            System.out.println(userInput + "Is the generated number!!");
          }

        // Step 9: End the program after displaying the result
        // (Hint: You can add a final message to close the game)
        System.out.println( "The game is now finished");


      }



    
    }
  }
  