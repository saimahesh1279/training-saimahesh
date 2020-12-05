
<!DOCTYPE html>
<html>
<head>
<h1 align="center">Welcome to Appointment Page</h1>
</head>
<body bgcolor="Wheat" align="center">
<br><br>
<br>
<a href="patient_home.html">Home</a>
<a href="patient_profile.jsp">patient Profile</a>
<a href="appointment.jsp">Appointment</a>
<a href="appointment_status.jsp">Appointment status</a>
<a href="index.html">Logout</a>
<br>
<br>
<br>
<form action="apply_appointment.jsp">
<input type="text" name="name" placeholder="Enter name "><br><br><br>
<input type="number" name="phone" placeholder="enter phone number " ><br>
<input type="email" name="email" placeholder="Enter email "><br><br><br>
<input type="radio" name="gender" value="Male" > Male
<input type="radio" name="gender" value="Female"> Female<br>
<select name="blood_group">
<option value="A+">A+</option>
<option value="B+">B+</option>
<option value="O+">O+</option>
<option value="AB+">AB+</option>
<option value="A-">A-</option>
<option value="B-">B-</option>
<option value="O_">O-</option>
<option value="AB-">AB-</option>
</select><br><br>
<select name="specialist">
<option value="Dentist">Dentist</option>
<option value="Cardio">Cardio</option>
<option value="ENT">ENT</option>
</select><br><br>
<input type="date" name="date_of_appointment" placeholder="select date">
<input type="time" name="time_of_appointment" placeholder="enter time">

<input type="submit" value="Apply">

</form>

</body>
</html>