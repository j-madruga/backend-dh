package com.jmadruga.service.impl;

import com.jmadruga.models.Song;
import com.jmadruga.models.User;
import com.jmadruga.service.IDownload;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DownloadService implements IDownload {
    List<Song> playList = new ArrayList<>();

    @Override
    public String download(Song song, User user) {
        List<Song> foundSongList =  playList.stream()
                .filter(playlistSong -> playlistSong.getTitle().equals(song.getTitle()))
                .collect(Collectors.toList());
        if(!foundSongList.isEmpty()){
            return "descarga exitosa";
        }
        return "descarga fallida";
    }

    public void addSong(Song song){
        playList.add(song);
    }

    public List<Song> getPlayList() {
        return playList;
    }
}
