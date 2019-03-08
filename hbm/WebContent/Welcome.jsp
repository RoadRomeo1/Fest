<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Fest</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/menubar.css">
<link rel="stylesheet" href="css/collapsible.css">
<style>

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.footer{

position: fixed;
left: 0;
bottom: 0;
width: 100%;
background-color:  #4CAF50;
color: white;
text-align: center;
}

table {
	width: 50%;
	border-collapse: separate;
	table-layout: fixed;
	
}

.link{
color: black;
font-style: italic;
}

.link:hover {
	color: red;
}

 .txt{
 width:200px;
 height:10px;
 margin-top:18px;
 margin-left:20px;
 padding:10px 8px;
 border-radius:15px;
 border-color:transparent;
 }

 .btn{
 background-color:#333;
 border-radius:5px;
 border-color:white;
 background-color:#333;
 height:30px;
 width:90px;
 font-style:color="white";
 }
 
 .btn:hover{
 background-color:#4CAF50;
 }


</style>
</head>

<body bgcolor="black">

<div class="topnav" id="myTopnav">
  <a href="#home" class="active">Home</a>
  <a href="manage">Manage</a>
  <a href="https://www.google.com/search?q=lnct+indore&source=lnms&tbm=nws&sa=X&ved=0ahUKEwjasrCftazgAhXCs48KHYXkB5gQ_AUIECgD&biw=1366&bih=657" target="new">News</a>
  <a href="http://www.lnctgroup.in/contact-us/" target="new">Contact</a>
  <a href="http://www.lnctgroup.in/about-us/" target="new">About</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
  <i class="fa fa-bars"></i>
  </a>
</div>



<div style="padding-left:16px;text-align: center; color: white;">
  <h1>Fest</h1>
</div>

<br>

<!-- Games  -->
<button class="collapsible">Games</button>

<!-- outdoor games -->
<div class="content">
<button class="collapsible">Outdoor Games</button>
<div class="content">
<table>
<tr>
<td>
<a class="link" href="team">Cricket</a>
</td>
<td>
<a class="link"  href="double">Badminton</a>
</td>
<td>
<a class="link"  href="team">Vollyball</a>
</td>
<td>
<a class="link"  href="single">Roadies</a>
</td>
</tr>
</table>
</div>

<!-- Indoor games -->
<button class="collapsible">Indoor Games</button>
<div class="content">
<table>
<tr>
<td>
<a class="link" href="double">Chess</a>
</td>
<td>
<a class="link"  href="team">Carrom</a>
</td>
<td>
<a class="link"  href="double">Table-Tennis</a>
</td>
<td>
<a class="link"  href="team">Ludo</a>
</td>
</tr>
</table>
</div>

<!-- Video games -->
<button class="collapsible">Video Games(MultiPlayer)</button>
<div class="content">
<table>
<tr>
<td>
<a class="link" href="team">PUBG</a>
</td>
<td>
<a class="link"  href="team">Mini Militia</a>
</td>
<td>
<a class="link"  href="team">Need For Speed</a>
</td>
<td>
<a class="link"  href="team">Counter Strike</a>
</td>
</tr>
</table>
</div>
</div>



<br>
<br>



<!-- Cultural Activities -->
<button class="collapsible">Cultural Activities</button>
<div class="content">
<!--Dance -->
<button class="collapsible">Dance</button>
<div class="content">
<table>
<tr>
<td>
<a class="link" href="team">Group Dance</a>
</td>
<td>
<a class="link"  href="double">Couple Dance</a>
</td>
<td>
<a class="link"  href="single">Solo Dance</a>
</td>
</tr>
</table>
</div>

<!-- Singing -->
<button class="collapsible">Singing</button>
<div class="content">
<table>
<tr>
<td>
<a class="link" href="team">Group Singing</a>
</td>
<td>
<a class="link"  href="double">Duet Singing</a>
</td>
<td>
<a class="link"  href="single">Solo Singing</a>
</td>
</tr>
</table>
</div>

<!-- Skeet -->
<button class="collapsible">Skeet</button>
<div class="content">
<table>
<tr>
<td>
<a class="link" href="team">Group Skeet</a>
</td>
<td>
<a class="link"  href="single">Stand Up Comedy</a>
</td>
<td>
<a class="link"  href="single">Solo Act</a>
</td>
<td>
<a class="link"  href="team">Nukkad Natak</a>
</td>
</tr>
</table>
</div>

<!--Fashion Show-->
<button class="collapsible">Fashion Show</button>
<div class="content">
<table>
<tr>
<td>
<a class="link" href="double">Couple Walk</a>
</td>
<td>
<a class="link"  href="single">Solo Walk</a>
</td>
<td>
<a class="link"  href="single">Ramp Walk</a>
</td>
</tr>
</table>
</div>

<!-- Dressup -->
<button class="collapsible">Dressup</button>
<div class="content">
<table>
<tr>
<td>
<a class="link"  href="single">Solo Dressup</a>
</td>
<td>
<a class="link"  href="double">Couple Dressup</a>
</td>
<td>
<a class="link"  href="team">Group Dressup</a>
</td>
</tr>
</table>
</div>



<!-- Mask Battle -->
<button class="collapsible">Mask Battle</button>
<div class="content">
<table>
<tr>
<td>
<a class="link"  href="single">Solo Mask battle</a>
</td>
<td>
<a class="link"  href="double">Couple Mask battle</a>
</td>
<td>
<a class="link"  href="team">Group Mask battle</a>
</td>
</tr>
</table>
</div>


<!-- Tattoo League -->
<button class="collapsible">Tattoo League</button>
<div class="content">
<table>
<tr>
<td>
<a class="link"  href="single">Solo Tattoo League</a>
</td>
<td>
<a class="link"  href="double">Couple Tattoo League</a>
</td>

</tr>
</table>
</div>


<!-- Rangoli Competition -->
<button class="collapsible">Rangoli Competition</button>
<div class="content">
<table>
<tr>
<td>
<a class="link"  href="single">Solo Rangoli</a>
</td>
<td>
<a class="link"  href="team">Group Rangoli</a>
</td>
</tr>
</table>
</div>
</div>


<div style="position:fixed; bottom:0;right:0; color:white;background-color:#333;">
<center><caption>Wanna Subscribe for latest updates</caption></center><br>
<form method="get" action="com.hbm.mail.SaveEmail">
<input type="email" class="txt" name="email" placeholder="Enter your email here" required="required">&nbsp<input type="submit" class="btn" value="Subscribe">
</form>
</div>	


<script type="text/javascript" src="js/collapsible.js"></script>
<script type="text/javascript" src="js/menubar.js"></script>

</body>
</html>
