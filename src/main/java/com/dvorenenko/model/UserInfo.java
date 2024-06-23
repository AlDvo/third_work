package com.dvorenenko.model;

public final class UserInfo {
    private static UserInfo instance = new UserInfo();

    private String ipAddress;
    private String name;
    private int quantityGame = 0;

    public static UserInfo getInstance() {
        return instance;
    }

    private UserInfo() {
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getName() {
        return name;
    }

    public int getQuantityGame() {
        return quantityGame;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void updateQuantityGame() {
        quantityGame++;
    }
}
