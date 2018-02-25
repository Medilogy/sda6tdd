package com.sda.post;

public class PostOffice {

    private SenderService sendService;

    private UserStorage userStorage;

    public PostOffice() {
    }

    public PostOffice(SenderService sendService, UserStorage userStorage) {
        this.sendService = sendService;
        this.userStorage = userStorage;
    }

    public boolean createNewUser(String nickname) {
        return userStorage.createNewUser(nickname);
    }

    public SenderService getSendService() {
        return sendService;
    }

    public void setSendService(SenderService sendService) {
        this.sendService = sendService;
    }

    public UserStorage getUserStorage() {
        return userStorage;
    }

    public void setUserStorage(UserStorage userStorage) {
        this.userStorage = userStorage;
    }
}
