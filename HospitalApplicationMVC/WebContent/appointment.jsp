<!DOCTYPE html>
<html>
<body bgcolor="#B18904">
<br><br>
<center><h1>Welcome to Appointment Page</h1>
<br><br>
<a href="./patient_home.html">HOME</a> <br><br><br> 
<a href="./patient_profile.jsp">PROFILE</a> <br><br><br> 
<a href="./appointment.jsp">APPOINTMENT</a> <br><br><br> 
<a href="appointment_status.jsp">APPOITMENT STATUS</a> <br><br><br> 
<a href="./index.html">LOGOUT</a>
</center>
<br><br>
<form action="./apply_appointment" method="post" align="center">
NAME :<input type="text" name="pname" placeholder="Enter patient name "><br><br><br> 
MOBILE NUMBER :<input type="number" name="phone" placeholder="Enter phone number"><br><br><br> 
EMAIL :<input type="email"  name="email" placeholder="Enter emial"><br><br><br> 
GENDER :<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
BLOOD GROUP :<select name="blood_group"><br><br><br> 
<option value="A+">A+</option>
<option value="A-">A-</option>
<option value="B+">B+</option>
<option value="B-">B-</option>
<option value="AB+">AB+</option>
<option value="AB-">AB-</option>
<option value="O+">O+</option>
<option value="O-">O-</option>
</select>
SPECIALIZATION :<select name="specialist"><br><br><br> 
<option value="Dentist">Dentist</option>
<option value="Cardio">Cardio</option>
<option value="ENT">ENT</option>
</select>
DATE OF APPOINTMENT :<input type="date" name="date_of_appointment" placeholder="select date for appointment">
TIME OF APPOINTMENT :<input type="time" name="time_of_appointment" placeholder="select time for appointment">
<input type="submit" value="apply"> 
</form> 
</body>
</html>