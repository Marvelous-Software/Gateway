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


// list records from a specific table
$sql = "SELECT album_name, album_release_date FROM album_lut";
$result = $conn->query( $sql );

if( $result->num_rows > 0 ){

    while( $record = $result->fetch_assoc() ){
        echo "Album:" . $record["album_name"] . ", release date:" . $record["album_release_date"] . "<br><br>";
    }

}else{
    echo "no result from the the query: " . $sql;
}


// example inserting a new record
$sql = "INSERT INTO album_lut (album_id, artist_id, album_name, album_release_date) VALUES (9, 4, \"Pork Soda\", \"1993-04-20\")";

if ($conn->query($sql) === TRUE) {
  echo "New record created successfully";
} else {
  echo "Error: " . $sql . "<br>" . $conn->error;
}


$conn->close();

?> 