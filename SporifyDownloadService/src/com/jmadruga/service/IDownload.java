package com.jmadruga.service;

import com.jmadruga.models.Song;
import com.jmadruga.models.User;

public interface IDownload {
    public String download(Song song, User user);
}
