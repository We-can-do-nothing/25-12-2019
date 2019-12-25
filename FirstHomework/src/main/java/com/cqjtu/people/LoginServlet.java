package com.cqjtu.people;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cqjtu.Utils.connectionPool;
import com.cqjtu.Utils.connectionPoolUtils;
import com.cqjtu.pojo.FirstHomework;
import com.cqjtu.service.impl.FirstHomeworkService;

/**
 * 处理登陆
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String name = request.getParameter("username");
        String password = request.getParameter("password");

        FirstHomeworkService service = new FirstHomeworkService();

        FirstHomework firstHomework = service.findFirstHomeworkByNameAndPassword(name, password);

        if (firstHomework!=null){
            response.getWriter().write("<h1>登陆成功</h1>");
            response.setHeader("refresh", "3; URL=home.jsp");
        }
        else {
            response.getWriter().write("<h1>密码或用户名错误</h1>");
            response.setHeader("refresh", "3; URL=index.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
