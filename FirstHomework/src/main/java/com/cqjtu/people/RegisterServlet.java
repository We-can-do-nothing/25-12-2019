package com.cqjtu.people;

import com.cqjtu.Utils.connectionPool;
import com.cqjtu.Utils.connectionPoolUtils;
import com.cqjtu.pojo.FirstHomework;
import com.cqjtu.service.impl.FirstHomeworkService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String name = request.getParameter("username");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        double salary = Double.parseDouble(request.getParameter("salary"));

        FirstHomeworkService service = new FirstHomeworkService();

        boolean flag = service.findFirstHomeworkByName(name);

        if (flag == true){
            response.getWriter().println("该昵称已存在，请更换昵称");
            response.setHeader("refresh", "3; register.jsp");
        }else {
            FirstHomework firstHomework = new FirstHomework(0, name, password, gender, salary);
            service.registerFirstHomework(firstHomework);
            response.getWriter().println("注册成功");
            response.setHeader("refresh", "3; index.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
