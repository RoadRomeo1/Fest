<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Data Dashboard</title>
<link  rel="icon" href="img/single.png" type="image/x-icon"/>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

table {
	border: 1px solid black;
	outline-color: black;
	table-layout: fixed;
	width: 100%;
	border-collapse: collapse;
    border-color: white;	
}

table th{
	color: white;
    border: 1px solid white;
	
}

table td {
	width: 50%;
	border: 1px solid white;
	padding: 10px;
	text-align: center;
	color: white;
}

table caption {
	font-style: italic;
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
 width:390px;
 height:45px;
 font-size: 1.25em;
 font-weight: 200;
 margin-top:18px;
 margin-left:20px;
 padding:10px 8px;
 border-radius:15px;
 border-color:transparent;
 }

.placeholder{
 font-size: 1.50em;
 font-weight: 300;
 
 }

 .btn{
 background-color:#333;
 border-radius:5px;
 border-color:white;
 background-color:#333;
 font-size:25px;
 height:50px;
 width:190px;
 font-style:color="white";
 }
 
 .btn:hover{
 background-color:#4CAF50;
 }
 
</style>
</head>
<body style="background-color:black;">


<div class="topnav" id="myTopnav">
  <a href="Welcome" >Home</a>
  <a href="manage" class="active">Manage</a>
  <a href="#" target="new">News</a>
  <a href="#" target="new">Contact</a>
  <a href="#" target="new">About</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
  <i class="fa fa-bars"></i>
  </a>
</div>

<div style="padding-left:16px; color:white; text-align:center;">
<h1>Fest</h1>
</div>
<br>
<br>

<center>
<table>
<tr>
<th>Partner-1</th>
<th>Partner-2</th>
<th>Partner-3</th>
<th>Partner-4</th>
<th>Partner-5</th>
<th>Partner-6</th>
<th>Partner-7</th>
<th>Partner-8</th>
<th>Partner-9</th>
<th>Partner-10</th>
<th>Partner-11</th>
<th>Partner-12</th>
<th>Partner-13</th>
<th>Partner-14</th>
<th>Partner-15</th>
<th>Event Name</th>
<th>Date of Event</th>
</tr>
</table>
</center>

<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<center>
<table>
<c:forEach items="${requestScope.record}" var="a">
<tr>
<td><c:out value="${a.partner1}"/></td>
<td><c:out value="${a.partner2}"/></td>
<td><c:out value="${a.partner3}"/></td>
<td><c:out value="${a.partner4}"/></td>
<td><c:out value="${a.partner5}"/></td>
<td><c:out value="${a.partner6}"/></td>
<td><c:out value="${a.partner7}"/></td>
<td><c:out value="${a.partner8}"/></td>
<td><c:out value="${a.partner9}"/></td>
<td><c:out value="${a.partner10}"/></td>
<td><c:out value="${a.partner11}"/></td>
<td><c:out value="${a.partner12}"/></td>
<td><c:out value="${a.partner13}"/></td>
<td><c:out value="${a.partner14}"/></td>
<td><c:out value="${a.partner15}"/></td>
<td><c:out value="${a.eventname}"/></td>
<td><c:out value="${a.date}"/></td>
</tr>
</c:forEach>
</table>
</center>




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

</script>

</body>
</html>