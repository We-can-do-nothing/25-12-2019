package com.zr.ems.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class delServlet
 */
public class delServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL="jdbc:mysql://localhost:3306/mv2";
    private static final String USERNAME="root";
    private static final String PASSWORD="123";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection connection = null;
        Statement stmt = null;
        boolean flag=false;
     
            //加载驱动
            try {
				Class.forName("com.mysql.jdbc.Driver");
			
            
            
            //连接数据库
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //创建语句对象
            stmt = connection.createStatement();
            //执行sql
            String id = request.getParameter("ID");
			String sql = "delete from sp where id=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// 给占位符赋值
			prepareStatement.setString(1, id);
			

			// 执行 增, 删, 改, 都是使用executeUpdate()方法
			prepareStatement.executeUpdate();
			response.getWriter().write("删除成功！");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
