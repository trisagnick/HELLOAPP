class helloapp {
    public static void main(String[] args) {
        System.out.println("Hello");

        // Display all command-line arguments
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}