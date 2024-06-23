package com.dvorenenko.servlet;

import com.dvorenenko.model.UserInfo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/restart")
public class Restart extends HttpServlet {

    UserInfo user = UserInfo.getInstance();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        jakarta.servlet.http.HttpSession session = request.getSession();
        String username = (String) session.getAttribute("loggedInUsername");
        user.setName(username);

        user.updateQuantityGame();
        try {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}