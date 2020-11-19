<!-- # 
John Maher
Gateway - Mobile Devices
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

<?php define("CellFormatting", "align='center'"); ?> 
<?php define("EvenRow", "style='background-color: White;'"); ?> 
<?php define("OddRow", "style='background-color: Yellow;'"); ?> 
<?php echo '		<table border=1px cellspacing=0 cellpadding=3 style="width: 99%;">'; ?> 
<?php echo '			<caption ' . EvenRow . ' text-aligh:left;><b>HTML Table</b></caption>'; ?> 
<?php $table = ''; ?> 
<?php $row_type = 'th'; ?> 
<?php $color = ''; ?> 
<?php # Build the table ?> 
<?php #     First row is column headers ?> 
<?php #     First column is row headers ?> 
<?php #     Make headers bold, highlight every other row ?> 
<?php $color = EvenRow; ?>
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
<?php         $color = EvenRow; ?> 
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