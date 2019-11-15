package servletsOld;

import entity.User;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/Controller")
public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("jsp/getinfo.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User userEntity = new UserService().getUserByIdService(Long.parseLong(req.getParameter("userId")));

        if (userEntity != null) {
            req.getSession().setAttribute("userEntity", userEntity);
            RequestDispatcher rd = req.getRequestDispatcher("jsp/resultSession.jsp");
            rd.forward(req, resp);
        } else if (userEntity == null) {
            Long userId = Long.parseLong(req.getParameter("userId"));
            req.getSession().setAttribute("userId", userId);
            RequestDispatcher rd = req.getRequestDispatcher("jsp/userNotFound.jsp");
            rd.forward(req, resp);
        }


    }
}
