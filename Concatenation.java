public class Concatenation {
    
    public static void main(String[] args) {
        
        String month = "June";
        String day = "Wednesday";
        String major = "computer science".toUpperCase();
        
        System.out.println("Today is " + month + ", 2024. The day is " + day + ". Our major is " + major + ".");
        int totalChars = month.length() + day.length() + major.length();
        System.out.println("The total number of characters is: " + totalChars);
        
        String firstName = "Jayden";
        String lastName = "Linton";
        String initials = firstName.substring(0, 1) + "." + lastName.substring(0, 1) + ".";
        System.out.println(initials);
    }
}
