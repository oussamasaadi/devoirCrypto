package Devoir.Crypto;


import javax.crypto.Cipher;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Base64;

public class CertifcateApp {
    public static void main(String[] args) throws Exception{
        FileInputStream fileInputStream = new FileInputStream("certificate.cert");
        CertificateFactory certificateFactory=CertificateFactory.getInstance("X.509");
        Certificate certificate = certificateFactory.generateCertificate(fileInputStream);
        System.out.println(certificate.toString());
        PublicKey publicKey= certificate.getPublicKey();
        String message="Le message clair";
        Cipher cipher =Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE,publicKey);
        byte[]encryptmsg= cipher.doFinal(message.getBytes());
        System.out.println(Base64.getEncoder().encodeToString(encryptmsg));

        System.out.println("==================================Decrytage===================================");
        FileInputStream fileInputStream1 =new FileInputStream("mundiapolis.jks");
        KeyStore keyStore=KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(fileInputStream1,"123456".toCharArray());
        PrivateKey privateKey=(PrivateKey) keyStore.getKey("mundiapolis","123456".toCharArray());
        Cipher cipher1=Cipher.getInstance("RSA");
        cipher1.init(Cipher.DECRYPT_MODE,privateKey);
        byte[] decryptMsg= cipher1.doFinal(encryptmsg);
        System.out.println(new String(decryptMsg));

    }
}