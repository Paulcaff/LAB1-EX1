public class CaesarDriver {
    public static void main(String[] args) {

        String plaintext = "Dublin Zoo";
        String ciphertext = "";

        String str = CaesarCipher.encryptCaesarCipher("df r",1);
        System.out.println(str); //EG S

        String str2 = CaesarCipher.encryptCaesarCipher("Dublin Zoo",1);
        System.out.println(str2);//EVCMJO APP

        String str3 = CaesarCipher.decryptCaesarCipher("EVCMJO APP ",1);
        System.out.println(str3);//DUBLIN ZOO

        System.out.println((int)'&');
        System.out.println((int)'A');






    }
}
