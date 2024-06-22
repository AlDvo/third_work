package com.dvorenenko.servlet;

import com.dvorenenko.model.UserInfo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/index")
public class Start extends HttpServlet {

    UserInfo user = UserInfo.getInstance();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        String username = request.getParameter("name");
        String address = request.getRemoteAddr();

        user.setName(username);
        user.setIpAddress(address);

        try {
                request.getRequestDispatcher("/challenge.jsp").forward(request, response);

        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}