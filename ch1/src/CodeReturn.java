import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CodeReturn extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("application/jar");
		response.setHeader("Content-disposition", "attachment; fileName: miyaav.jar");
		ServletContext ctx = getServletContext();
		
		try
		{
			InputStream is = ctx.getResourceAsStream("/StandaloneTest.jar");
			
			int read = 0;
			byte[]bytes = new byte[4096];
			
			OutputStream os = response.getOutputStream();
			while((read = is.read(bytes)) != -1)
			{
				os.write(bytes, 0, read);
			}
			is.close();
			os.flush();
		}
		catch(Exception e)
		{
			PrintWriter out = response.getWriter();
			out.println(e);
		}
	}
}