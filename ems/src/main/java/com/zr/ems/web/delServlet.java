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
     
            //��������
            try {
				Class.forName("com.mysql.jdbc.Driver");
			
            
            
            //�������ݿ�
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //����������
            stmt = connection.createStatement();
            //ִ��sql
            String id = request.getParameter("ID");
			String sql = "delete from sp where id=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// ��ռλ����ֵ
			prepareStatement.setString(1, id);
			

			// ִ�� ��, ɾ, ��, ����ʹ��executeUpdate()����
			prepareStatement.executeUpdate();
			response.getWriter().write("ɾ���ɹ���");
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
