
<!-- # 
John Maher
Gateway - Mobile Devices
Mirco Speretta
Assignment 7
11/30/2020
Exercise 3:

    Using the example of the NASA API, write a PHP script that 

    sends a search request for the date "2020-10-27"
    extracts the following information for the first 4 asteroids (i.e. "near_earth_objects")
        "id"
        "close_approach_date_full"
        "miles_per_hour"
 
 -->
 
<!DOCTYPE html>
<html>
<body>
<?php

$date = "2020-10-27";
$api_key_nasa = "g7K4EcuVe7tTXdYb0jWKpl3xjT55rVmpbOavIbN2";

// retrieve data using the REST API
$jsonAsteroids = file_get_contents("https://api.nasa.gov/neo/rest/v1/feed?start_date=" . $date . "&end_date=" . $date . "&api_key=" . $api_key_nasa);
//$jsonAsteroids = file_get_contents("https://api.nasa.gov/neo/rest/v1/feed?start_date=2020-10-27&end_date=2020-10-27&api_key=g7K4EcuVe7tTXdYb0jWKpl3xjT55rVmpbOavIbN2");

// deconding the json structure into a PHP object
// to access the data you have to use the -> notation
// $data = json_decode($jsonAsteroids);

// decoding the json structure into an array
// to access the data you have to use the [] notation
$data = json_decode($jsonAsteroids, true);


for( $r = 0; $r < 4; $r++ ) {
    $asteriod = $data["near_earth_objects"][$date][$r];
    $closest = $asteriod["close_approach_data"][0];
    echo "<h4>Asteroid " . ($r + 1) . "</h4>";
    echo "id: ";
    echo( $asteriod["id"]);
    echo "<br>";
    echo "date closest: ";
    echo( $closest["close_approach_date_full"]);
    echo "<br>";
    echo "speed: ";
    echo( $closest["relative_velocity"]["miles_per_hour"]);
    echo " mph<br>";
}

?>

</body>
</html>