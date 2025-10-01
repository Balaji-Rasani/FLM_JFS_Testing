public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String rev = "";
		
        // reverse using loop
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + rev);
		System.out.println("Welcome!!");
    }
}

