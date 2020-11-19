
<!-- # 
John Maher
Gateway - Mobile Devices
Mirco Speretta
Assignment 7
10/18/2020
Exercise 2:

    write a PHP script that produces the HTML table showed below. To 
    complete this exercise please follow these directions:

    all the HTML code handling the table should be printed from a PHP 
    function that you need to create.
    create 2 arrays: $ingredients and $amounts where you store the 
    information listed in the first and second row respectively.
    the arrays should be passed to the function that will use them to 
    print the table.
 
 -->

<?php 

class tableBuilder {

    private int $border = 0;
    private int $indent;
    private string $initialIndent;
    private string $rows = "";
    

    function __construct($setIndent, $setInitialIndent) {

        $this->indent = $setIndent;
        $this->initialIndent =  str_repeat(" ", $setInitialIndent);

    }
     
    public function setBorder ($newBorder) {

        $this->border = $newBorder;

    }
 
    //Needed this to match the assignment which requires a function not a method
    private function addTableRows2Internal ($rowOdd, $rowEven) {

        $indent1st = $this->initialIndent.str_repeat(" ", $this->indent * 2);
        $indent2nd = $this->initialIndent.str_repeat(" ", $this->indent * 3);

        $this->rows = $this->rows.$indent1st."<tr>".PHP_EOL;
        foreach ($rowOdd as $cell)  {
            $this->rows = $this->rows.$indent2nd."<td>".$cell."</td>".PHP_EOL;
        }
        $this->rows = $this->rows.$indent1st."</tr>".PHP_EOL;
        $this->rows = $this->rows.$indent1st."<tr>".PHP_EOL;
        foreach ($rowEven as $cell)  {
            $this->rows = $this->rows.$indent2nd."<td>".$cell."</td>".PHP_EOL;
        }
        $this->rows = $this->rows.$indent1st."</tr>".PHP_EOL;
    }
 
    public function addTableRows2 ($rowOdd, $rowEven) {

        $this->addTableRows2Internal($rowOdd, $rowEven);

    }
 
    public function getTable () {

        $border = "";

        if ($this->border > 0) {
            $border = " border = '{$this->border}' style='border-collapse:collapse';";
        }
        $table = $this->initialIndent."<table$border>".PHP_EOL;
        $table = $table.$this->rows.PHP_EOL;
        $table = $table.$this->initialIndent."</table>".PHP_EOL;
        return $table;

    }
 
}

$ingredients = ["flour", "olive oil", "salt", "water"];
$amounts = ["4 cups", "2 tbsp", "2 pinches", "1/2 cup"];
$table = new tableBuilder(4, 4);
$table -> setBorder(1);
$table -> addTableRows2($ingredients, $amounts);
echo "<html>".PHP_EOL;
echo "    <head>".PHP_EOL;
echo "        <title>Assignment 7; Exercise 2</title>".PHP_EOL;
echo "    </head>".PHP_EOL;
echo "    <body>".PHP_EOL;
echo "        <h3>How to make pasta</h3>".PHP_EOL;
echo "        {$table -> getTable()}".PHP_EOL;
echo "    </body>".PHP_EOL;
echo "</html>";


?> 
