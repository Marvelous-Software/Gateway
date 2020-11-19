<?php

  $fruits = $_POST['fruits'];

  // making sure the array of checkboxes is not empty
  if(empty($fruits)){

    echo("You did not select any fruit. Fruits are good for you!");

  }else{

    // example using a for loop
    echo("You chose the folowing fruits (using for): ");
    echo "<ul>";
    // show each checkbox that was selected
    for($i=0; $i<count($fruits); $i++){
      echo("<li>Fruit: " . $fruits[$i] . "</li>");
    }
    echo "</ul>";
  
    echo "<hr>";

    // example using a foreach loop
    echo("You chose the folowing fruits (using foreach): ");
    echo "<ul>";
    // show each checkbox that was selected
    foreach($fruits as $fruit){
      echo("<li>Fruit: " . $fruit . "</li>");
    }
    echo "</ul>";
  }

  ?>