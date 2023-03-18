package Devoir.Crypto;


import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class GenrerateRSAKeys {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGenerator= KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(512);
        KeyPair keyPair=keyPairGenerator.generateKeyPair();

//        KeyPair keyPair = CryptoUtil.genereateKeyPair();
        //generate the private key
        PrivateKey privateKey= keyPair.getPrivate();
        String encodedPrivateKey= CryptoUtil.encodeBase64(privateKey.getEncoded());
        System.out.println("*** private key ****");
        System.out.println(encodedPrivateKey);
        //generate the public key
        PublicKey publicKey=keyPair.getPublic();
        String encodedPublicKey=CryptoUtil.encodeBase64(publicKey.getEncoded());
        System.out.println("*** public key ****");
        System.out.println(encodedPublicKey);

    }
}
