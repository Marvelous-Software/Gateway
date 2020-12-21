
<!-- # 
John Maher
Gateway - PHP
Mirco Speretta
Assignment 7
10/18/2020
Exercise 3:

    write a PHP script that sets 3 cookies with the following 
    name=>value pairs:

    color => green
    menu => left
    size => 10
    Then write another PHP scripts that 

    shows the user the cookies already set in the browser
    uses an HTML form to allow the user to select and remove a cookie

 -->

<?php 

setcookie("color", "green", time()+3600);
setcookie("menu", "left", time()+3600);
setcookie("size", "10", time()+3600);
    
?> 
