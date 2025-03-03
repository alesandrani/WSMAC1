package main;

import java.security.*;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class MainCripto {
    // Clave simétrica AES
    private static SecretKey aesKey;
    // Par de claves RSA para criptografía asimétrica
    private static KeyPair rsaKeyPair;
    // Variables para almacenar los datos encriptados
    private static byte[] encryptedAes;
    private static byte[] encryptedRsaConf;
    private static byte[] encryptedRsaAuth;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws NoSuchAlgorithmException {
        // Generar clave AES para encriptación simétrica
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        aesKey = keyGen.generateKey();

        // Generar par de claves RSA para criptografía asimétrica
        KeyPairGenerator rsaGen = KeyPairGenerator.getInstance("RSA");
        rsaGen.initialize(2048);
        rsaKeyPair = rsaGen.generateKeyPair();

        
        menu();
    }

    private static void menu() {
        while (true) {
           
            System.out.println("\nCRIPTOGRAFÍA");
            System.out.println("[1] Encriptar frase (AES)");
            System.out.println("[2] Mostrar frase encriptada (AES)");
            System.out.println("[3] Desencriptar frase (AES)");
            System.out.println("[4] Encriptar frase (Confidencialidad - RSA)");
            System.out.println("[5] Encriptar frase (Autenticidad - RSA)");
            System.out.println("[6] Desencriptar frase confidencial (RSA)");
            System.out.println("[7] Desencriptar frase autenticidad (RSA)");
            System.out.println("[0] Salir");
            String option = scanner.nextLine();

            try {
                switch (option) {
                    case "1": encryptAes(); break;
                    case "2": showEncryptedAes(); break;
                    case "3": decryptAes(); break;
                    case "4": encryptRsaConf(); break;
                    case "5": encryptRsaAuth(); break;
                    case "6": decryptRsaConf(); break;
                    case "7": decryptRsaAuth(); break;
                    case "0": System.out.println("Saliendo..."); return;
                    default: System.out.println("Opción inválida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    // Método para encriptar usando AES (simétrico)
    private static void encryptAes() throws Exception {
        System.out.println("Introduce una frase:");
        String input = scanner.nextLine();
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, aesKey);
        encryptedAes = cipher.doFinal(input.getBytes());
        System.out.println("Frase encriptada (AES): " + Base64.getEncoder().encodeToString(encryptedAes));
    }

    // Método para mostrar la frase encriptada con AES
    private static void showEncryptedAes() {
        if (encryptedAes != null) {
            System.out.println("Frase encriptada (AES): " + Base64.getEncoder().encodeToString(encryptedAes));
        } else {
            System.out.println("No hay frase encriptada.");
        }
    }

    // Método para desencriptar usando AES
    private static void decryptAes() throws Exception {
        if (encryptedAes != null) {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, aesKey);
            String decrypted = new String(cipher.doFinal(encryptedAes));
            System.out.println("Frase desencriptada (AES): " + decrypted);
        } else {
            System.out.println("No hay frase encriptada.");
        }
    }

    // Método para encriptar con RSA (Confidencialidad - clave pública)
    private static void encryptRsaConf() throws Exception {
        System.out.println("Introduce una frase para encriptar con confidencialidad:");
        String input = scanner.nextLine();
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, rsaKeyPair.getPublic());
        encryptedRsaConf = cipher.doFinal(input.getBytes());
        System.out.println("Frase encriptada (Confidencialidad - RSA): " + Base64.getEncoder().encodeToString(encryptedRsaConf));
    }

    // Método para encriptar con RSA (Autenticidad - clave privada)
    private static void encryptRsaAuth() throws Exception {
        System.out.println("Introduce una frase para encriptar con autenticidad:");
        String input = scanner.nextLine();
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, rsaKeyPair.getPrivate());
        encryptedRsaAuth = cipher.doFinal(input.getBytes());
        System.out.println("Frase encriptada (Autenticidad - RSA): " + Base64.getEncoder().encodeToString(encryptedRsaAuth));
    }

    // Método para desencriptar frase confidencial (RSA - clave privada)
    private static void decryptRsaConf() throws Exception {
        if (encryptedRsaConf != null) {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, rsaKeyPair.getPrivate());
            String decrypted = new String(cipher.doFinal(encryptedRsaConf));
            System.out.println("Frase desencriptada (Confidencialidad - RSA): " + decrypted);
        } else {
            System.out.println("No hay frase encriptada.");
        }
    }

    // Método para desencriptar frase autenticada (RSA - clave pública)
    private static void decryptRsaAuth() throws Exception {
        if (encryptedRsaAuth != null) {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, rsaKeyPair.getPublic());
            String decrypted = new String(cipher.doFinal(encryptedRsaAuth));
            System.out.println("Frase desencriptada (Autenticidad - RSA): " + decrypted);
        } else {
            System.out.println("No hay frase encriptada.");
        }
    }
}
