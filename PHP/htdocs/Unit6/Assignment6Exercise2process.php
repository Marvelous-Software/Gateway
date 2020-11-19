
<!-- # 
John Maher
Gateway - Mobile Devices
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

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $fName = htmlspecialchars($_POST["fName"]);
    $lName = htmlspecialchars($_POST["lName"]);
    $email = htmlspecialchars($_POST["email"]);
    if (isset($_POST["days"])) {
        $days = htmlspecialchars($_POST["days"]);
    }
    if (isset($_POST["time"])) {
        $time = htmlspecialchars($_POST["time"]);
    }


    if (empty($fName)) {
        $fNameErr = "First Name is required";
        echo "First Name was not entered<br>";
    } else {
        echo "First Name is ".$fName."<br>";
    }    
    if (empty($lName)) {
        $lNameErr = "Last Name is required";
        echo "Last Name was not entered<br>";
    } else {
        echo "Last Name is ".$lName."<br>";
    }if (empty($email)) {
        $emailErr = "First Name is required";
        echo "E-mail was not entered<br>";
    } else {
        echo "E-mail is ".$email."<br>";
    }if (empty($days)) {
        echo "Days were not selected<br>";
    } else {
        echo "Days are ".$days."<br>";
    }if (empty($time)) {
        echo "Time was not selected<br>";
    } else {
        echo "Time is ".$time."<br>";
    }
}

echo "<br>";
echo "<br>";
include( "Assignment6Exercise2submit.php"); 

?> 
