package security.com.st.security;
public class AES256Example {
  public static void main(String[] args) {
    String originalString = "password";
 
    String encryptedString = AES256Encryption.encrypt(originalString);
    String decryptedString = AES256Decryption.decrypt(encryptedString);
 
    System.out.println(originalString);
    System.out.println(encryptedString);
    System.out.println(decryptedString);
  }
}