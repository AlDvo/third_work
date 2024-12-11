package com.dvorenenko.servlet;

import com.dvorenenko.model.UserInfo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/challenge")
public class FirstChallenge extends HttpServlet {

    UserInfo user = UserInfo.getInstance();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        jakarta.servlet.http.HttpSession session = request.getSession();

        String address = request.getRemoteAddr();
        String username = (String) session.getAttribute("loggedInUsername");


        user.setName(username);
        user.setIpAddress(address);

        try {
            String param = request.getParameter("choice");
            if ("approved".equals(param)) {
                request.getRequestDispatcher("/bridge.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/mistake_first.jsp").forward(request, response);
            }
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}