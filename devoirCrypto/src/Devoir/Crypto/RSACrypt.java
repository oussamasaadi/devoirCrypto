package Devoir.Crypto;


import javax.crypto.Cipher;
import java.security.*;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;

public class RSACrypt {
    public static void main(String[] args) throws Exception {
        String encodedPK="MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKRma8clYGfRQO/n99EfnKrYKx5XzP9Qmib+hBU7h7MtI2ep3pp4x8nr1SkgcwX+neb5tsnOVI1Kiv8676DKoqkCAwEAAQ==";
        String message="Le message en clair";

        System.out.println(CryptoUtil.cryptRSA(message,encodedPK));
    }
}
