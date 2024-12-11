package com.dvorenenko.servlet;

import com.dvorenenko.model.UserInfo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/climb_challenge")
public class ThirdChallenge extends HttpServlet {

    UserInfo user = UserInfo.getInstance();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        jakarta.servlet.http.HttpSession session = request.getSession();
        String username = (String) session.getAttribute("loggedInUsername");
        user.setName(username);

        try {
            String param = request.getParameter("choice");
            if ("approved".equals(param)) {
                request.getRequestDispatcher("/finish.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/mistake_third.jsp").forward(request, response);
            }
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
