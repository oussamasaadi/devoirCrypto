package Devoir.Crypto;

import java.security.PrivateKey;
import java.security.Signature;
import java.util.Base64;

public class HmacSign {
    public static void main(String[] args) throws Exception {
        PrivateKey privateKey= CryptoUtil.getPrivateKeyFromKeyStore("mundiapolis.jks","123456","mundiapolis");
        String document="Bonjour tout le monde";
        Signature signature= Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);
        signature.update(document.getBytes());
        byte[] sign= signature.sign();
        String encodedSign= Base64.getEncoder().encodeToString(sign);
        System.out.println(encodedSign);
    }
}
