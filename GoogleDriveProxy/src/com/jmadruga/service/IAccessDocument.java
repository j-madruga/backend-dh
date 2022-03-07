package com.jmadruga.service;

import com.jmadruga.models.DriveDocument;

import java.util.Optional;

public interface IAccessDocument {
    public String accessDocument(String url, String email);
}
