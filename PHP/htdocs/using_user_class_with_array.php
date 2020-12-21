<!DOCTYPE html>
<html>
<body>

<?php

require('user_class.php');

echo "<h3>In this example we show how to use the User class to handle users of a Website</h3>";
echo "<p>Let us image that we need to keep track of all the users on our Web site. 
Since we already have a \"User\" class, one way to handle all the users is to </p>";
echo "<ul>";
echo "<li>create an object for each user</li>";
echo "<li>store all the objects into an array</li>";
echo "</ul>";

// creating an array where to store all the objects
$all_users = [];

// creating user objects. We are going to set the usernames for some of the users
$user1 = new User('Jill', 'Land');
array_push($all_users, $user1);

// object creation
$user2 = new User('Don', 'Lip');
$user2->set_username( 'dLip' );
// add the object into array 
array_push($all_users, $user2);

$user3 = new User('Angela', 'Baker');
$user3->set_username( 'aBker' );
array_push($all_users, $user3);

$user4 = new User('Brian', 'Fraser');
array_push($all_users, $user4);

$user5 = new User('Ella', 'Clark');
$user5->set_username( 'eClark' );
array_push($all_users, $user5);

// to display all the objects in the array we are going to use a loop
echo "<h4>Printing all the information about the users into separate paragraphs</h4>";
for( $i=0; $i<sizeof($all_users); $i++ ){
    echo "<p>";
    $all_users[$i]->print_user_info();
    echo "Username: " . $all_users[$i]->get_username() . "<br>";
    echo "</p>";
}

?>

</body>
</html>