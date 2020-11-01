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
public class adComm extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
        out.println("\n" +
"<!doctype html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +

"	<title>Admin</title>\n" +
"        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
"<style>\n" +
"	body{\n" +
"		background:#e0e0e0;\n" +
"		display:flex;\n" +
"		justify-content:center;\n" +
"	}\n" +
"	#sec{\n" +
"		width: 75vw;\n" +
"                height:auto;\n" +
"		background:#ffffff;\n" +
"		box-shadow: 5px 5px 10px #999;\n" +
"	}\n" +
"	.head{\n" +
"		position: relative;\n" +
"		top:1%;\n" +
"		margin-left: -2%;\n" +
"		padding:5%;\n" +
"		background:#FEA966;\n" +
"		color:rgb(0,0,0,0.5);\n" +
"		font-size: 1.5em;\n" +
"		font-weight:bold;\n" +
"		text-transform: uppercase;\n" +
"                font-family: Cooper;\n" +
"		\n" +
"	}\n" +
"	.head:after{\n" +
"		content: \"\";\n" +
"		position: absolute;\n" +
"		width:0;\n" +
"		height:0;\n" +
"		left:0;\n" +
"		top:100%;\n" +
"		border-right: 3vh solid #FEA966;\n" +
"		border-bottom: 3vh solid transparent;\n" +
"	}\n" +
"        .block{\n" +
"            display:grid;\n" +
"            grid-template-columns: repeat(2,1fr);\n" +
"            grid-gap:0.2em;\n" +
"            margin-top:100px;\n" +
"            margin-bottom: 30px;\n" +
"        }\n" +
"        .block > div{\n" +
"            \n" +
"            background:silver;\n" +
"            padding:1em;\n" +
"            margin:5px;\n" +
"        }\n" +
"        .block > div:nth-child(odd){\n" +
"            background:#d2b48c;\n" +
"        }\n" +
"        .block > div{\n" +
"            text-align:center;\n" +
"            font-size:1.7em;\n" +
"            font-weight:bold;\n" +
"            font-family:Cooper;\n" +
"        }\n" +
"        button{\n" +
"            background-color: black;\n" +
"            color:white;\n" +
"        }\n" +
"        button:hover{\n" +
"            background-color:rgba(0,0,0,0.2);\n" +
"            color:#FEA966;\n" +
"        }\n" +
"</style>\n" +
"</head>\n" +
"<body>\n" +
"	<section id=\"sec\">\n" +
                " <span class=\"s\" style=\"color:#FEA966;background-color:rgba(0,0,0,0.5);padding:7px;margin-top:5px;margin-right:5px; \" ><a href=\"logoutad\">Log out</a></span><br/>"+
"            <p class=\"head\">My Dreams <i class=\"fa fa-cloud\" style=\"font-size:2em;float:right;\"></i></p>\n" +
"            <p style=\"float:right;margin-right:20px;text-transform:uppercase;font-weight:bold;color:#FEA966;font-family:Comic Sans MS\"><span style=\"color:black;;\">Welcome</span>");
                 HttpSession session = request.getSession();
                String user=session.getAttribute("u").toString(); 
              
                out.println(user+"</p><br/><br/><br/><form action='CommentVer'><div class='b'><table ><caption >Commentry of MyDreams view from the Users</caption><tr><th>ID</th><th>Username</th><th>CommentView</th>    ");
                
      
         try{
            Class.forName("org.h2.Driver");
            Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test1","sa","");     
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from commentmd ");
            while(rs.next()){
                
                out.println("<tr><td><center>"+rs.getString(1)+"</center></td><td><center>"+rs.getString(2)+"</center></td><td>"+rs.getString(3)+"</td></tr>");
            }
 
            //PreparedStatement stm=con.prepareStatement("insert into signup values(?,?,?,?)");

            //stm.setString("id",);
            //stm.setString(2,password);
            //stm.setString(3,email);
            //stm.setString(4,date); 
            
     
       }
          
       catch(Exception e){
           System.out.println(e);
       }
         response.setHeader("Cache-Control","no-csche, no-store, must-revalidate");
          out.println("</table></form>"
                  + "<div class='com'><form action='CommentVer'><b>Enter ID:</b> <input type='text'placeholder='ID:' name='t2' size=5 style='padding:5px;'/><br/><br/><b>Comments:</b><br/><br/><textarea rows='20' cols='50' name='text2'></textarea><br/><button>Reply</button></form></div>"
                  + "</div></section>"
                + "<style>"
                  + "table{border-color:#;margin-left:20px;margin-bottom:20px;width:500px;}"
                  + ""
                  + "td{ padding:1pc;}"
                  + "th{background-color:gray;border-radius:5px;padding:10px;}"
                  + "caption{background-color:#FEA966;font-weight:bold;padding:10px;font-family:cooper;border-radius:5px 5px 0px 0px;}"
                  + "tr{background-color:silver;}"
                  + ".check{ width:20px;height:20px;cursor:pointer;}"
                  + "textarea{border-radius:5px;}"
                  + "button{padding:15px;border:none;margin-top:10px;margin-bottom:10px;border-radius:5px;}"
                  + "button:hover{background-color:#FEA966;color:white;font-weight:bold;cursor:pointer;}"
                  + "textarea{font-size:15px;}"
                  + "input[type='text']:hover{background-color:#FEA966;color:white;border-radius:5px;}"
                  + "textarea:hover{background-color:#FEA966;color:white;font-size:15px;border-radius:5px;}"
                  + ".b{ display:grid;grid-template-columns:1fr 20% 1fr 20%;grid-gap:5em;}"
                  + ".b > table,.com{ margin:5px;}"
                  + ".b > table{ margin-left:40px;}"
                  + ".s > a{\n" +
"                    text-decoration: none;\n" +
"                    color:white;\n" +
"                    \n" +
"                        \n" +
"                }\n" +
"                .s{\n" +
"                    float: right;\n" +
"                    border-radius:15px;\n" +
"                    font-weight:bold;\n" +
"                }\n" +
"                .s > a:hover{\n" +
"                    color:#FEA966;\n" +
"                    font-weight:bold;\n" +
"                }"
                  + "</style>"
                  + "</body></html>");
                
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
