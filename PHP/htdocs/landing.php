<?php

session_start();

// information of user, usually stored in a database
$firstname = "John";
$lastname = "Doe";
$username = "jdoe";
$password = "qwerty";

if( !empty($_POST["username"]) && !empty($_POST["password"]) ){
    // check the identity of the user 

    if( 
        strcasecmp($_POST["username"], $username ) == 0 || 
        strcasecmp($_POST["password"], $password) == 0 ){

        // store in the session information related to the user that logged in
        $_SESSION["logged"] = true;
        $_SESSION["ID"] = $username;
    
        // if the there is a match the user is validated with the information in our backend (e.g. database)
        echo "Hi " . $firstname . "<br />";
        echo "Go to the your <a href=\"my_account.php\">My Account</a> page.";

    }else{
        echo "Wrong username/password. <a href=\"login.php\">Try again</a>";
    }

}else{
    header('Location: login.php');
}
