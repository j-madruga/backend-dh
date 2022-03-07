package com.jmadruga.service.impl;

import com.jmadruga.models.DriveDocument;
import com.jmadruga.models.User;
import com.jmadruga.service.IAccessDocument;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GoogleDriveProxy implements IAccessDocument {

    private GoogleDrive googleDrive = new GoogleDrive();

    private List<String> documentAccessRegister = new ArrayList<>();

    @Override
    public String accessDocument(String url, String email) {
        List<DriveDocument> foundDocumentList = googleDrive.findDocument(url);
        DriveDocument foundDocument = foundDocumentList.get(0);
        Boolean authorization = foundDocument.isUserAuthorized(email);
        if(!foundDocumentList.isEmpty() && authorization) {
            documentAccessRegister.add("documento con id "+foundDocument.getId()
                    + " fue accedido por usuario con email " + email);
            return "acceso autorizado";
        }
        return "acceso denegado";
    }

    public void addDocument(DriveDocument document){
        googleDrive.addDocument(document);
    }

    public List<String> getDocumentAccessRegister() {
        return documentAccessRegister;
    }
}
