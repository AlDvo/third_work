package com.dvorenenko.model;

public final class UserInfo {
    private static UserInfo instance = new UserInfo();

    public static String ipAddress;
    public static String name;
    public static int quantityGame = 0;

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

    public void setName(String variable1) {
        name = variable1;
    }

    public void setIpAddress(String variable2) {
        ipAddress = variable2;
    }

    public void updateQuantityGame() {
        quantityGame++;
    }
}
