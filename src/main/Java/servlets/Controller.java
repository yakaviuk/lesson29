package servlets;

import entity.User;
import service.Service;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/controller")
public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user;
        Service service;
        if (req.getParameter("flag").equals("read")) {
            service = new UserService();
            user = service.getUserByIdService(Long.parseLong(req.getParameter("userId")));
            req.getSession().setAttribute("user", user);
            getServletContext().getRequestDispatcher("/jsp/display.jsp").forward(req, resp);
        }
    }
}
