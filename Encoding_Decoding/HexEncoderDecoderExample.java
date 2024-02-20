import javax.xml.bind.DatatypeConverter;

public class HexEncoderDecoderExample {
    public static void main(String[] args) {
        byte[] originalBytes = "Hello, world!".getBytes();

        // Encoding
        String encodedHex = DatatypeConverter.printHexBinary(originalBytes);
        System.out.println("Encoded Hex: " + encodedHex);

        // Decoding
        byte[] decodedBytes = DatatypeConverter.parseHexBinary(encodedHex);
        String decodedText = new String(decodedBytes);
        System.out.println("Decoded: " + decodedText);
    }
}
