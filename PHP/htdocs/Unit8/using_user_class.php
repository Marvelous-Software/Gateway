<!DOCTYPE html>
<html>
<body>
<?php

require('user_class.php');

echo "<h3>In this example we show how to use the User class to handle users of a Website</h3>";

// creating an object
$user1 = new User('Jill', 'Land');

echo "<h4>Information about user1:</h4>";
// invoking a method from the user class
$user1->print_user_info();

// creating an object
$user2 = new User('Don', 'Lip');

// invoking a method from the user class
$user2->set_username( 'jland' );
echo "<h4>Information about user2:</h4>";
$user2->print_user_info();

?>

</body>
</html>