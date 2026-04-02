public class helloapp {
    public static void main(String[] args) {

        if (args.length > 0) {
            String result = "Hello ";

            // Append each argument with a comma
            for (String name : args) {
                result += name + ", ";
            }

            // Remove the trailing ", " using substring
            result = result.substring(0, result.length() - 2);

            // Print final result
            System.out.println(result);

        } else {
            // Default message
            System.out.println("Hello User");
        }
    }
}