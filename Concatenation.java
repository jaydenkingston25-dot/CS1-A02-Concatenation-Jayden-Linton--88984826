public class Concatenation {
    
    public static void main(String[] args) {
        
        // TODO 1: Define a String variable for the month (e.g., "June")
        String month = "June";
        
        // TODO 2: Define a String variable for the day (e.g., "Wednesday")
        String day = "Wednesday";
        
        // TODO 3: Define a String variable for your major.
        // Hint: Chain the .toUpperCase() method at the end of your string so it is automatically capitalized!
        String major = "computer science".toUpperCase();
        
        // TODO 4: Print the concatenated sentence.
        // Format: Today is _____, 2024. The day is ____. Our major is ____.
        // ADVERSARIAL HINT: Watch your spacing inside the quotation marks!
        System.out.println("Today is " + month + ", 2024. The day is " + day + ". Our major is " + major + ".");
        
        // TODO 5: Calculate the total number of characters across your month, day, and major variables.
        // Hint: Use the .length() method on each variable and add them together into an 'int' variable.
        int totalChars = month.length() + day.length() + major.length();
        
        // TODO 6: Print the total number of characters.
        // Format: The total number of characters is: XX
        System.out.println("The total number of characters is: " + totalChars);
        
        // TODO 7: Define two String variables, one for a first name and one for a last name.
        String firstName = "Jayden";
        String lastName = "Linton";
        
        // TODO 8: Retrieve the initials from both names.
        // Hint: Use .substring(0, 1) to grab the first letter of each name.
        // Concatenate them together with periods (e.g., letter1 + "." + letter2 + ".") and store in a String called 'initials'.
        String initials = firstName.substring(0, 1) + "." + lastName.substring(0, 1) + ".";
        
        // TODO 9: Print the 'initials' variable!
        System.out.println(initials);
    }
}
