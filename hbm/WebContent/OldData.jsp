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
 
 .d{
 box-sizing: border-box;
 border-color: #4CAF50;
 
 }
</style>

</head>
<body bgcolor="black">

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

<div style="padding-left:16px; color:white; text-align:center; background-color: black;">
<h1>Fest</h1>
<br>
<br>
<div class="d">
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<form action="com.hbm.update.up" method="get">
<table>
<tr><td><input type="text" name="name" class="txt" title="Your Name." placeholder="New entry" required="required"></td>
<c:forEach items="${requestScope.lst}" var="a">
<td><input type="text" name="Oname" class="txt" value="<c:out value="${a.name}"/>" title="Your Name" readonly="readonly"></td>
</c:forEach>
</tr>

<tr>
<td>
<select class="sel" required name="event" title="Select Event type">
<option>Event Type</option>
<option> Roadies </option>
<option> Dance </option>
<option> Singing </option>
<option> Skeet </option>
<option> Stand up comedy </option>
<option> Fashion walk </option>
<option> Dressup </option>
<option> Mask </option>
<option> Tattoo </option>
<option> Rangoli </option>
<option> Other </option>
</select>
</td>
<td>
<select class="sel" required name="date" title="Select Date">
<option>Date</option>
<option>01</option>
<option>02</option>
<option>03</option>
<option>04</option>
<option>05</option>
<option>06</option>
<option>07</option>
<option>08</option>
<option>09</option>
<option>10</option>
<option>11</option>
<option>12</option>
<option>13</option>
<option>14</option>
<option>15</option>
<option>16</option>
<option>17</option>
<option>18</option>
<option>19</option>
<option>20</option>
<option>21</option>
<option>22</option>
<option>23</option>
<option>24</option>
<option>25</option>
<option>26</option>
<option>27</option>
<option>28</option>
<option>29</option>
<option>30</option>
<option>31</option>
</select>
</td>
</tr>
<tr>
<td>
<select class="sel" required name="month" title="Select Month">
<option>Month</option>
<option>January</option>
<option>Febuary</option>
<option>March</option>
<option>April</option>
<option>May</option>
<option>June</option>
<option>July</option>
<option>August</option>
<option>September</option>
<option>October</option>
<option>November</option>
<option>December</option>
</select>
</td>

<td>
<select class="sel" required name="year" title="Select Year">
<option>Year</option>
<option>2019</option>
</select>
</td>
</tr>

</table>

<br>
<br>

<center><input type="submit" value="Update" class="btn" title="Click here for update selected data."></center>
</form>

</div>
</div>
</body>
</html>