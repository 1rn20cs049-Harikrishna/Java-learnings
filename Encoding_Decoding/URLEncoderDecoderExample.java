import java.net.URLEncoder;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;

public class URLEncoderDecoderExample {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String originalText = "Hello, world!";

        // Encoding
        String encodedText = URLEncoder.encode(originalText, "UTF-8");
        System.out.println("Encoded: " + encodedText);

        // Decoding
        String decodedText = URLDecoder.decode(encodedText, "UTF-8");
        System.out.println("Decoded: " + decodedText);
    }
}
