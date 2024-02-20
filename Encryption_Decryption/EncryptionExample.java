import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncryptionExample {

    public static void main(String[] args) throws Exception {
        // Generate a secret key
        SecretKey secretKey = KeyGenerator.getInstance("AES").generateKey();

        // Create a Cipher object for encryption
        Cipher encryptCipher = Cipher.getInstance("AES");
        encryptCipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // Encrypt a message
        String plaintext = "Hello, world!";
        byte[] encryptedBytes = encryptCipher.doFinal(plaintext.getBytes(StandardCharsets.UTF_8));
        String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);

        System.out.println("Encrypted: " + encryptedText);

        // Create a Cipher object for decryption
        Cipher decryptCipher = Cipher.getInstance("AES");
        decryptCipher.init(Cipher.DECRYPT_MODE, secretKey);

        // Decrypt the message
        byte[] decryptedBytes = decryptCipher.doFinal(Base64.getDecoder().decode(encryptedText));
        String decryptedText = new String(decryptedBytes, StandardCharsets.UTF_8);

        System.out.println("Decrypted: " + decryptedText);
    }
}
