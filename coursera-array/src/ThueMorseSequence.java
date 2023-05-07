public class ThueMorseSequence {
    public static void main(String[] args) {
        // Parse n from the command-line arguments
        int n = Integer.parseInt(args[0]);

        // Initialize the sequence with the base case
        String sequence = "0";

        // Generate the sequence up to length n
        while (sequence.length() < n) {
            // Invert the bits of the current sequence
            char[] inverted = new char[sequence.length()];
            for (int i = 0; i < sequence.length(); i++) {
                char bit = sequence.charAt(i);
                if (bit == '0') {
                    inverted[i] = '1';
                } else {
                    inverted[i] = '0';
                }
            }
            String invertedSequence = new String(inverted);

            // Append the inverted sequence to the original sequence
            sequence += invertedSequence;
        }

        // Print the first n bits of the sequence
        for (int i = 0; i < n; i++) {
            System.out.print(sequence.charAt(i) + " ");
        }
    }
}
