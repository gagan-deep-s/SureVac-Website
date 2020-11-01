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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class connect1 extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(connect1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String username=request.getParameter("user");
        String password=request.getParameter("pass");
        String email=request.getParameter("mail");
        String date=request.getParameter("dob");
        int c=0;
        
        try{
Class.forName("org.h2.Driver");

Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test1","sa","");
//here sonoo is the database name, root is the username and root is the password
/*PreparedStatement stmt=con.prepareStatement("insert into signup values(?,?,?,?)");
stmt.setString(1,username);
stmt.setString(2,password);
stmt.setString(3,email);
stmt.setString(4,date);
int i=stmt.executeUpdate();
//out.println(i+"records inserted");
if(i!=0){
    //out.println("you have registered successfully");
    RequestDispatcher dis=getServletContext().getRequestDispatcher("/welcome.jsp");
    dis.include(request,response);
}
*/

HttpSession session = request.getSession();
 session.setAttribute("user",username);
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from signup");
while(rs.next())
//out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+"");
if(username.equals(rs.getString(1)) && password.equals(rs.getString(2)) ){
    c=1;
 }

if(c==1){
    RequestDispatcher dis=getServletContext().getRequestDispatcher("/welcome1.jsp");
    dis.include(request,response);

}
else{
    RequestDispatcher dis=getServletContext().getRequestDispatcher("/invalid.jsp");
    dis.include(request,response);
    
}


con.close();
response.setHeader("Cache-Control","no-csche, no-store, must-revalidate");
     

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
