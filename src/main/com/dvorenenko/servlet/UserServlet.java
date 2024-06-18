package com.dvorenenko.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mistake")
public class UserServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        try {
                String param = request.getParameter("choice");
            if ("approved".equals(param)) {
                request.getRequestDispatcher("/bridge.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/mistake.jsp").forward(request, response);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}