public class DataTypesDemo {
    public static void main(String[] args) {
        
        // Integer types
        byte b = 100;               // 1 byte (-128 to 127)
        short s = 10000;            // 2 bytes
        int i = 100000;             // 4 bytes
        long l = 10000000000L;      // 8 bytes, L at the end is important

        // Floating-point types
        float f = 5.75f;            // 4 bytes, f at the end is important
        double d = 19.99;           // 8 bytes

        // Character type
        char c = 'A';               // 2 bytes, Unicode character

        // Boolean type
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        // String (not a primitive data type, but widely used)
        String message = "Hello, Java!";

        // Print all values
        System.out.println("=== Integer Types ===");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);

        System.out.println("\n=== Floating-point Types ===");
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println("\n=== Character and Boolean ===");
        System.out.println("char: " + c);
        System.out.println("boolean (isJavaFun): " + isJavaFun);
        System.out.println("boolean (isFishTasty): " + isFishTasty);

        System.out.println("\n=== String Example ===");
        System.out.println("String: " + message);
    }
}
