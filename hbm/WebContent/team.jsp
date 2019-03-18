<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Fest</title>
<link  rel="icon" href="img/group.png" type="image/x-icon"/>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.link{
color: black;
font-style: italic;
}

.link:hover {
	color: red;
}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
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
  <a href="Welcome" class="active">Home</a>
  <a href="manage">Manage</a>
  <a href="https://www.google.com/search?q=lnct+indore&source=lnms&tbm=nws&sa=X&ved=0ahUKEwjasrCftazgAhXCs48KHYXkB5gQ_AUIECgD&biw=1366&bih=657" target="new">News</a>
  <a href="http://www.lnctgroup.in/contact-us/" target="new">Contact</a>
  <a href="http://www.lnctgroup.in/about-us/" target="new">About</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
  <i class="fa fa-bars"></i>
  </a>
</div>

<div style="padding-left:16px; color:white; text-align:center;">
<h1>Fest</h1>
</div>

<br>
<br>
<br>
<br>

<button class="collapsible">Save Entry</button>
<div class="content">
<form method="get" action="com.hbm.control.team">
<table>
<tr>
<td><input type="text" name="partner1"  required="required" class="txt" placeholder="Member(Captain)*"  title="Member-1"></td>
<td><input type="text" name="partner2" class="txt" placeholder="Member" title="Member-2"></td>
<td><input type="text" name="partner3" class="txt" placeholder="Member"title="Member-3"></td>
</tr>

<tr>
<td><input type="text" name="partner4" class="txt" placeholder="Member*" title="Member-4"></td>
<td><input type="text" name="partner5" class="txt" placeholder="Member" title="Member-5"></td>
<td><input type="text" name="partner6" class="txt" placeholder="Member"  title="Member-6"></td>
</tr>

<tr>
<td><input type="text" name="partner7" class="txt" placeholder="Member*"  title="Member-7"></td>
<td><input type="text" name="partner8" class="txt" placeholder="Member"  title="Member-8"></td>
<td><input type="text" name="partner9" class="txt" placeholder="Member"  title="Member-9"></td>
</tr>

<tr>
<td><input type="text" name="partner10" class="txt" placeholder="Member*"  title="Member-10"></td>
<td><input type="text" name="partner11" class="txt" placeholder="Member"  title="Member-11"></td>
<td><input type="text" name="partner12" class="txt" placeholder="Member"  title="Member-12"></td>
</tr>

<tr>
<td><input type="text" name="partner13" class="txt" placeholder="Member*"  title="Member-13"></td>
<td><input type="text" name="partner14" class="txt" placeholder="Member"  title="Member-14"></td>
<td><input type="text" name="partner15" class="txt" placeholder="Member" title="Member-15" ></td>
</tr>


<tr>
<td>
<select class="sel" required name="event" title="Select Event type">
<option>Event Type</option>
<option>Cricket</option>
<option>Vollyball</option>
<option>Carrom</option>
<option>Ludo</option>
<option>PUBG</option>
<option>Need for Speed</option>
<option>Counter Strike</option>
<option>Mini Militia</option>
<option> Dance </option>
<option> Singing </option>
<option> Skeet </option>
<option> Nukkad Natak </option>
<option> Dressup </option>
<option> Mask </option>
<option> Rangoli </option>
<option> Other </option>
</select>
</td>
<td><input type="text" name="otherevent" class="txt" placeholder="Other Event Name" title="Enter Other Event Name." ></td>
</tr>

<tr>
<td>
<select class="sel" required name="date">
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
<td>
<select class="sel" required name="month">
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
<select class="sel" required name="year">
<option>Year</option>
<option>2019</option>
</select>
</td>
</tr>

</table>

<br>
<br>
<br>
<input type="submit" value="save" class="btn" title="Save Data">
</form>

</div>


<br>
<br>
<br>

<button class="collapsible">Show Entries</button>
<div class="content">
<a href="com.hbm.display.disTeam" class="link" title="Show the data.">Show the data</a>
    </div>
<br>
<br>
<br>




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