<%--
    Document   : main
    Created on : 13 Aug, 2018, 6:18:32 AM
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
                    <a href="index.jsp"><li class="active"><i  class="fa fa-home"> <b style="font-family:Comic Sans MS">Home</b></i></li></a>
                    <a href="about.jsp"><li class="child"><i class="fa fa-info-circle"><b style="font-family:Comic Sans MS"> About Us</b></i></li></a>
                    <a href="service.jsp"><li class="child"><i class="fa fa-cogs"><b style="font-family:Comic Sans MS"> Service</b></i></li></a>
                    <a href="contact.jsp"><li class="child"><i class="fa fa-phone"><b style="font-family:Comic Sans MS"> Contact Us</b></i></i></li></a>
                    <a href="login.jsp"><li class="child"><i class="fa fa-user"><b style="font-family:Comic Sans MS"> Login</b></i></li></</a>
                    <a href="register.jsp"><li class="child"><i class="fa fa-registered" style="color:red"><b style="font-family:Comic Sans MS"> Register</b></i></li></a>
                </ul>
            </div>

        </div>
        <img src="o.jpg" alt="photo" width="100%" class="sec"/>
       <p class="tap" id="t"   onclick="invisible()">Connect the people by SureVac Technology</p>
        

       <div id="b" style="margin-left:200px;font-family: Eras ITC;font-size:30px;margin-top:20px;transform:translate(0,100px);"><hr style="margin-left: 0px;transform:translate(0,100px);margin-top: 0px;border:3px solid #FEA966;width:50%"/><p style="transform:translate(0,80px);font-size: 40px;color:#FEA966;font-weight: bold;width:50%">SureVac</p><hr style="margin-left:0px;transform:translate(0,50px);border:3px solid #FEA966;width:50%"/><p style="transform:translate(0,200px);margin-top:-100px;width:50%;">We are the creative group of<br/> people, create real world Vacuum<br/> Products in latest Technology</p> 
         <div id="b2" style="background-color:rgba(0,0,0,0.5);float:right;width:400px;height:350px;margin-top:-200px;margin-right:70px;padding:20px"><div style="margin:-20px;background-color:#FEA966;height: 40px"><i class="fa fa-close" id="close" style="float:right;padding:0px 8px 8px 0px;"></i></div><br/><p style="color:white;text-align:center;font-weight:bold;font-family: Cooper;">Admin</p>
             <form action="adminV" method="POST"> <span style="font-size:22px;margin-right:50px;color:#FEA966">Username</span><input type="text" placeholder="Enter username...." name="u" style="padding:5px;"/><br/><span style="font-size:22px;margin-right:55px;color:#FEA966;">Password</span><input type="password" placeholder="Enter Password.....!" name="p" style="padding:5px;margin-top:3px;margin-top: 15px"/><br/><br/><center><button  id="s"   style="padding:15px;border:0;font-size:15px;">Submit</button></center></form></div></div>
       <div id="b1" style="background-color:rgb(0,0,0,0.5);height:420px;margin-top:416px"><div class="head" style="background-color:#FEA966;border-radius:0 0 0 40px;height:400px;margin-left:15px;">
               <br/><ol class="trend" style="padding-top:30px;font-size:25px;"><span style="text-decoration: underline;color:rbga(0,0,0,0.5);text-transform: uppercase;margin-left:-20px;">Vacuum Trends</span><li>Upright Vacuum</li><li>Handheld Vacuum</li>
                   <li>Stick Vacuum</li><li>Pet Vacuum</li><li>Robot Vacuum</li></ol>
               <ol class="cleaner" style="padding-top:30px;font-size:25px;"><span style="text-decoration: underline;color:rbga(0,0,0,0.5);text-transform: uppercase;margin-left:-20px;">Vacuum Cleaners</span><li>Handheld Vacuum</li><li>Canister Vacuum</li><li>Autonomus Vacuum</li><li>Bare Floor Vacuum</li><li>Carpeting Vacuum</li></ol>
               <ol class="pump" style="padding-top:30px;font-size:25px;"><span style="text-decoration: underline;color:rbga(0,0,0,0.5);text-transform: uppercase;margin-left:-20px;">Vacuum Pumps</span><li>Rotary vane Pump</li><li>Diaphragm Pump</li><li>Piston Pump</li><li>Scroll Pumps</li><li>Screw Pump</li> </ol>
                      
               <div style="float:right;margin-top:-45px;position:relative;" id="menus"><ul class="u"><li class="l">Trends</li><li class="li">Vacuum cleaner</li><li class="li1">Vacuum Pump</li></ul></div>
               <p class="para" style="width:700px;font-size:25px;margin-left:25px"><b>SureVac</b> today offers more than 10 products for home users and industry users.It caters to both the segments directly or through its dealer's distribution network.<br/><br/>We deliver our products with much more secure and better finishing manner.the products are good enough in design and style with latest trend and technology,we assure our will have long life with warranty for many years.the products are echo-friendly with high quality......!.Everyone in your surrounding buys thousands of products of SureVac.The company that delivers the products and it's new model with feedback of the daily customers.</p>
           </div></div>
      
           <% response.setHeader("Cache-Control","no-csche, no-store, must-revalidate");%>
    </body>
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
        img{
            position:fixed;
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

        .tap{
            color:white;
            font-family:Elephant;
            background-color:rgba(0,0,0,0.7);
            text-align:center;
            font-weight:bold;
            transform:translate(0,250px);
            font-size:2em;
            opacity:100%;
            padding: 10px;
        }
        .tap:hover{
            border-bottom: 6px solid #FEA966;
            cursor:pointer;
            background-color:#5a452a;
        }
        .u{
            
            font-size:28px;
           
            
        }
        .l{
            background-color: rgba(0,0,0,0.5);
            padding:30px;
            border-radius:0px 0px 0px 40px;
            cursor:pointer;
            
        }
        .li,.li1{
            background-color: rgba(0,0,0,0.5);
            padding:30px;
            cursor:pointer;
            
            
        }
        .u .l:hover{
            padding:30px;
            border-radius:0px 0px 0px 40px;
            background-color:rgba(0,0,0,0.7);
        }
        .li1:hover,.li:hover{
            background-color:rgba(0,0,0,0.7);
            color:white;
        }
        ol li{
            color:white;
            line-height: 170%;
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
        }
        #close:hover{
            color:white;
        }
        input[type=text],input[type=password]{
            font-size:16px;
            font-weight:bold;
        }
        
        input:hover:placeholder-shown{
            border:2px solid #FEA966;
            
        }
        
        
    
        

    </style>
   <!-- <script src="https://code.jquery.com/jquery-3.3.1.js"></script>-->
    <script>
     var bleep=new Audio();
    bleep.src="sound.mp3";
    function load(num){
    bleep.play();

    }
    var v2=document.getElementById('b');
    var v3=document.getElementById('b1');
    var v4=document.getElementById('b2');
    v2.style.visibility='hidden';
    v3.style.visibility='hidden';
    v4.style.visibility='hidden';
    function invisible(){
        var v1=document.getElementById('t');
        v1.style.display='none';
        load(2);
        v2.style.visibility='visible';
        v3.style.visibility='visible';
        v4.style.visibility='visible';
        
        
        
    }
    
    </script>
    <script src="js/jquery-3.3.1.js" ></script>
    <script>
        
        $(document).ready(function(){
            
            $("#b2").hide();
            $(".para").show();
            $(".trend").hide();
            $(".cleaner").hide();
            $(".pump").hide();
            $(".l").click(function(){
                $(".trend").show(2000).css({ "background-color":"rgb(0,0,0,0.5)","color":"#FEA966"});
                $(".cleaner").hide(2000);
                $(".pump").hide(2000);
                $(".para").hide();
                $(this).css({"background-color":"rgba(0,0,0,0.7)","color":"#FEA966"});
                $(".li").css({"background-color":"rgba(0,0,0,0.5)","color":"black"});
                $("li1").css({"background-color":"rgba(0,0,0,0.5)","color":"#black"});
                $(".head").css("cursor","pointer");
            });
            $(".li").click(function(){
                $(".trend").hide(2000);
                $(".cleaner").show(2000).css({ "background-color":"rgb(0,0,0,0.5)","color":"#FEA966"});
                $(".pump").hide(2000);
                $(".para").hide();
                $(this).css({"background-color":"rgba(0,0,0,0.7)","color":"#FEA966"});
                $(".l").css({"background-color":"rgba(0,0,0,0.5)","color":"black"});
                $(".li1").css({"background-color":"rgba(0,0,0,0.5)","color":"black"});
                $(".head").css("cursor","pointer");
            });
                  
            $(".li1").click(function(){
               $(".trend").hide(2000);
               $(".cleaner").hide(2000);
               $(".pump").show(2000).css({ "background-color":"rgba(0,0,0,0.5)","color":"#FEA966"});
               $(".para").hide();
               $(this).css({"background-color":"rgba(0,0,0,0.7)","color":"#FEA966"});
               $(".l").css({"background-color":"rgba(0,0,0,0.5)","color":"black"});
               $(".li").css({"background-color":"rgba(0,0,0,0.5)","color":"black"});
               $(".head").css("cursor","pointer");
            });
            $("#close").click(function(){
                 $("#b2").hide(1000);
             });
             $(".logo").click(function(){
                 $("#b2").show(1000);
             });
             
             $(".head").dblclick(function(){
                 $(".trend").hide(1000);
                 $(".cleaner").hide(1000);
                 $(".pump").hide(1000);
                 $(".para").show(1000);
                 $(".head").css("cursor","default");
                 });
                 
                 
            });
                 
        
                 
        
        
    </script>

</html>
