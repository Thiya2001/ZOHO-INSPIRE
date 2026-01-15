package CollectionsFramework;

public class XOREncryptionFile {
    public static void main(String[] args) {
        int key = 5;

        encrypt("original.txt", "encrypted.txt", key);
        decrypt("encrypted.txt", "decrypted.txt", key);
    }
    static void encrypt(String inputFile, String outputFile, int key) {
        try (java.io.FileInputStream fis = new java.io.FileInputStream(inputFile);
             java.io.FileOutputStream fos = new java.io.FileOutputStream(outputFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data ^ key);
            }
            System.out.println("Encryption completed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void decrypt(String inputFile, String outputFile, int key) {
        try (java.io.FileInputStream fis = new java.io.FileInputStream(inputFile);
             java.io.FileOutputStream fos = new java.io.FileOutputStream(outputFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data ^ key);
            }
            System.out.println("Decryption completed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
