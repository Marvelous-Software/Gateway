
<!-- # 
John Maher
Gateway - PHP
Mirco Speretta
Assignment 6
10/10/2020
Exercise 2

    Build an HTML form that uses the GET method and includes the following inputs:

        at least 2 text fields
        at least 2 radio buttons 

    Write a PHP script that can retrieve and display all the information 
    submitted by the user. If the user did not provide all the information, 
    your script should also show again the form pre-filled with the information 
    they already submitted (see image below for example).

    You should use 2 php scripts to solve this exercise!
 
 -->

<?php 

echo "<form method='post' value='Delete' action='Assignment6Exercise2process.php'>";
echo "  First Name: <input type='text' name='fName'";
if (!empty($fName)) {
    echo " value='".$fName."'";
} 
echo ">";
if (!empty($fNameErr)) {echo "<font color=red>".$fNameErr."</font>";}
echo "  <br>";
echo "  Last Name: <input type='text' name='lName'";
if (!empty($lName)) {
    echo " value='".$lName."'";
} 
echo ">";
if (!empty($lNameErr)) {echo "<font color=red>".$lNameErr."</font>";}
echo "  <br>";
echo "  E-mail: <input type='text' name='email'";
if (!empty($email)) {
    echo " value='".$email."'";
} 
echo ">";
if (!empty($emailErr)) {echo "<font color=red>".$emailErr."</font>";}
echo "  <br>";
echo "  <br>";
echo "  Days available:<br>";
echo "  <input type='radio' name='days' value='weekdays'>weekdays";
echo "  <input type='radio' name='days' value='weekends'>weekends<br>";
echo "  Times available:<br>";
echo "  <input type='radio' name='time' value='morning'>morning";
echo "  <input type='radio' name='time' value='afternoon'>afternoon";
echo "  <input type='radio' name='time' value='evening'>evening<br>";
echo "<input type='submit'>";

?> 

