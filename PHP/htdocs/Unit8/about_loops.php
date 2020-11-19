<?php

function list_with_while(){
    echo "printing a list using a while loop";
    echo "<ul>";
    $i = 1;
    while($i <= 5) {
      echo "<li>Item: $i </li>";
      $i++;
    }
    echo "</ul>";
}


function list_with_for(){
    echo "printing a list using a for loop";
    echo "<ul>";
    for ($i = 1; $i <= 5; $i++) {
        echo "<li>Item: $i </li>";
    }
    echo "</ul>";
}


function list_with_foreach(){
    echo "printing a list using a foreach loop. This technique is particulary helpful when you use arrays<br>";
    $fruits = array("apple", "orange", "apricot", "pineapple");
    echo "<br>Before the loop let's recall how to access a specific element from an array:<br>";
    echo "Element 2 is $fruits[1]<br>";
    echo "Element 3 is $fruits[2]<br>";
    echo "<br>And now the loop:";
    echo "<ul>";    
    foreach ($fruits as $fruit) {
        echo "<li>Fruit in array: $fruit </li>";
    }
    echo "</ul>";
}


// main instructions of the PHP scripts

// invoke the user defined list_with_while() function
list_with_while();

echo "<hr>";

// invoke the user defined list_with_while() function
list_with_for();

echo "<hr>";

// invoke the user defined list_with_while() function
list_with_foreach();

?>