package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("        <body style=\"background-color:#FEA966\">\n");
      out.write("        <div style=\"background-color:rgba(0,0,0,0.5);padding:30px;\">\n");
      out.write("            <div class=\"logo\" style=\"color:#FEA966;\" onclick=\"load(1)\"> SureVac</div>\n");
      out.write("            <div style=\"float:right\" class=\"menu\" id=\"menus\">\n");
      out.write("                <ul>\n");
      out.write("                    <a href=\"index.jsp\"><li class=\"child\"><i  class=\"fa fa-home\"> <b style=\"font-family:Comic Sans MS\">Home</b></i></li></a>\n");
      out.write("                    <a href=\"about.jsp\"><li class=\"active\"><i class=\"fa fa-info-circle\"><b style=\"font-family:Comic Sans MS\"> About Us</b></i></li></a>\n");
      out.write("                    <a href=\"service.jsp\"><li class=\"child\"><i class=\"fa fa-cogs\"><b style=\"font-family:Comic Sans MS\"> Service</b></i></li></a>\n");
      out.write("                    <a href=\"contact.jsp\"><li class=\"child\"><i class=\"fa fa-phone\"><b style=\"font-family:Comic Sans MS\"> Contact Us</b></i></i></li></a>\n");
      out.write("                    <a href=\"login.jsp\"><li class=\"child\"><i class=\"fa fa-user\"><b style=\"font-family:Comic Sans MS\"> Login</b></i></li></</a>\n");
      out.write("                    <a href=\"register.jsp\"><li class=\"child\"><i class=\"fa fa-registered\" style=\"color:red\"><b style=\"font-family:Comic Sans MS\"> Register</b></i></li></a>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"b2\" style=\"background-color:rgba(0,0,0,0.5);float:right;width:400px;height:300px;margin-top:100px;margin-right:200px;float:right;padding:20px;border-style:solid\"><div style=\"margin:-20px;background-color:#FEA966;height: 40px\"><i class=\"fa fa-close\" id=\"close\" style=\"float:right;padding:0px 8px 8px 0px;\"></i></div><br/><p style=\"color:white;text-align:center;font-size:30px;font-family: Cooper;font-weight:bold;\">Admin</p><span style=\"font-size:22px;margin-right:50px;color:#FEA966\">Username</span><input type=\"text\" nmae=\"u1\"  style=\"padding:5px;border:0px;\"/><br/><span style=\"font-size:22px;margin-right:55px;color:#FEA966;\">Password</span><input type=\"password\" name=\"pass\" style=\"padding:5px;margin-top:3p;border:0px;margin-top: 15px\"/><br/><br/><center><button  id=\"s\"   style=\"padding:15px;border:0;font-size:15px;\">Submit</button></center></div>\n");
      out.write("        </div>\n");
      out.write("            <div style=\"background:linear-gradient(rgba(0,0,0,0.5)100%,#fea966 100%);width:25px;height:645px;border-radius:0px 50px 0px 0px\"><br/></div>\n");
      out.write("            <div style=\"margin-left:35px;width:700px;margin-top:-580px;font-size:25px;\"><b>S</b>ure<b>V</b>ac Technologies was started 15 years ago by four college graduates.It manufactures vacuum cleaning technology.It sells its products through a massive network of 30 company-owned stores and 200 franchise outlets.<br/><br/>\n");
      out.write("                SureVac today offers more than 10 products for home users and industry users.It caters to both the segments directly or through it dealer's distribution network.<br/><br/>\n");
      out.write("                The 30 company-owned stored sell vacuum cleaning equipment directly to home and industry users while the 200 franchisees selll vacuum cleaning systems to home users only.The surevac technology products undergoes exports and imports,online shopping to make the users door-to-door delivery everyday.</div>\n");
      out.write("            <img src=\"a.jpeg\" alt=\"technology\" style=\"float:right;margin-top:-400px;margin-right: 100px;width:500px;height:400px;\"/>\n");
      out.write("            <div style=\"background:linear-gradient(rgba(0,0,0,0.5)100%,#fea966 100%);margin-top:176px;width:100%;height:25px;border-radius:0px 50px 0px 0px\"></div>\n");
      out.write("            \n");
      out.write("            <style type=\"text/css\">\n");
      out.write("        body{\n");
      out.write("            width:100%;\n");
      out.write("            margin:0px;\n");
      out.write("            padding:0px;\n");
      out.write("            overflow-x:hidden;\n");
      out.write("            \n");
      out.write("\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .logo{\n");
      out.write("            font-size: 25px;\n");
      out.write("            font-family: Cooper;\n");
      out.write("            cursor:pointer;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .logo:hover{\n");
      out.write("            text-decoration: overline;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        ul li {\n");
      out.write("            list-style-type:none;\n");
      out.write("            display: inline-block;\n");
      out.write("            padding-left: 50px;\n");
      out.write("            height: 10px;\n");
      out.write("            padding: 25px;\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .menu{\n");
      out.write("            margin-top:-64px;\n");
      out.write("            margin-right: -26px;\n");
      out.write("            position: sticky;\n");
      out.write("            top:0;\n");
      out.write("        }\n");
      out.write("        .menu ul  a li{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color:#000000;\n");
      out.write("            font-family: Comic Sans MS;\n");
      out.write("            font-weight:bold;\n");
      out.write("            font-size: 18px;\n");
      out.write("            transition-duration: 0.2s;\n");
      out.write("        }\n");
      out.write("        .menu ul a li:hover{\n");
      out.write("            background-color:rgba(0,0,0,0.2);\n");
      out.write("            cursor:pointer;\n");
      out.write("            color:white;\n");
      out.write("            margin:0px;\n");
      out.write("            transform: rotate(15deg);\n");
      out.write("            box-shadow:2px 2px black;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .menu ul{\n");
      out.write("            background-color:rbga(0,0,0,0.5) ;\n");
      out.write("\n");
      out.write("            height:90px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .sec{\n");
      out.write("            position: absolute;\n");
      out.write("            clip:rect(0px,1600px,600px,0px);\n");
      out.write("            opacity:0.7;\n");
      out.write("        }\n");
      out.write("        a .active{\n");
      out.write("             transform: rotate(15deg);\n");
      out.write("             background-color:#FEA966;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        button{\n");
      out.write("            background-color:#FEA966;\n");
      out.write("        }\n");
      out.write("        button:hover{\n");
      out.write("             background-color:rgba(0,0,0,0.5);\n");
      out.write("             cursor:pointer;\n");
      out.write("             color:white;\n");
      out.write("             font-weight:bold;\n");
      out.write("        }\n");
      out.write("        #b2{\n");
      out.write("            box-shadow: 5px 10px;\n");
      out.write("        }\n");
      out.write("        #close{\n");
      out.write("            color:black;\n");
      out.write("            font-size: 30px;\n");
      out.write("        }\n");
      out.write("        #close:hover{\n");
      out.write("            color:white;\n");
      out.write("        }\n");
      out.write("        input[type=text],input[type=password]{\n");
      out.write("            font-size:16px;\n");
      out.write("            font-weight:bold;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("     <script src=\"js/jquery-3.3.1.js\" ></script>\n");
      out.write("     <Script>\n");
      out.write("         $(\"#b2\").hide();\n");
      out.write("         $(document).ready(function(){\n");
      out.write("     $(\"#close\").click(function(){\n");
      out.write("                 $(\"#b2\").hide();\n");
      out.write("                 $(\"img\").show(1000);\n");
      out.write("                 \n");
      out.write("             });\n");
      out.write("             $(\".logo\").click(function(){\n");
      out.write("                 $(\"#b2\").show();\n");
      out.write("                 $(\"img\").hide();\n");
      out.write("             });\n");
      out.write("         });\n");
      out.write("    var bleep=new Audio();\n");
      out.write("    bleep.src=\"sound.mp3\";\n");
      out.write("    function load(num){\n");
      out.write("    bleep.play();\n");
      out.write("\n");
      out.write("    }\n");
      out.write("     </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
