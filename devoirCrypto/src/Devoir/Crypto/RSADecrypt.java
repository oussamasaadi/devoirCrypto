package Devoir.Crypto;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

public class RSADecrypt {
    public static void main(String[] args) throws Exception {
        String encodedCryptedMsg="ddwOHYRJR/s06Kl4VBhL77CI75HqWVxE+scXPIluxbkFzxnbf4HpZ18M23rBKfRosMMgF6kb7dTN4IgkWfV1rA==";
        byte[] decodedMSG = CryptoUtil.decodeBase64(encodedCryptedMsg);
        String encodedPrivateKey="MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAqnk3uspGMmcsc3fQdHaFkXiKWX0ec608vF8y7JfwvnamRhPBtV567NN+vcJCSw7VuWXo/1zq3s7EmzyURSV30wIDAQABAkBkpGnNYgutSBILHWo4x5w1dMeg62gl/NmFkGJ9IXqkxmglSKiqv3z4zHVC42m+XJM9RUc3xFrtKlldPzLN03jxAiEA8kH90bSmQFI4m3YD7EyrnNCdQs2NcmH29XQb9vptgUkCIQC0JMrfk/FkFL5FyOgnoGeDL/zHDv2QOx6F6s0B9k9MOwIgCiLEsd9zDUHjaG25oEtc6sS3r7HV9zEuGfrvqJe1uTECIACNcFXZNU9SRPcf055zfn3HguX1ZM+xbrmIa9KKt9mLAiEA6W+qjSxFRsNRraM6m0+Amq1SjzPUE+y1phWMv9i6Fdg=";

        System.out.println(CryptoUtil.decryptRSA(encodedCryptedMsg,encodedPrivateKey));

    }
}
