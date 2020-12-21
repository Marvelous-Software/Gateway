
<!-- # 
John Maher
Gateway - PHP
Mirco Speretta
Assignment 4
9/21/2020

Exercise 1
----------
Implement a PHP script that creates (12) HTML tables outlining examples of data types and operators like showed in the table below (see the PHP script under the Reading section for some guidance) :

Implement separate tables for the following combination of "data type <=> operator"

integer <=> subtraction 
float <=> subtraction
integer <=> division
float <=> division
integer <=> modulus
integer <=> equal
string <=> equal
float <=> not equal
integer <=> greater than 
string <=> concatenation
boolean <=> and 
boolean <=> or
-->

<!-- adding some style to my HTML file -->
<style>
    table {
  border-collapse: collapse;
}

table, th, td {
  border: 1px solid black;
}

</style>

<?php
// declare and assign variables
$x = 7;
$y = 5;
$res = $x - $y;

echo "Assignment 4 Exercise 1";
echo "";
echo "table showing how to use - with integers";

echo "
    <table>
        <tr>
            <td>
            </td>
            <td>
                variable \$x
            </td>
            <td>
                variable \$y
            </td>
            <td>
                subtraction (-)
            </td>
        </tr>
        <tr>
            <td>
                integer
            </td>
            <td>
                $x
            </td>
            <td>
                $y
            </td>
            <td>
                $res
            </td>
        </tr>
        
    </table><br>
    ";

// re-evaluate
$res = $x / $y;
    
    echo "table showing how to use / with integers";

    echo "
        <table>
            <tr>
                <td>
                </td>
                <td>
                    variable \$x
                </td>
                <td>
                    variable \$y
                </td>
                <td>
                    division (/)
                </td>
            </tr>
            <tr>
                <td>
                    integer
                </td>
                <td>
                    $x
                </td>
                <td>
                    $y
                </td>
                <td>
                    $res
                </td>
            </tr>
            
        </table><br>
        ";
        
// re-evaluate
$res = $x % $y;
    
    echo "table showing how to use % with integers";

    echo "
        <table>
            <tr>
                <td>
                </td>
                <td>
                    variable \$x
                </td>
                <td>
                    variable \$y
                </td>
                <td>
                    modulus (%)
                </td>
            </tr>
            <tr>
                <td>
                    integer
                </td>
                <td>
                    $x
                </td>
                <td>
                    $y
                </td>
                <td>
                    $res
                </td>
            </tr>
            
        </table><br>
        ";
        
// re-evaluate
$res = $x == $y;
    
    echo "table showing how to use == with integers";

    echo "
        <table>
            <tr>
                <td>
                </td>
                <td>
                    variable \$x
                </td>
                <td>
                    variable \$y
                </td>
                <td>
                equal (==)
                </td>
            </tr>
            <tr>
                <td>
                    integer
                </td>
                <td>
                    $x
                </td>
                <td>
                    $y
                </td>
                <td>
                    ", var_dump($res), "
                </td>
            </tr>
            
        </table><br>
        ";
        
// re-evaluate
$res = $x > $y;
    
    echo "table showing how to use > with integers";

    echo "
        <table>
            <tr>
                <td>
                </td>
                <td>
                    variable \$x
                </td>
                <td>
                    variable \$y
                </td>
                <td>
                greater than (>)
                </td>
            </tr>
            <tr>
                <td>
                    integer
                </td>
                <td>
                    $x
                </td>
                <td>
                    $y
                </td>
                <td>
                    ", var_dump($res), "
                </td>
            </tr>
            
        </table><br>
        ";
        
// reassign values to variables 
$x = 2.5;
$y = 5.33;
$res = $x - $y;

echo "table showing how to use - with float";

echo "
    <table>
        <tr>
            <td>
            </td>
            <td>
                variable \$x
            </td>
            <td>
                variable \$y
            </td>
            <td>
                subtraction (-)
            </td>
        </tr>
        <tr>
            <td>
                float
            </td>
            <td>
                $x
            </td>
            <td>
                $y
            </td>
            <td>
                $res
            </td>
        </tr>
        
    </table><br>
    ";

// re-evaluate
$res = $x / $y;

    echo "table showing how to use / with float";

    echo "
        <table>
            <tr>
                <td>
                </td>
                <td>
                    variable \$x
                </td>
                <td>
                    variable \$y
                </td>
                <td>
                    division (/)
                </td>
            </tr>
            <tr>
                <td>
                    float
                </td>
                <td>
                    $x
                </td>
                <td>
                    $y
                </td>
                <td>
                    $res
                </td>
            </tr>
            
        </table><br>
        ";

// re-evaluate
$res = $x != $y;

    echo "table showing how to use != with float";

    echo "
        <table>
            <tr>
                <td>
                </td>
                <td>
                    variable \$x
                </td>
                <td>
                    variable \$y
                </td>
                <td>
                    not equal (!=)
                </td>
            </tr>
            <tr>
                <td>
                    float
                </td>
                <td>
                    $x
                </td>
                <td>
                    $y
                </td>
                <td>
                    ", var_dump($res), "
                </td>
            </tr>
            
        </table><br>
        ";

// reassign values to variables
$x = 'choo choo ';
$y = 'train';
$res = $x == $y;

echo "table showing how to use == with strings";

echo "
    <table>
        <tr>
            <td>
            </td>
            <td>
                variable \$x
            </td>
            <td>
                variable \$y
            </td>
            <td>
                equal (==)
            </td>
        </tr>
        <tr>
            <td>
                string
            </td>
            <td>
                $x
            </td>
            <td>
                $y
            </td>
            <td>
                ", var_dump ($res), "
            </td>
        </tr>
        
    </table><br>
    ";

// re-evaluate
$res = $x . $y;

echo "table showing how to use . with strings";

echo "
    <table>
        <tr>
            <td>
            </td>
            <td>
                variable \$x
            </td>
            <td>
                variable \$y
            </td>
            <td>
                concatenation (.)
            </td>
        </tr>
        <tr>
            <td>
                string
            </td>
            <td>
                $x
            </td>
            <td>
                $y
            </td>
            <td>
                $res
            </td>
        </tr>
        
    </table><br>
    ";

// reassign values to variables
$x = 5;
$y = 7;
$res = ($x == 7 and $y == 7);

echo "table showing how to use and";

echo "
    <table>
        <tr>
            <td>
            </td>
            <td>
                variable \$x
            </td>
            <td>
                variable \$y
            </td>
            <td>
                ", '$x = 7 and $y = 7 (and)', "
            </td>
        </tr>
        <tr>
            <td>
                string
            </td>
            <td>
                $x
            </td>
            <td>
                $y
            </td>
            <td>
                ", var_dump ($res), "
            </td>
        </tr>
        
    </table><br>
    ";

// re-evaluate
$res = ($x == 7 or $y == 7);

echo "table showing how to use or";

echo "
    <table>
        <tr>
            <td>
            </td>
            <td>
                variable \$x
            </td>
            <td>
                variable \$y
            </td>
            <td>
            ", '$x = 7 or $y = 7 (or)', "
            </td>
        </tr>
        <tr>
            <td>
                string
            </td>
            <td>
                $x
            </td>
            <td>
                $y
            </td>
            <td>
                ", var_dump ($res), "
            </td>
        </tr>
        
    </table><br>
    ";


?>
