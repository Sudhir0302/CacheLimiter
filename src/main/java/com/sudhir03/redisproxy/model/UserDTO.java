package com.sudhir03.redisproxy.model;

public class UserDTO {
    private User user;
    private String responsetime;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserDTO(String responsetime, User user) {
        this.responsetime = responsetime;
        this.user = user;
    }

    public String getResponsetime() {
        return responsetime;
    }

    public void setResponsetime(String responsetime) {
        this.responsetime = responsetime;
    }
}
