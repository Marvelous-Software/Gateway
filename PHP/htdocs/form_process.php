<?php

/*
 *
 * 
 * retrieving data using the $_SERVER super global array
 * 
 */
echo "<h4>Retrieving data from the \$_SERVER superglobal variable</h4>";
echo "The script handling this page is ".$_SERVER['PHP_SELF'];
echo "<br>";
echo "The browser of the user uses the user-agent: ".$_SERVER['HTTP_USER_AGENT'];

/*
 *
 * 
 * handling a form using the POST method and handling text inputs
 * 
 */
echo "<br><h4>retrieving the data sent by the POST method and handling text inputs</h4>";
$first_name = $_POST['first_name'];
$last_name = $_POST['last_name'];
if (empty($first_name)) {
    echo "The First Name was not provided<br>";
} else {
    echo "Your first name is ".$first_name."<br>";
}

if (empty($last_name)) {
    echo "The Last Name was not provided<br>";
} else {
    echo "Your last name is ".$last_name."<br>";
}

/*
 *
 * 
 * handling a form using the GET method and handling text inputs
 * 
 */
echo "<br><h4>retrieving the data sent by the GET method and handling text inputs</h4>";
$first_name = $_GET['first_name'];
$last_name = $_GET['last_name'];
if (empty($first_name)) {
    echo "The First Name was not provided<br>";
} else {
    echo "Your first name is ".$first_name."<br>";
}

if (empty($last_name)) {
    echo "The Last Name was not provided<br>";
} else {
    echo "Your last name is ".$last_name."<br>";
}


/*
 *
 * 
 * retrieving the data sent by the POST method and handling a password input
 * 
 */
echo "<br><h4>retrieving the data sent by the POST method and handling a password input</h4>";
$password = $_POST['password'];
if (empty($password)) {
    echo "The password was not entered<br>";
} else {
    echo "The password is ".$password."<br>";
}


/*
 *
 * 
 * retrieving the data sent by the POST method and handling a radio input
 * 
 */
echo "<br><h4>retrieving the data sent by the POST method and handling a radio input</h4>";
$ice_cream = $_POST['ice_cream'];
if (empty($ice_cream)) {
    echo "No ice cream selected<br>";
} else {
    echo "I like ".$ice_cream." ice cream<br>";
}
