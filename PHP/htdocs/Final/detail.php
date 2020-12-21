
<!-- # 
John Maher
Gateway - PHP
Mirco Speretta
Final
12/1/2020
-->

<!DOCTYPE HTML>
<html>
    <head>
		<title>PHP Final detail</title>
        <style>
            .column {
                float: left;
                width: 48%;
                padding: 10px;
            }
            .right {
                font-weight: bold;
                text-align: right;                
            }
            img {
                display: block;
                margin-left: auto;
                margin-right: auto;
            }
        </style>   
    </head>
	<body>

        <?php

        $id = "3826652";
        session_start();
        require('Asteroid.php');
        if (!empty($_GET['id'])) {
            $id = $_GET['id'];
        }
        if (!empty($_POST['asrteroid_id'])) {
            $id = $_POST['asrteroid_id'];
        }

        $api_key_nasa = "g7K4EcuVe7tTXdYb0jWKpl3xjT55rVmpbOavIbN2";

        // retrieve data using the REST API
        //http://www.neowsapp.com/rest/v1/neo/2036284?api_key=g7K4EcuVe7tTXdYb0jWKpl3xjT55rVmpbOavIbN2
        $json = file_get_contents("http://www.neowsapp.com/rest/v1/neo/$id?api_key=" . $api_key_nasa);

        // decoding the json structure into an array
        // to access the data you have to use the [] notation
        $asteriod  = json_decode($json, true);

        echo 'User: ' . $_SESSION["username"] . PHP_EOL;
        ?> 

        <img src='Graphics/nasa-logo.svg' alt='nasa logo'>
        <div>
            <div class="column">
                <h1 class="right">Asteroid:</h1>
                <p class="right"><a href = "https://www.jpl.nasa.gov/">View NASA JPL Page</a></p>
                <p class="right">ID:</p>
                <p class="right">Close Approach Date:</p>
                <p class="right">First Observation Date:</p>
                <p class="right">Last Observation Date:</p>
            </div>
            <div class="column">
                <?php
                    echo "<h1>" . $asteriod["name"] . "</h1>" . PHP_EOL;
                    echo "<p><a href = 'final.php'>Search New Asteroid</a></p>" . PHP_EOL;
                    echo "<p>" . $asteriod["id"] . "</p>" . PHP_EOL;
                    echo "<p>" . $asteriod["close_approach_data"][0]["close_approach_date"] . "</p>" . PHP_EOL;
                    echo "<p>" . $asteriod["orbital_data"]["first_observation_date"] . "</p>" . PHP_EOL;
                    echo "<p>" . $asteriod["orbital_data"]["last_observation_date"] . "</p>" . PHP_EOL;
                ?> 
            </div>
        </div>

    </body>
</html>