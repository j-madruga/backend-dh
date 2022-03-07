package com.jmadruga.test;

import com.jmadruga.models.DriveDocument;
import com.jmadruga.models.User;
import com.jmadruga.service.impl.GoogleDrive;
import com.jmadruga.service.impl.GoogleDriveProxy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestGoogleDriveProxy {

    @Test
    public void comprobarSiProxyDaAccesoAUsuariosAutorizados(){

        // Dado (Arrange)
        User josu = new User("Josué", "jmadruga@gmail.com");
        User manu = new User("Manu", "mhunter@gmail.com");
        List<User> usuariosAutorizados = new ArrayList<>();
        usuariosAutorizados.add(manu);
        usuariosAutorizados.add(josu);
        DriveDocument document = new DriveDocument(1,"documento1.com", usuariosAutorizados);
        GoogleDriveProxy proxy = new GoogleDriveProxy();
        proxy.addDocument(document);
        // Cuando (Act)
        String msjProxy = proxy.accessDocument(document.getUrl(), josu.getEmail());
        // Entonces (Assert)
        Assertions.assertEquals("acceso autorizado", msjProxy);
        System.out.println(proxy.getDocumentAccessRegister().get(0));
        Assertions.assertEquals(1, proxy.getDocumentAccessRegister().size());

    }
}
