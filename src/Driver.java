public class Driver {

    public static void main(String[] args) {

        String str = Encryption.encrypt("this is a secret message", 4);
        System.out.println(str);

        String str2 = Encryption.encrypt("this is a secret message n", 4);
        System.out.println(str);

        String decrypt = Encryption.decrypt(str,4);
        System.out.println(decrypt);

        String decrypt2 = Encryption.decrypt(str2,4);
        System.out.println(decrypt2);
    }
}
