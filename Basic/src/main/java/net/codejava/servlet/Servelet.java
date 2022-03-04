package net.codejava.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servelet
 */
public class Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ItemId = request.getParameter("itemid");
        String ItemName = request.getParameter("itemname");
        String YourName=request.getParameter("yourname");
        String YourEmail=request.getParameter("email");
        String yes=request.getParameter("increment");
        
 
        // do some processing here...
         
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>\r\n"
        		+ "<head>\r\n"
        		+ "<meta charset=\"ISO-8859-1\">\r\n <body style=\"background-color:yellow;\">"
        		+"<style>\r\n"
        		+ "table, th, td {\r\n"
        		+ "  border: 1px solid black;\r\n"
        		+ "  border-collapse: collapse;\r\n"
        		+ "}\r\n"
        		+ "</style>"
        		+ "<title>Insert title here</title>\r\n"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+"<center><h1>Bid Submitted</h1></center>"
        		+ "<center><b>Your bid is active now.If your bid is succesful,you will be notified within 24 hours of the close of bidding.</b><br></center>\r\n"
        		+ "<br><center><table>\r\n"
        		+ "    <tr>\r\n"
        		+ "        <th>ItemId: "+ItemId+"</th>\r\n"
        		
        		+ "       \r\n"
        		+ "       \r\n"
        		+ "    </tr>\r\n"
        		+ "    <tr>\r\n"
        		+ "         <th>Item Name: "+ItemName+"</th>\r\n"
        		+ "    </tr>\r\n"
        		+ "    <tr>\r\n"
        		+ "         <th>Name: "+YourName+"</th>\r\n"
        		+ "    </tr>\r\n"
        		+ "    <tr>\r\n"
        		+ "         <th>Email: "+YourEmail+"</th>\r\n"
        		+ "    </tr>\r\n"
        		+"<tr>\r\n"
        		+ "         <th>Auto Increment: "+yes+"</th>\r\n"
        		+ "    </tr>\r\n"
        		+ "</table> </center>\r\n"
        		+ "</body>\r\n"
        		+ "</html>";
         
        // return response
        writer.println(htmlRespone);// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
