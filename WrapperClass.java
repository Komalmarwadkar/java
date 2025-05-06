public class WrapperClassExample {
    public static void main(String[] args) {
        //Autoboxing
        Integer intWrapper = 10; 
        Double doubleWrapper = 20.5; 
        Character charWrapper = 'A'; 
        // Displaying the wrapper object values
        System.out.println("Integer Wrapper: " + intWrapper);
        System.out.println("Double Wrapper: " + doubleWrapper);
        System.out.println("Character Wrapper: " + charWrapper);

        // Unboxing (Wrapper object to primitive)
        int intValue = intWrapper; 
        double doubleValue = doubleWrapper; 
        char charValue = charWrapper;
        // Displaying the unboxed values
        System.out.println("Unboxed int value: " + intValue);
        System.out.println("Unboxed double value: " + doubleValue);
        System.out.println("Unboxed char value: " + charValue);

        // Using some useful methods of the wrapper class
        String str = "100";
        int parsedInt = Integer.parseInt(str); // Converting string to int
        System.out.println("Parsed integer value: " + parsedInt);
    }
}

