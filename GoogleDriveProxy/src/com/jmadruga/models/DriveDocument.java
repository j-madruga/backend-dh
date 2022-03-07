package com.jmadruga.models;

import java.util.List;
import java.util.stream.Collectors;

public class DriveDocument {
    private Integer id;
    private String url;
    private List<User> authorizedUsersList;

    public DriveDocument(Integer id, String url, List<User> authorizedUsersList) {
        this.id = id;
        this.url = url;
        this.authorizedUsersList = authorizedUsersList;
    }

    public Integer getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public List<User> getAuthorizedUsersList() {
        return authorizedUsersList;
    }

    public Boolean isUserAuthorized(String email){
        List<User> authorizedUser = authorizedUsersList.stream()
                .filter(user->user.getEmail().equals(email))
                .collect(Collectors.toList());
        return !authorizedUser.isEmpty();
    }

}
