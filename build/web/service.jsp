<%-- 
    Document   : service.jsp
    Created on : 18 Aug, 2018, 5:38:34 PM
    Author     : Hari Priya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
    </head>
    <body style="background-color:#FEA966">
        <div style="background-color:rgba(0,0,0,0.5);padding:30px;">
            <div class="logo" style="color:#FEA966;" onclick="load(1)"> SureVac</div>
            <div style="float:right" class="menu" id="menus">
                <ul>
                    <a href="index.jsp"><li class="child"><i  class="fa fa-home"> <b style="font-family:Comic Sans MS">Home</b></i></li></a>
                    <a href="about.jsp"><li class="child"><i class="fa fa-info-circle"><b style="font-family:Comic Sans MS"> About Us</b></i></li></a>
                    <a href="service.jsp"><li class="active"><i class="fa fa-cogs"><b style="font-family:Comic Sans MS"> Service</b></i></li></a>
                    <a href="contact.jsp"><li class="child"><i class="fa fa-phone"><b style="font-family:Comic Sans MS"> Contact Us</b></i></i></li></a>
                    <a href="login.jsp"><li class="child"><i class="fa fa-user"><b style="font-family:Comic Sans MS"> Login</b></i></li></</a>
                    <a href="register.jsp"><li class="child"><i class="fa fa-registered" style="color:red"><b style="font-family:Comic Sans MS"> Register</b></i></li></a>
                </ul>
            </div>
            <div id="b2" style="background-color:rgba(0,0,0,0.5);float:right;width:400px;height:300px;margin-top:100px;margin-right:200px;float:right;padding:20px;border-style:solid"><div style="margin:-20px;background-color:#FEA966;height: 40px"><i class="fa fa-close" id="close" style="float:right;padding:0px 8px 8px 0px;"></i></div><br/><p style="color:white;text-align:center;font-size:30px;font-family: Cooper;font-weight:bold;">Admin</p><span style="font-size:22px;margin-right:50px;color:#FEA966">Username</span><input type="text" nmae="u1"  style="padding:5px;border:0px;"/><br/><span style="font-size:22px;margin-right:55px;color:#FEA966;">Password</span><input type="password" name="pass" style="padding:5px;margin-top:3p;border:0px;margin-top: 15px"/><br/><br/><center><button  id="s"   style="padding:15px;border:0;font-size:15px;">Submit</button></center></div>
        </div>
        <div class="s" style="width:300px;height:300px;box-shadow:5px 10px;background-color:rgba(0,0,0,0.5);margin-top:200px;margin-left:150px;border-style:solid;"><div style="border-bottom:solid;font-size: 25px;text-align:center;color:white;font-weight:bold;">Warranty</div><div><i class="fa fa-star" style="font-size:50px;margin-top:100px;margin-left: 50px;color:white;"></i><i class="fa fa-star"  style="font-size:50px;margin-top:100px;margin-left:100px;color:white;"></i><i class="fa fa-star" style="font-size:50px;color:white;margin-top:0px;margin-left:120px;"></i></div></div></div>
    <div class="p" style="width:300px;height:300px;box-shadow:5px 10px;background-color:rgba(0,0,0,0.5);margin-top:-304px;margin-left:600px;border-style:solid;"><div style="border-bottom:solid;font-size: 25px;text-align:center;color:white;font-weight:bold;">Low Pricing</div><i class="fa fa-dollar" style="font-size:50px;margin-top:100px;margin-left:130px;color:white;"></i></div>
    <div class="g" style="width:300px;height:300px;box-shadow:5px 10px;background-color:rgba(0,0,0,0.5);margin-top:-304px;margin-left:1050px;border-style:solid;"><div style="border-bottom:solid;font-size: 25px;text-align:center;color:white;font-weight:bold;">Statistics</div><i class="fa fa-bar-chart" style="color:white;font-size:50px;margin-left:130px;margin-top:100px;"></i></div>


              <style type="text/css">
        body{
            width:100%;
            margin:0px;
            padding:0px;
            overflow-x:hidden;
            

        }
        
        .logo{
            font-size: 25px;
            font-family: Cooper;
            cursor:pointer;

        }
        .logo:hover{
            text-decoration: overline;

        }
        ul li {
            list-style-type:none;
            display: inline-block;
            padding-left: 50px;
            height: 10px;
            padding: 25px;


        }
        .menu{
            margin-top:-64px;
            margin-right: -26px;
            position: sticky;
            top:0;
        }
        .menu ul  a li{
            text-decoration: none;
            color:#000000;
            font-family: Comic Sans MS;
            font-weight:bold;
            font-size: 18px;
            transition-duration: 0.2s;
        }
        .menu ul a li:hover{
            background-color:rgba(0,0,0,0.2);
            cursor:pointer;
            color:white;
            margin:0px;
            transform: rotate(15deg);
            box-shadow:2px 2px black;

        }
        .menu ul{
            background-color:rbga(0,0,0,0.5) ;

            height:90px;
        }

        .sec{
            position: absolute;
            clip:rect(0px,1600px,600px,0px);
            opacity:0.7;
        }
        a .active{
             transform: rotate(15deg);
             background-color:#FEA966;

        }
        button{
            background-color:#FEA966;
        }
        button:hover{
             background-color:rgba(0,0,0,0.5);
             cursor:pointer;
             color:white;
             font-weight:bold;
        }
        #b2{
            box-shadow: 5px 10px;
        }
        #close{
            color:black;
            font-size: 30px;
        }
        #close:hover{
            color:white;
        }
        input[type=text],input[type=password]{
            font-size:16px;
            font-weight:bold;
        }
        .s:hover,.p:hover,.g:hover{
            border-color: white;
           
        }
        #star{
            color:white;
        }
        

    </style>
     <script src="js/jquery-3.3.1.js" ></script>
     <Script>
         $("#b2").hide();
         $(document).ready(function(){
     $("#close").click(function(){
                 $("#b2").hide();
                 $(".s").show();
                 $(".p").show();
                 $(".g").show();
                 
                 
             });
             $(".logo").click(function(){
                 $("#b2").show();
                 $(".s").hide();
                 $(".p").hide();
                 $(".g").hide();
               
             });
         });
    var bleep=new Audio();
    bleep.src="sound.mp3";
    function load(num){
    bleep.play();

    }
   
     </script>
    </body>
</html>
