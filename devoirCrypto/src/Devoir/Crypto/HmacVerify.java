package Devoir.Crypto;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class HmacVerify {
    public static void main(String[] args) throws Exception {
        String recievedDoc = "Bonjour tout le monde"+"-__-"+"sVOxAFjUqMtAoVhVnUSX4BaotIo1apIEv5g9EXHuKOFIUZr6DmSlj6bc2gOB2jdhfjPVsiQZY85qrmGfRtqdpvBIn1QAyQAIYySSGT7XrmhqlFmohJ8YsFInnw44+/Vau4SmFV1iAyeN1UC5fCnDGgTS9Gs/LBh3NeUe+alC08JFXeGpC4ZcUSOIAGW2AkEhA+nZ5M4/h2k5yb5jSzax/44nPLFh0xTdZRA9eu3ERkm9TXHl0fDjyBDcTM8GvNFT8tjK9IFeXZ7GcwBom7DDuqlRM3INfyhCd8SSvaRBuGsOt9PJJXnRs2mIuHmzEO6N31PifrpWV16DM8uX+cYpxw==";
        String[] splitedDoc = recievedDoc.split("-__-");
        String receivedSignature=splitedDoc[1];
        String document=splitedDoc[0];
        String secret1 = "123456";
        SecretKeySpec secretKeySpec1=new SecretKeySpec(secret1.getBytes(),"HmacSHA256");
        Mac mac1 =Mac.getInstance("HmacSHA256");
        mac1.init(secretKeySpec1);
        byte[] signature1= mac1.doFinal(document.getBytes());
        String calculatedSignature= Base64.getEncoder().encodeToString(signature1);
        System.out.println(receivedSignature.equals(calculatedSignature)?"Signature OK":"Signature non OK");
    }
}
