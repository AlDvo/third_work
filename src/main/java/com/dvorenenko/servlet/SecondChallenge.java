package com.dvorenenko.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/bridge")
public class SecondChallenge extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        try {
            String param = request.getParameter("choice");
            if ("approved".equals(param)) {
                request.getRequestDispatcher("/climb_bridge.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/mistake_second.jsp").forward(request, response);
            }
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
