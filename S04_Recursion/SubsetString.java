public class SubsetString {

    // Recursive function to generate subsequences
    static void generateSubsequence(String str, int index, String current) {
        // Base case: if we reach the end of the string
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Choice 1: Exclude the current character
        generateSubsequence(str, index + 1, current);

        // Choice 2: Include the current character
        generateSubsequence(str, index + 1, current + str.charAt(index));
    }

    public static void main(String[] args) {
        String str = "abc"; // Example string
        generateSubsequence(str, 0, "");
    }
}
