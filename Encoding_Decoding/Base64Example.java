import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        String originalText = "Hello, world!";

        // Encoding
        String encodedText = Base64.getEncoder().encodeToString(originalText.getBytes());
        System.out.println("Encoded: " + encodedText);

        // Decoding
        byte[] decodedBytes = Base64.getDecoder().decode(encodedText);
        String decodedText = new String(decodedBytes);
        System.out.println("Decoded: " + decodedText);
    }
}
