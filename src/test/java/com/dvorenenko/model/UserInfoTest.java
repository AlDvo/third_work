package com.dvorenenko.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInfoTest {
    UserInfo user = UserInfo.getInstance();

    @Test
    void getInstance() {
        assertNotNull(user);
    }

    @Test
    void getQuantityGame() {
        assertEquals(0, user.getQuantityGame());
    }

    @Test
    void setName() {
        user.setName("test");
        assertEquals("test", user.getName());
    }

    @Test
    void setIpAddress() {
        user.setIpAddress("test");
        assertEquals("test", user.getIpAddress());
    }

    @Test
    void updateQuantityGame() {
        assertEquals(0, user.getQuantityGame());
        user.updateQuantityGame();
        assertEquals(1, user.getQuantityGame());
    }
}