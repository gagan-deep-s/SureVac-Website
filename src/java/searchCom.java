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
public class searchCom extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            //String id=request.getParameter("id1");
            //out.println(id);
        String id=request.getParameter("id1");
        String commentU=null;
        String status="on";
        //out.println(id);
       
        try{
             Class.forName("org.h2.Driver");
            Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test1","sa","");     
            Statement stmt=con.createStatement();
            response.setHeader("Cache-Control","no-csche, no-store, must-revalidate");
            //PreparedStatement stmtt=con.prepareStatement("select * from commentmd  where id = ?");
            
            //stmtt.setString(1,id);
            
            //ResultSet rs=stmt.executeQuery();
            ResultSet rs=stmt.executeQuery("select * from commentmd  where id ='"+ id +"'");
            int c=0;
           while(rs.next()){
               
              
              if(rs.getString(5)!= null) {
                   commentU=rs.getString(5);
                
                HttpSession session = request.getSession();
                session.setAttribute("c",commentU);
                
                
                RequestDispatcher dis=getServletContext().getRequestDispatcher("/welcome1.jsp");
                dis.include(request,response);
                c=1;
               }
              
              
             }
           if(c==0){
                  out.println("<script>window.alert(\"invalid id or admin not viewed\");</script>");
                 
              }
           
        }
           
                   
                   
          
            
            
         
            
        
        catch(Exception e){
                System.out.println(e);
         }
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
