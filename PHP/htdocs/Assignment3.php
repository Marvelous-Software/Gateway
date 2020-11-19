
<!-- 
John Maher
Gateway - Mobile Devices
Mirco Speretta
Assignment 3
9/14/2020
-->

<?php echo '<html>'; ?> 
<?php echo '	<head>'; ?> 
<?php echo '		<title>Assignment 33</title>'; ?> 
<?php echo '	</head>'; ?> 
<?php echo '	<body>'; ?> 

<!-- 
Exercise 1

Declare a variable and assign your name to it.
Declare another variable and assign your age to it.
Print the statement "My name is __________ and I am __________ years old"
-->
<?php echo '		<h1>Exercise 1</h1>'; ?> 

<?php $name = "John"; ?> 
<?php $age = 51; ?> 
<?php print "		<p>My name is $name and I am $age years old.</p>"; ?> 


<!-- 
Exercise 2

Declare 3 variables and assign a number to each of them.
Declare another variable and calculate the sum of the 3 numbers. Print the result.
Subtract the second and the third numbers from the first number and print the result.
Multiply the 3 numbers together and print the result.
Use at most 4 variables to solve this exercise.
-->
<?php echo '		<h1>Exercise 2</h1>'; ?> 

<?php $num1 = 2; ?> 
<?php $num2 = 11; ?> 
<?php $num3 = 433; ?> 
<?php $num4 = $num1 + $num2 + $num3; ?> 
<?php print "		<p>The sum of $num1, $num2 & $num3 is $num4.</p>"; ?> 
<?php $num4 = $num1 - $num2 - $num3; ?> 
<?php print "		<p>The difference of $num2 & $num3 from $num1 is $num4.</p>"; ?> 
<?php $num4 = $num1 * $num2 * $num3; ?> 
<?php print "		<p>The product of $num1, $num2 & $num3 is $num4.</p>"; ?> 
<?php $num4 = $num3 / $num2 / $num1; ?> 
<?php print "		<p>The quotient of $num3 by $num2 & $num1 is $num4.</p>"; ?> 


<!-- 
Exercise 3

write a PHP script that outputs the multiplication table showed below. Use the following rules to complete the exercise:

each number in the first row and the first column are values stored in PHP variables
all the remaining numbers (e.g. example highlighted in red) should be the result of a multiplication of 2 variables in PHP (e.g. $numx * $numy)
you can use at most 10 php variables
use PHP constants to store the values of the colors used to style the HTML table

variables
1) $table
2) $row_type
3) $color
4) $col
5) $row
6) $multiplyer
7) $p

-->
<?php echo '		<h1>Exercise 3</h1>'; ?> 

<?php echo '		<table border=1px cellspacing=0 cellpadding=3>'; ?> 

<?php $table = ''; ?> 
<?php $row_type = 'th'; ?> 
<?php $color = ''; ?> 
<?php define("CellFormatting", "align='center' width=25px"); ?> 
<?php define("OddRow", "style='background-color: Yellow;'"); ?> 
<?php # Build the table ?> 
<?php #     First row is column headers ?> 
<?php #     First column is row headers ?> 
<?php #     Make headers bold, highlight every other row ?> 
<?php for($row = 0; $row < 11; $row++) { ?> 
<?php     $table = $table . "			<tr $color >" . PHP_EOL; ?>
<?php     if ($row != 0) { ?>
<?php         # Used from the 2nd row, 2nd column to the end of the grid ?> 
<?php         $multiplyer = $row ?> 
<?php     } else { ?>
<?php         # We do not multiply the first row, row 0.  Instead just show the number. ?> 
<?php         $multiplyer = 1 ?> 
<?php     } ?>
<?php     if ($row % 2 == 0) { ?>
<?php         # Highlight. ?> 
<?php         $color = OddRow; ?> 
<?php     } else { ?>
<?php         # No highlight. ?> 
<?php         $color = ''; ?> 
<?php     } ?>
<?php     for($col = 0; $col < 11; $col++) { ?> 
<?php         $table = $table . "				<$row_type " . CellFormatting . ">" . PHP_EOL; ?>
<?php         if ($col > 0) { ?> 
<?php             # 2nd column to the end of the grid ?> 
<?php             $p = $col * $multiplyer ?> 
<?php             $table = $table . "					$p"; ?> 
<?php         } else if ($row != 0) { ?> 
<?php             # First column ?> 
<?php             $table = $table . "					<b>$row</b>"; ?> 
<?php         } else { ?> 
<?php             # Top-left cell ?> 
<?php             $table = $table . "					<b>*</b>"; ?> 
<?php         } ?> 
<?php         $table = $table . PHP_EOL . "				</$row_type>" . PHP_EOL; ?> 
<?php     } ?> 
<?php     $table = $table . '			</tr>' . PHP_EOL; ?>
<?php     $row_type = 'td'; ?> 
<?php } ?> 
<?php echo $table; ?> 
<?php echo '		</table>'; ?> 




<?php echo '	</body>'; ?> 
<?php echo '</html>'; ?> 