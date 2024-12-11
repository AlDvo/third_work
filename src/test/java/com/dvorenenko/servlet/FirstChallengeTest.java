package com.dvorenenko.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import java.io.IOException;


class FirstChallengeTest {

    @ParameterizedTest
    @CsvSource({
            "approved, /bridge.jsp",
            "rejected, /mistake_first.jsp"
    })
    void doPost(String challenge, String path) throws ServletException, IOException {
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        HttpSession session = Mockito.mock(HttpSession.class);
        RequestDispatcher dispatcher = Mockito.mock(RequestDispatcher.class);


        Mockito.when(request.getSession()).thenReturn(session);
        Mockito.when(request.getRemoteAddr()).thenReturn("127.0.0.1");
        Mockito.when(session.getAttribute("loggedInUsername")).thenReturn("testUser");
        Mockito.when(request.getParameter("choice")).thenReturn(challenge);
        Mockito.when(request.getRequestDispatcher(path)).thenReturn(dispatcher);


        FirstChallenge test = new FirstChallenge();
        test.doPost(request, response);

        Assertions.assertTrue(challenge.equals(request.getParameter("choice")));

        Mockito.verify(dispatcher).forward(request, response);

    }
}