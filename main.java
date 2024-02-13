// Practicum 12 (Yes/No Program)
// (TO WRITE)

// This program should prompt the user to enter "yes" or
// "no" and output their response. The user should be allowed to
// enter their response with either upper or lower case characters
// (e.g., "yes", "Yes", "YES").

// REQUIRED OUTPUT:
// The program MUST display the results exactly as shown below:
// "User entered yes"
// "User entered no"
//
// (TO COMPLETE)
public class main {
    public static void main(String[] args) {
      //Declare input variable
      String sInput;

      //Scanner created (assuming only a type of "yes" or "no" will be inputed)
      java.util.Scanner UserInput = new java.util.Scanner(System.in);
      System.out.print("Yes or no?: ");
      sInput = UserInput.nextLine();

      //Makes input uppercase
      sInput = sInput.toUpperCase();

      if(sInput.equals("YES"))
      {
        System.out.println("User entered yes");
      }
      else
      {
        System.out.println("User entered no");
      }


    }

}
