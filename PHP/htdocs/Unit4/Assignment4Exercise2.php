<!-- # 
John Maher
Gateway - PHP
Mirco Speretta
Assignment 4
9/23/2020

Exercise 2
----------
Create 3 files (i.e. header.php, main.php, footer.php) and use the PHP 
built-in function include() to implement an HTML page with the structure 
showed below. Notice that the main portion of the page includes the 
multiplication table that you implemented for the homework assignment 3.
-->

<?php 

include( "Assignment4Exercise2Header.php"); 

echo "<div style='background-color:#8FABDC; border:1px solid #8FABDC;'>";
echo "<p>This is the main portion of the page</p>";
echo "<br>";
include( "Assignment4Exercide2Body.php"); 
for($r = 0; $r < 10; $r++) { 
    echo "<br>";
}
echo "</div>";

include( "Assignment4Exercise2Footer.php"); 

?> 