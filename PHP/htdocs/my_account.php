<?php

session_start();

if( $_SESSION["logged"] ){

    echo "Hi " . $_SESSION["ID"] . "<br />";
    echo "Your are in your private account page";

}else{

    echo "You need to <a href=\"login.php\">login</a> to access this page.";

}


?>