
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

echo '<form method="post" action="Assignment7Exercise3b.php">';

foreach ($_POST as $key => $val)  {
    setcookie($key, null); }
foreach ($_COOKIE as $key => $val)  {

    if (empty($_POST[$key])) {
        echo "<label for='$key'>$val</label><input type='checkbox' name='$key' value='$key' style='margin-left:50px';> Delete<br>".PHP_EOL;
    }
    
}
    //<input type="radio" name="ice_cream" value="chocolate">chocolate
        
    echo '<br>';
    echo '<input type="submit" value="Delete">';
    echo '</form>';

?> 
