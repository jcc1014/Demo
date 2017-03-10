package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String msg = null;
		String name = (String) request.getParameter("name");
		String password = (String) request.getParameter("password");
		if(!"admin".equals(name)){
			msg = "<script>alert('姓名不对!');location.href='login.jsp';</script>'";
		}else if(!"123".equals(password)){
			msg = "<script>alert('密码不对!');location.href='login.jsp';</script>'";
		}
		else if("admin".equals(name)&&"123".equals(password)){
			msg = "<script>alert('登陆成功');location.href='success.jsp';</script>'";
		}
		PrintWriter out = null;
		out = response.getWriter();
		out.print(msg);
		out.flush();
		
	}

}
