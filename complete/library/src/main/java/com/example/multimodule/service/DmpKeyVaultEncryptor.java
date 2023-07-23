package com.example.multimodule.service;

import org.springframework.stereotype.Component;

@Component
public class DmpKeyVaultEncryptor implements DmpEncryptor{
    @Override
    public DmpEncryptionType getEncryptorType() {
        return DmpEncryptionType.KEY_VAULT;
    }

    @Override
    public String encryptSymmetricPlainText(String plaintext) {
        return null;
    }

    @Override
    public String decryptSymmetricCipherText(String ciphertext) {
        return null;
    }

    @Override
    public String encryptAsymmetricPlainText(String plaintext) {
        return null;
    }

    @Override
    public String decryptAsymmetricCipherText(String ciphertext) {
        return null;
    }
}
