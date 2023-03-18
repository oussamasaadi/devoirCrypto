package Devoir.Crypto;



import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class RSATest {
    public static void main(String[] args) throws Exception {
        String document="Bonjour";
        String secret="123456";
        SecretKeySpec secretKeySpec=new SecretKeySpec(secret.getBytes(),"HmacSHA256");
        Mac mac=Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        byte[] signature = mac.doFinal(document.getBytes());
        System.out.println("+++++++++++++++++++++++ignature +++++++++++++++++++++++++++++");
        System.out.println(Base64.getEncoder().encodeToString(signature));
    }
}