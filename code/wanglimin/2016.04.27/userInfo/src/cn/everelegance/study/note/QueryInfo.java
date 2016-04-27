package cn.everelegance.study.note;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QueryInfo
 *  
 * @author wlm
 * 
 * @version 1.0.0
 */
public class QueryInfo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		String info = request.getParameter("name");
		String infodata = new String(info.getBytes("ISO-8859-1"), "UTF-8");
		String email = request.getParameter("email");
		
		String data = null;
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\len\\Desktop\\userInfo.txt"), "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			while((data = br.readLine()) != null){
				
				PrintWriter out = response.getWriter();
				
				String name = data.substring(0, data.lastIndexOf(","));
				String emaildata = data.substring(data.lastIndexOf(",")+1, data.lastIndexOf("；"));
				String password = data.substring(data.lastIndexOf("；")+1, data.length()-1);
				
				if(infodata.equals(name) || email.equals(emaildata)){
					out.println( "<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN' 'http://www.w3.org/TR/html4/loose.dtd'>");
					out.println( "<html>");
					out.println( "<head>");
					out.println( "<meta charset='UTF-8'>");
					out.println( "<title>用户信息</title>");
					out.println( "</head>");
					out.println( "<body>");
					out.println( "<center>");
					out.println( "<h4>用户信息<h4>");
					out.println( "<table border='1'>");
					out.println("<tr>" + "<td>"+"姓名" + "</td>" + "<td>" + name + "</td></tr>");
					out.println("<tr>" + "<td>"+"邮箱" + "</td>" + "<td>"  + emaildata +"</td></tr>");
					out.println("</table></center></body></html>");
					break;
				}
			}
			if(data == null){
				response.sendRedirect("errPage.html");
			}
			br.close();
		} catch (Exception e) {
			throw new IOException("读取数据失败！");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
