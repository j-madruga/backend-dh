package com.jmadruga.test;

import com.jmadruga.models.Song;
import com.jmadruga.models.User;
import com.jmadruga.service.IDownload;
import com.jmadruga.service.impl.DownloadService;
import com.jmadruga.service.impl.DownloadServiceProxy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDownloadServiceProxy {
    @Test
    public void proxyAllowsDownloadToPremiumUser(){
        // Dado (Arrange)
        Song duaLipaSong = new Song("Levitating");
        DownloadService service = new DownloadService();
        service.addSong(duaLipaSong);
        IDownload proxy = new DownloadServiceProxy(service);
        User userPremium = new User(1, "premium");
        // Cuando
        String downloadMsj = proxy.download(duaLipaSong, userPremium);
        // Entonces
        Assertions.assertEquals("descarga exitosa", downloadMsj);
    }



}
