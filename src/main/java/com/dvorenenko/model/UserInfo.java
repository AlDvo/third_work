package com.dvorenenko.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public final class UserInfo {
    @Getter
    private static UserInfo instance = new UserInfo();

    @Setter
    private String ipAddress;
    @Setter
    private String name;
    private int quantityGame = 0;

    public void updateQuantityGame() {
        quantityGame++;
    }
}
