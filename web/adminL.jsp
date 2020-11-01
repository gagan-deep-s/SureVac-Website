<%-- 
    Document   : adminL.jsp
    Created on : 26 Aug, 2018, 5:49:26 PM
    Author     : Hari Priya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Admin</title>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
<style>
	body{
		background:#e0e0e0;
		display:flex;
		justify-content:center;
	}
	#sec{
		width: 75vw;
                height:auto;
		background:#ffffff;
		box-shadow: 5px 5px 10px #999;
	}
	.head{
		position: relative;
		top:1%;
		margin-left: -2%;
		padding:5%;
		background:#FEA966;
		color:rgb(0,0,0,0.5);
		font-size: 1.5em;
		font-weight:bold;
		text-transform: uppercase;
                font-family: Cooper;
		
	}
	.head:after{
		content: "";
		position: absolute;
		width:0;
		height:0;
		left:0;
		top:100%;
		border-right: 3vh solid #FEA966;
		border-bottom: 3vh solid transparent;
	}
        .block{
            display:grid;
            grid-template-columns: repeat(2,1fr);
            grid-gap:0.2em;
            margin-top:100px;
            margin-bottom: 30px;
        }
        .block > div{
            
            background:silver;
            padding:1em;
            margin:5px;
        }
        .block > div:nth-child(odd){
            background:#d2b48c;
        }
        .block > div{
            text-align:center;
            font-size:1.7em;
            font-weight:bold;
            font-family:Cooper;
        }
        button{
            background-color: black;
            color:white;
        }
        button:hover{
            background-color:rgba(0,0,0,0.2);
            color:#FEA966;
        }
</style>
</head>
<body>
    <%@page  import="javax.servlet.http.HttpSession;"%>
    <%@page  import="java.io.*"%>
	<section id="sec">
            <p class="head">My Dreams <i class="fa fa-cloud" style="font-size:2em;float:right;"></i></p>
            <p style="float:right;margin-right:20px;text-transform:uppercase;font-weight:bold;color:#FEA966;font-family:Comic Sans MS"><span style="color:black;;">Welcome</span> <%
                    try{
                        String name=session.getAttribute("u").toString();
                        out.println(name);
                    }
                    catch(Exception e){
                       
                    }
                    
                                
                    %>
             </p>
             <section class="block">
                 <div class="control">Admin power <i class="fa fa-fire"></i><a href="controller"><button style="padding: 15px;border:none;width:100%;margin-top:100px;font-size:15px;font-family: Cooper;"><b>Cotroller</b></button></a></i></div>
                 <div>Comment View <i class="fa fa-comment"></i><a href="adComm"><button style="padding: 15px;border:none;width:100%;margin-top:100px;font-size:15px;font-family: Cooper;"><b>View</b></button></a></div>
             </section>
              <%response.setHeader("Cache-Control","no-csche, no-store, must-revalidate");%>
   

        </section>
             
</body>
</html>
