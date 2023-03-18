package Devoir.Crypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class AESCrypt {
    public static void main(String[] args) throws Exception {
        String message="Message en claire";
        String secret="3alia_3alia_3ali";//128
         SecretKey secretKey=new SecretKeySpec(secret.getBytes(),0,secret.length(),"AES");
//        KeyGenerator keyGenerator=KeyGenerator.getInstance("AES");
//        keyGenerator.init(128);//128,192,256
//        SecretKey secretKey1 = keyGenerator.generateKey();
        byte[] encodedKey=  secretKey.getEncoded();
        System.out.println(Base64.getEncoder().encodeToString(encodedKey));
        Cipher cipher=Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,secretKey);
        byte[] enrcryptedMsg = cipher.doFinal(message.getBytes());
        String  encodedEnrcryptedMsg= Base64.getEncoder().encodeToString(enrcryptedMsg);
        System.out.println(encodedEnrcryptedMsg);
    }
}


