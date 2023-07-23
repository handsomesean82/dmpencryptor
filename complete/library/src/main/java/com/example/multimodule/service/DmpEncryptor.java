package com.example.multimodule.service;

public interface DmpEncryptor {
    DmpEncryptionType getEncryptorType();
    String encryptSymmetricPlainText(String plaintext);
    String decryptSymmetricCipherText(String ciphertext);
    String encryptAsymmetricPlainText(String plaintext);
    String decryptAsymmetricCipherText(String ciphertext);

}
