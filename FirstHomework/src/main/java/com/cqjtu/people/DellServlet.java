package com.cqjtu.people;

import com.cqjtu.pojo.FirstHomework;
import com.cqjtu.service.impl.FirstHomeworkService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DellServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FirstHomeworkService service = new FirstHomeworkService();

        if (request.getParameter("cmd").equals("add")){
            String name = request.getParameter("username");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
            double salary = Double.parseDouble(request.getParameter("salary"));
            FirstHomework firstHomework = new FirstHomework(0, name, password, gender, salary);
            service.registerFirstHomework(firstHomework);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
