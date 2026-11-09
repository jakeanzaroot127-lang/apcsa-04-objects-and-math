public class DocsDetective {
    public static void main(String[] args) {
        String raw = "  hello  ";
        // Look each method up in the Java String API page before you call it.
        String word = "banana";
        String word2 = "classroom";

         System.out.println("This is the raw text" + raw);

        // trim() method returns a string
         System.out.println("This is what trim does " + raw.trim());
       
        // Here we are using trim(), toUpperCase(), and length() at the same time
        System.out.println("This is how we chain trim, toUpperCase, and length " + raw.trim().toUpperCase().length());

        // Here is how we use replace
        System.out.println("This is how we use replace " + word.replace("a", "A"));

        // This is how we use boolean methods
        System.out.println("This is how we use boolean methods " + word2.contains("room") + " " + raw.trim().contains("room") + " " + word.contains("room"));
       
        // This is how we use repeat
        System.out.println("This is what repeat method does " + "ab".repeat(3));

        // System.out.println("This is what repeat method does " + "ab".repeat("ab"));
        // required: int
        // found: String
        // reason: argument mismatch; String cannot be converted to int
        // 1 error
        // error: compilation failed
       
    }
}