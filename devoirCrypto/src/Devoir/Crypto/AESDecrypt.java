package Devoir.Crypto;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class AESDecrypt {
    public static void main(String[] args) throws Exception {
        String encodedMessage = "XyIul+ThUmNSdhvHDsdpoR84MQ4W5drNXER7D4iO7LQ=";
        String secret = "3alia_3alia_3ali";//128
        SecretKey secretKey = new SecretKeySpec(secret.getBytes(), 0, secret.length(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decodedMessage = Base64.getDecoder().decode(encodedMessage.getBytes());
        byte[] decryptedMessage = cipher.doFinal(decodedMessage);
        String originalMessage = new String(decryptedMessage);
        System.out.println(originalMessage);
    }
}