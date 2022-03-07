package com.jmadruga.service.impl;

import com.jmadruga.models.Song;
import com.jmadruga.models.User;
import com.jmadruga.service.IDownload;

import java.util.List;
import java.util.stream.Collectors;

public class DownloadServiceProxy implements IDownload {

    DownloadService service;

    public DownloadServiceProxy(DownloadService service) {
        this.service = service;
    }

    @Override
    public String download(Song song, User user) {
        if(isAuthorized(user)){
            return service.download(song, user);
        }
        return "solo usuarios premium pueden descargar";
    }

    public Boolean isAuthorized(User user){
        return user.getSubscription().equals("premium");
    }


}
