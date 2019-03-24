<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Fest</title>
<link  rel="icon" href="img/fest.png" type="image/x-icon"/>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.link{
color: black;
font-style: italic;
}

.link:hover {
	color: red;
}

.collapsible {
  background-color: #777;
  color: white;
  cursor: pointer;
  padding: 18px;
  width: 100%;
  border: none;
  text-align: left;
  outline: none;
  font-size: 15px;
}

.active, .collapsible:hover {
  background-color: #4CAF50;
}

.content {
  padding: 0 18px;
  display: none;
  overflow: hidden;
  background-color: #333;
}
.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.active {
  background-color: #4CAF50;
  color: white;
}

.topnav .icon {
  display: none;
}

@media screen and (max-width: 600px) {
  .topnav a:not(:first-child) {display: none;}
  .topnav a.icon {
    float: right;
    display: block;
  }
}



@media screen and (max-width: 600px) {
  .topnav.responsive {position: relative;}
  .topnav.responsive .icon {
    position: absolute;
    right: 0;
    top: 0;
  }
  .topnav.responsive a {
    float: none;
    display: block;
    text-align: left;
  }
}


.sel{
 width:415px;
 height:62px;
 font-size: 1.25em;
 font-weight: 350;
 margin-top:18px;
 margin-left:20px;
 padding:10px 8px;
 border-radius:15px;
 border-color:transparent;
 }
 
 .txt{
 background-color:transparent;
 width:400px;
 height:22px;
 padding:10px 8px;
 border-radius:15px;
 border-color:#4CAF50;
 color: #4CAF50;
 font-size: 20px;
 }
 
 .txt:hover{
 border-color: red;
 }
 

.txta{
 background-color:transparent;
 width:1000px;
 height:200px;
 padding:10px 8px;
 border-radius:15px;
 border-color:#4CAF50;
 color: #4CAF50;
 font-size: 18px;
 }

.txta:hover{
 border-color: red;
 }	
 .btn{
 background-color:#333;
 border-radius:5px;
 border-color:#4CAF50;
 background-color:black;
 height:40px;
 width:261px;
 font-style:color="white";
 font-size: 20px;
 color: white;
 }
 
 .btn:hover{
 background-color:#4CAF50;
 }

table {
	width: 50%;
	border-collapse: separate;
	table-layout: fixed;
	
}

/* The Modal (background) */
.modal {

  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  padding-top: 100px; /* Location of the box */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0);  /*Fallback color */
  background-color: rgba(0,0,0,0.4);  /*Black w/ opacity*/ 
 
 }

/* Modal Content */
.modal-content {
  border-radius:5px;
  border-color:#4CAF50; 
  background-color: black;
  margin: auto;
  padding: 20px;
  border: 1px solid #888;
  width: 80%;
}

/* The Close Button */
.close {
  color: #4CAF50;
  float: right;
  font-size: 28px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: red;
  text-decoration: none;
  cursor: pointer;
} 

.cap:hover{
color: red;
}

</style>

</head>

<body bgcolor="black">

<div class="topnav" id="myTopnav">
  <a href="Welcome" >Home</a>
  <a href="manage">Manage</a>
  <a href=#>News</a>
  <a href=#>Contact</a>
  <a href="about" class="active">About us</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
  <i class="fa fa-bars"></i>
  </a>
</div>

<script type="text/javascript" src="https://platform.linkedin.com/badges/js/profile.js" async defer></script>

<br>
<div style="text-align: center; color: white;">
<h1><div class="cap">About_{Developer};</div></h1>
<br>
<br>
</div>
<center><div class="LI-profile-badge"  data-version="v1" data-size="medium" data-locale="en_US" data-type="vertical" data-theme="dark" data-vanity="hv1431"><a class="LI-simple-link" href='https://in.linkedin.com/in/hv1431?trk=profile-badge'>Himanshu vyas</a></div>

<br>
<button id="myBtn" class="btn" title="In case of any queries or suggestion contact me.">Contact me here</button>
</center>


<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">

    <span class="close" title="close the tab.">&times;</span>

<div style="color:#4CAF50;text-align: center;font-size: 30px; "><div class="cap">{Contact_Developer}</div></div>
<br>
<br>


<form method="get" action="com.hbm.mail.SendMessage">

<input type="email" class="txt" name="email" placeholder="Enter your email here" required="required"><br>
<br>
<textarea class="txta" name="msg" title="Enter your message." required  placeholder="Your Message*"></textarea><br>
<br>
<br>
<center><input type="submit" class="btn" value="Send Message" title="send the message to the developer of this application."></center>
</form>  
</div>
</div>


<!-- 
<div style="position:fixed; bottom:0;right:0; color:white;background-color:#333;">
<center><caption>Wanna Subscribe for latest updates</caption></center>
<br><form method="get" action="com.hbm.mail.SaveEmail">
<input type="email" class="txt" name="email" placeholder="Enter your email here" required="required"><input type="submit" class="btn" value="Subscribe">
</form>
</div>	 -->

<script>
function myFunction() {
  var x = document.getElementById("myTopnav");
  if (x.className === "topnav") {
    x.className += " responsive";
  } else {
    x.className = "topnav";
  }
}

var coll = document.getElementsByClassName("collapsible");
var i;

for (i = 0; i < coll.length; i++) {
  coll[i].addEventListener("click", function() {
    this.classList.toggle("active");
    var content = this.nextElementSibling;
    if (content.style.display === "block") {
      content.style.display = "none";
    } else {
      content.style.display = "block";
    }
  });
}


//Get the modal
var modal = document.getElementById('myModal');

// Get the button that opens the modal
var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal 
btn.onclick = function() {
  modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}




</script>

</body>
</html>