<%-- 
    Document   : welcome1
    Created on : 22 Aug, 2018, 10:35:05 AM
    Author     : Hari Priya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>User</title>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
<style>
	body{
		background:#e0e0e0;
		display:flex;
		justify-content:center;
	}
	section{
		width: 75vw;
		height:auto;
		background: #ffffff;
		box-shadow: 5px 5px 10px #999;
	}
	.head{
		position: relative;
		top:1%;
		margin-left: -2%;
		padding:5%;
		background:rgba(0,0,0,0.5);
		color:white;
		font-size: 1.5em;
		font-weight:bold;
		text-transform: uppercase;
		box-shadow: 1px 1px 2px #333;
                font-family: cooper;
                color:black;
		
	}
	.head:after{
		content: "";
		position: absolute;
		width:0;
		height:0;
		left:0;
		top:100%;
		border-right: 3vh solid rgba(0,0,0,0.5);
		border-bottom: 3vh solid transparent;
		
	}
</style>
</head>
<body>
    <%@page  import="javax.servlet.http.HttpSession;"%>
	<section>
            <span class="s" style="color:#FEA966;background-color:rgba(0,0,0,0.5);padding:7px;margin-top:5px;margin-right:5px; " ><a href="logout">Log out</a></span><br/>
            <p class="head">My Dreams<i class="fa fa-cloud" style="float:right;font-size:2em;"></i></p>
            <p style="float:right;margin-right:20px;text-transform:uppercase;font-weight:bold;color:black;font-family:Comic Sans MS"><span style="color:#FEA966;">Welcome </span> <%
                    try{
                        String name=session.getAttribute("user").toString();
                        out.println(name);
                    }
                    catch(Exception e){
                       System.out.println(e);
                    }
                    
                                
                    %>
            </p>
            <div class="menu">
                <div class="a b"><center>Comment</center></div><div class="a c"><center>View</center></div></div>
            <div style="background-color:gray;margin-top: 0px;font-weight:bold;font-size:23px;font-family:Comic Sans MS" class="com"><i class="fa fa-close" id="c1" style="float:right;padding:10px;"></i><br/><span style="margin-left:10px;">Comment:<form action="commentD" method="post"></span><input type="text" size="3" placeholder="ID:" name="id" style="padding:5px;margin-left:130px;margin-top:10px;"/><br/><br/>
               <textarea rows="10" cols="80" name="comment" style="margin-left:130px;border-radius:10px;font-family:Times New Roman;font-size:20px;"></textarea><br/><center><button style="padding:15px;color:white;border:none;margin-bottom:15px;margin-top:5px;">Submit</button></center></form></div>
              <div style="background-color:gray;margin-top: 0px;font-weight:bold;font-size:23px;font-family:Comic Sans MS" class="view"><i class="fa fa-close" id="c2" style="float:right;padding:10px;"></i><br/><span style="margin-left:10px;">Comment Viewer:<form action="searchCom" method="post"></span><input type="text" size="3" placeholder="ID:" name="id1" style="padding:5px;margin-left:130px;margin-top:10px;"/><br/><br/>
               <div name="comment" style="margin-left:130px;padding:20px;border-radius:10px;font-family:Times New Roman;font-size:20px;background-color:white;width:800px;height:250px;"> 
                      <% try{ 
                          String comm=session.getAttribute("c").toString();
                        out.println(comm);
                        int c=0;
                        if(comm != null){c=1;%>
                        <script>window.alert("admin commented");</script>
                            
                        <% }
                            
                      
                         }
                       
                      catch(Exception e){
                          System.out.println(e);
                      }
                       %></div><br/><center><button style="padding:15px;color:white;border:none;margin-bottom:15px;margin-top:5px;">Submit</button></center></form></div>
                
        </section>
                       <% response.setHeader("Cache-Control","no-csche, no-store, must-revalidate");
     %>
            <style>
                button{
                    background:black;
                    border-radius:7px;
                }
                button:hover{
                    font-weight:bold;
                    background-color:rgba(0,0,0,0.5);
                    border-radius:7px;
                }
                .menu{
                    margin-top: 70px;
                    background:gray;
                }
                .b{
                    border-bottom: 2px solid black;
                }
                .a{
                    padding-top:5px;
                    padding:15px;
                    margin-left:0px;
                    background-color:silver;
                    font-size: 20px;
                    font-family: Comic Sans MS;
                }
                .a:hover{border-bottom: 4px solid black;
                         font-weight:bold;
                         background-color:rgba(0,0,0,0.1);
                         cursor:pointer;
                         
                }
                #c1:hover,#c2:hover{
                    color: white;
                    cursor:pointer;
                }
                textarea{
                    padding:20px;
                }
                .s > a{
                    text-decoration: none;
                    color:white;
                    
                        
                }
                .s{
                    float: right;
                    border-radius:15px;
                    font-weight:bold;
                }
                .s > a:hover{
                    color:#FEA966;
                    font-weight:bold;
                }
                
            </style>
          
    <script src="js/jquery-3.3.1.js" ></script>
    <script>
         $(document).ready(function(){
            
             $(".com").hide();
             $(".view").hide();
             $(".b").click(function(){
                 $(".com").show(1000);
                 $(this).css({
                         "background-color":"gray",
                         "color":"white"

                 });
             });
             $("#c1").click(function(){
                $(".com").hide(1000); 
                    $(".b").css({
                         "background-color":"silver",
                         "color":"black"

                 });
             });
               $(".c").click(function(){
                 $(".view").show(1000);
                 $(this).css({
                         "background-color":"gray",
                         "color":"white"

                 });
             });
             $("#c2").click(function(){
                $(".view").hide(1000); 
                    $(".c").css({
                         "background-color":"silver",
                         "color":"black"

                 });
             });
         });
    </script>
</body>
</html>