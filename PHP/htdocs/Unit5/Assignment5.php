
<!-- # 
John Maher
Gateway - PHP
Mirco Speretta
Unit 5:Assignment 5
10/1/2020
Exercise 1

write a PHP script that, given 3 numbers, finds the biggest. Complete 
the solution below to solve this exercise

$a = 10;
$b = 9;
$c = 11;
if( ($a>$b) and ($a>$c) ){   
   print("The value stored in variable \$a is $a. It is biggest value between $a, $b, and $c <br>");   
}elseif( ($a>$b) and ($a<$c) ){   
   print("The value stored in variable \$c is $c. It is biggest value between $a, $b, and $c <br>");         
}else{    print("...");}

 -->
<?php  

    $a = 10;
    $b = 9;
    $c = 11;
    if( ($a>$b) and ($a>$c) ){   
       print("The value stored in variable \$a is $a. It is biggest value between $a, $b, and $c <br>");   
    }elseif( ($a>$b) and ($a<$c) ){   
       print("The value stored in variable \$c is $c. It is biggest value between $a, $b, and $c <br>");         
    }else{    
        print("The value stored in variable \$b is $b. It is biggest value between $a, $b, and $c <br>");
    }
    
 ?> 

<!-- # 
Exercise 2

The image below represents a quadrant. Write a PHP script that, given a point, (x,y), calculates its quadrant. In your script you will need to use 2 variables x and y along with conditional statements. You can hard code (i.e. assign a value to x and y)
Examples:

(4, 2) is in quadrant 1
(-10,-4) is in quadrant 3.
 
 -->

<?php 

function getQuadrant(int $x, int $y) {
    
    $quadrant = "($x, $y) is in ";
    if ($x > 0) {
        if ($y > 0) {
            $quadrant = "quadrant 1";
        } else if ($y < 0) {
            $quadrant = "quadrant 2";
        } else {
            $quadrant = "y axis";
        }
    } else if ($x < 0) {
        if ($y < 0) {
            $quadrant = "quadrant 3";
        } else if ($y > 0) {
            $quadrant = "quadrant 4";
        } else {
            $quadrant = "y axis";
        }
    } else if ($y != 0) {
        $quadrant = "x axis";
    } else {
        $quadrant = "the center";
    }

    return $quadrant;

  }

echo "<br>";
echo getQuadrant(1,1);
echo "<br>";
echo getQuadrant(0,1);
echo "<br>";
echo getQuadrant(1,-1);
echo "<br>";
echo getQuadrant(-1,-1);
echo "<br>";
echo getQuadrant(-1,0);
echo "<br>";
echo getQuadrant(-1,1);
echo "<br>";
echo getQuadrant(0,0);
echo "<br>"; 
echo "<br>"; 


?> 

<!-- # 
Exercise 3

Write a PHP script that outputs the table shown below. To solve this 
exercise you must use 2 arrays: 1 for the list of ingredients and 1 for 
the dosage of each ingredient.

 -->

 <?php 

$ingredients = ["flour", "backing powder", "salt", "white sugar", "eggs", "milk", "butter"];
$amount = ["1 1/2 cup", "1 1/2 tsp", "1/2 tsp", "1 tbsp", "1 egg", "1 1/2 cup", "3 tbsp"];

echo "<br>"; 
echo "<b>Let's make pancakes</b>"; 
echo '		<table border=1px cellspacing=0 cellpadding=3>';
$table = "			<tr>";
$table .= "			    <th style='text-align:left;'>";
$table .= "			        Ingredient";
$table .= "			    </th>";
$table .= "			    <th>";
$table .= "			        How much";
$table .= "			    </th>";
$table .= "			</tr>";
for($row = 0; $row < count($ingredients); $row++) {
    $table .= "			<tr>";
    $table .= "			    <td>";
    $table .= "			        $ingredients[$row]";
    $table .= "			    </td>";
    $table .= "			    <td>";
    $table .= "			        $amount[$row]";
    $table .= "			    </td>";
    $table .= "			</tr>";
}
echo $table;
echo '		</table>';
