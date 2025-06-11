public class NumberCheck {


    // Function to check the number
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("The number is positive.");
        }  else {
            System.out.println("Invalid number.");
        }
    }

    public static void main(String[] args) {
        int input = 5; // You can change this value
        checkNumber(input); // Call the function
    }
}

