/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hari Priya
 */
public class commentD extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
      
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setHeader("Cache-Control","no-csche, no-store, must-revalidate");
         PrintWriter out=response.getWriter();
          String Comment=request.getParameter("comment");
            //int Idd=Integer.parseInt(request.getParameter("id"));
            String Idd=request.getParameter("id");
            HttpSession session=request.getSession();
           String username=session.getAttribute("user").toString();
        int count=0;
            try{
            Class.forName("org.h2.Driver");
            Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test1","sa","");
//here sonoo is the database name, root is the username and root is the password
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from commentmd");
while(rs.next())
//out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+"");
if(Idd.equals(rs.getString(1)) ){
    count=1;
    
 }

if(count==1){
    out.println("<script>"
            + "window.alert('This Id is already in use');"
            + "</script>");
    RequestDispatcher dis=getServletContext().getRequestDispatcher("/welcome1.jsp");
    dis.include(request,response);
}  
PreparedStatement stmtt=con.prepareStatement("insert into commentmd values(?,?,?,?,?)");
      
   
stmtt.setString(1,Idd);
stmtt.setString(2,username);
stmtt.setString(3,Comment);
stmtt.setString(4,"off");
stmtt.setString(5,"");
//out.println(Idd+" "+username+" "+Comment);


int i=stmtt.executeUpdate();
//out.println(i+"records inserted");
if(i!=0){
    //out.println("you have registered successfully");
   out.println("<script>window.alert('Your Comment is Submitted Successfully');</script>");
    RequestDispatcher dis=getServletContext().getRequestDispatcher("/welcome1.jsp");
    dis.include(request,response);
}  
/*Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from stud");
while(rs.next())
out.println(rs.getInt(1)+"  "+rs.getString(2));

*/
con.close();

}
catch(Exception e){ System.out.println(e);}
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
