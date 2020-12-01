
<!-- # 
John Maher
Gateway - Mobile Devices
Mirco Speretta
Assignment 10
11/30/2020
Exercise 2:

  Write a PHP script that uses the music database and 

  shows all the songs stored in the song_lut table
  shows all the songs that include the string "Out" in the song_name field (hint: if you are not familiar with SQL you might want to take a look at https://www.w3schools.com/sql/sql_like.asp)

 -->
 
 <?php

// connect to a MySQL database
$server = "127.0.0.1";
$username = "root";
$password = "";
$db = "music";

$conn = new mysqli( $server, $username, $password, $db );

// access a specific database
if( $conn->connect_error ){
    die("The connection with the databse failed: " . $conn->connect_error );
}

echo "Yey! I Connected <br /><br />";


// list all songs
$sql = "SELECT song_name FROM song_lut";
$result = $conn->query( $sql );

if( $result->num_rows > 0 ){

    while( $record = $result->fetch_assoc() ){
        echo $record["song_name"] . "<br><br>";
    }

}else{
    echo "no songs found: " . $sql;
echo "<hr>";

}

echo "<hr>";

// list all songs containing 'Out'
$sql = "SELECT song_name FROM song_lut WHERE song_name LIKE '%Out%'";
$result = $conn->query( $sql );

if( $result->num_rows > 0 ){

    while( $record = $result->fetch_assoc() ){
        echo $record["song_name"] . "<br><br>";
    }

}else{
    echo "no songs found: " . $sql;
}



$conn->close();

?> 