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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hari Priya
 */
public class contollerVer extends HttpServlet {

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
          response.setHeader("Cache-Control","no-csche, no-store, must-revalidate");
        String user=request.getParameter("tx");
        PrintWriter out = response.getWriter();
        String pass=request.getParameter("ps");
        String email=request.getParameter("mail");
        String date=request.getParameter("d1");
        
        
        
        try{
            Class.forName("org.h2.Driver");
            Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test1","sa","");     
            
            //out.println(view+" "+comm);
            PreparedStatement stmtt=con.prepareStatement("update signup set password = ?,email  = ?,date_of_birth = ? where username = ?");
            
            
     

//stmtt.setInt(1,Id);

//stmtt.setString(2,text1);
//stmtt.setString(2,"on");
stmtt.setString(1,pass);
stmtt.setString(2,email);
stmtt.setString(3,date);
stmtt.setString(4,user);
//stmtt.setString(3,text1);
//out.println(Idd+" "+username+" "+Comment);


int i=stmtt.executeUpdate();
//out.println(i+"records inserted");
if(i!=0){
    //out.println("you have registered successfully");
   out.println("<script>window.alert('Your Comment is Submitted Successfully');</script>");
    RequestDispatcher dis=getServletContext().getRequestDispatcher("/contollerVer");
    dis.include(request,response);
}  
else{
    out.println("<script>window.alert('Your have entered invalid field');</script>");
    RequestDispatcher dis=getServletContext().getRequestDispatcher("/contollerVer");
    dis.include(request,response);
}
response.setHeader("Cache-Control","no-csche, no-store, must-revalidate");

                
       }
       catch(Exception e){
           System.out.println(e);
    }
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
