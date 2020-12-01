<?php

session_start();

// Showing the variables I saved from the previous page

echo "The value of var1 is \"" . $_SESSION["var1"] . "\"<br />";
echo "The value of var2 is \"" . $_SESSION["var2"] . "\"";

?>

