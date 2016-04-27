package cn.everelegance.study.note;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserInfoServlet
 * 
 * @author wlm
 * 
 * @version 1.0.0
 */
public class UserInfoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		String name = request.getParameter("name");
		String username = new String(name.getBytes("ISO-8859-1"), "UTF-8");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			OutputStreamWriter ois = new OutputStreamWriter(new FileOutputStream("C:\\Users\\len\\Desktop\\userInfo.txt", true), "UTF-8");
			BufferedWriter bw = new BufferedWriter(ois);
			bw.write(username + ",");
			bw.write(email + "；");
			bw.write(password + "。" + "\r\n");
			bw.flush();
			bw.close();
			response.sendRedirect("userInfo.jsp");
		}catch (Exception e) {
			throw new IOException("写入数据失败！");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
