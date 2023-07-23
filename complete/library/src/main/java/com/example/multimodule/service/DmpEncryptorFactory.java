package com.example.multimodule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;

@Component
public class DmpEncryptorFactory {
    private EnumMap<DmpEncryptionType, DmpEncryptor> dmpEncryptorMap;
    @Autowired
    public DmpEncryptorFactory(List<DmpEncryptor> dmpEncryptors){
        this.dmpEncryptorMap = new EnumMap<>(DmpEncryptionType.class);
        for (DmpEncryptor encryptor: dmpEncryptors){
            this.dmpEncryptorMap.put(encryptor.getEncryptorType(), encryptor);
        }
    }

    public DmpEncryptor getDmpEncryptor(DmpEncryptionType type){
        return this.dmpEncryptorMap.get(type);
    }
}
