<?php

// staring a session
session_start();

echo "This page will only set some session variables<br><br>";

// Set session variables
echo "Starting to set variables... <br>";

$_SESSION["var1"] = "an example with a string";
$_SESSION["var2"] = 42;

echo "Variables have been set.";

?> 