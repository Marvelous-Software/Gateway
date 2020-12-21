
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
		<title>PHP Final</title>
        <style>
            td.border {
                border-top: 1px solid black;
                border-collapse: collapse;
                margin-left: -1px;
                margin-right: -1px;
                padding: -1px;
            }
            td.borderleft {
                border-left: 1px solid black;
                border-top: 1px solid black;
                border-collapse: collapse;
            }
            td.borderlright {
                border-right: 1px solid black;
                border-top: 1px solid black;
                border-collapse: collapse;
            }
            td.center {
                text-align: center;
            }
            td.right {
                text-align: right;
            }
        </style>
    </head>

	<body>

        <?php

        session_start();
        require('Asteroid.php');
        //$_SESSION["logged"] = false;
       
        if (($_SESSION["logged"] == true) || !empty($_POST['username']) && !empty($_POST['password'])) {

            if (!$_SESSION["logged"]) {
                if (strcasecmp($_POST['username'], "joe") == 0 && strcasecmp($_POST['password'], "yo") == 0) {
                    $_SESSION["logged"] = true;
                    $_SESSION["username"] = $_POST['username'];
                }
            }
            if ($_SESSION["logged"]) {
                if (empty($_POST['start_date'])) {
                    $datestart = "2018-08-01";
                }
                else {
                    $datestart = $_POST['start_date'];
                }
                if (empty($_POST['end_date'])) {
                    $dateend = "2018-08-04";
                }
                else {
                    $dateend = $_POST['end_date'];
                }                
                $api_key_nasa = "g7K4EcuVe7tTXdYb0jWKpl3xjT55rVmpbOavIbN2";

                // retrieve data using the REST API
                //https://api.nasa.gov/neo/rest/v1/feed?start_date=2018-08-01&end_date=2018-08-04&api_key=g7K4EcuVe7tTXdYb0jWKpl3xjT55rVmpbOavIbN2
                $json = file_get_contents("https://api.nasa.gov/neo/rest/v1/feed?start_date=$datestart&end_date=$dateend&api_key=" . $api_key_nasa);

                // decoding the json structure into an array
                // to access the data you have to use the [] notation
                $data = json_decode($json, true);

                // array that will store all the articles retrieved from the API
                $all_asteroids = [];
                $asteriods = $data["near_earth_objects"];

                foreach ($asteriods as $asteroid_date => $asteroid) {
                    //echo 'date - ' . $asteroid_date . '<br>';
                    foreach ($asteroid as $asteroid_data) {
                        $asteroid_close_approach = $asteroid_data["close_approach_data"];
                        //echo($asteroid_data["name"] . '<br>');
                        $astroid_obj = new Asteroid($asteroid_data["id"],
                                                    $asteroid_data["name"], 
                                                    $asteroid_close_approach[0]["close_approach_date"], 
                                                    $asteroid_close_approach[0]["relative_velocity"]["miles_per_hour"], 
                                                    $asteroid_close_approach[0]["miss_distance"]["miles"], 
                                                    $asteroid_data["links"]["self"]);

                        array_push( $all_asteroids, $astroid_obj );
                        }
                    }

                echo "   <form action='final.php' method='post'>" . PHP_EOL;
                echo '      User: ' . $_SESSION["username"] . PHP_EOL;
                echo '		<table>' . PHP_EOL;
                echo '			<tr>' . PHP_EOL;
                echo "				<td class='center' colspan=6>" . PHP_EOL;
                echo "					<img src='Graphics/nasa-logo.svg' alt='nasa logo'>" . PHP_EOL;
                echo "				</td>" . PHP_EOL;
                echo '			</tr>' . PHP_EOL;
                echo '			<tr>' . PHP_EOL;
                echo "				<td class='center' colspan=6>" . PHP_EOL;
                echo "					<b>Near Earth Objects</b>" . PHP_EOL;
                echo "				</td>" . PHP_EOL;
                echo '			</tr>' . PHP_EOL;
                echo '			<tr>' . PHP_EOL;
                echo "				<td class='center' colspan=6>" . PHP_EOL;
                echo "					Search by date or id to view asteroids tracked by NASA" . PHP_EOL;
                echo "				</td>" . PHP_EOL;
                echo '			</tr>' . PHP_EOL;
                echo '			<tr>' . PHP_EOL;
                echo "				<td class='center' colspan=6>" . PHP_EOL;
                echo "					Search by date; START: <input name='start_date'> END: 
                            <input name='end_date'> <input type='submit' value='Submit'>" . PHP_EOL;
                echo "				</td>" . PHP_EOL;
                echo '			</tr>' . PHP_EOL;
                echo '			<tr>' . PHP_EOL;
                echo "				<td class='center' colspan=6>" . PHP_EOL;
                echo "					Search by Asteroid ID: <input name='asteroid_id'> " . PHP_EOL;
                echo "					<button type='submit' name='asrteroid_id' formaction='detail.php'>" . PHP_EOL;
                echo "				    Submit</button>" . PHP_EOL;
                echo "				</td>" . PHP_EOL;
                echo '			</tr>' . PHP_EOL;
                echo '			<tr>' . PHP_EOL;
                echo "				<td>" . PHP_EOL;
                echo "					Results " . count($all_asteroids) . PHP_EOL;
                echo "				</td>" . PHP_EOL;
                echo "				<td class='right' colspan=6>" . PHP_EOL;
                echo "					" . date("Y/m/d") . PHP_EOL;
                echo "				</td>" . PHP_EOL;
                echo '			</tr>' . PHP_EOL;
                echo "			<tr>" . PHP_EOL;
                echo "				<td class='borderleft'>" . PHP_EOL;
                echo "					<b>Name</b>" . PHP_EOL;
                echo "				</td>" . PHP_EOL;
                echo "				<td class='border'>" . PHP_EOL;
                echo "					<b>Asteroid ID</b>" . PHP_EOL;
                echo "				</td>" . PHP_EOL;
                echo "				<td class='border'>" . PHP_EOL;
                echo "					<b>Relative Velocity (mph)</b>" . PHP_EOL;
                echo "				</td>" . PHP_EOL;
                echo "				<td class='border'>" . PHP_EOL;
                echo "					<b>Miss Distance (Miles)</b>" . PHP_EOL;
                echo "				</td>" . PHP_EOL;
                echo "				<td class='border'>" . PHP_EOL;
                echo "					<b>Name Link</b>" . PHP_EOL;
                echo "				</td>" . PHP_EOL;
                echo "				<td class='borderlright'>" . PHP_EOL;
                echo "					<b>Asteroid Info</b>" . PHP_EOL;
                echo "				</td>" . PHP_EOL;
                echo '			</tr>' . PHP_EOL;

                for($row = 0; $row < count($all_asteroids); $row++) {
                    echo "			<tr>" . PHP_EOL;
                    echo "				<td class='borderleft'>" . PHP_EOL;
                    echo "					" . $all_asteroids[$row]->get_name() . PHP_EOL;
                    echo "				</td>" . PHP_EOL;
                    echo "				<td class='border'>" . PHP_EOL;
                    echo "					" . $all_asteroids[$row]->get_id() . PHP_EOL;
                    echo "				</td>" . PHP_EOL;
                    echo "				<td class='border'>" . PHP_EOL;
                    echo "					" . round($all_asteroids[$row]->get_relativevelocityMPH(), 2) . PHP_EOL;
                    echo "				</td>" . PHP_EOL;
                    echo "				<td class='border'>" . PHP_EOL;
                    echo "					" . round($all_asteroids[$row]->get_missdistancemiles(), 2) . PHP_EOL;
                    echo "				</td>" . PHP_EOL;
                    echo "				<td class='border'>" . PHP_EOL;
                    echo "					<a href='" . $all_asteroids[$row]->get_selflink() . "'>" . "Nasa JPL page" . PHP_EOL;
                    echo "				</td>" . PHP_EOL;
                    echo "				<td class='borderlright'>" . PHP_EOL;
                    echo "					<a href='detail.php?id=" . $all_asteroids[$row]->get_id() . "'>" . "More Info" . PHP_EOL;
                    echo "				</td>" . PHP_EOL;
                    echo '			</tr>' . PHP_EOL;
                }
                echo '		</table>' . PHP_EOL;
                echo '  </form>' . PHP_EOL;
            }
            else {
                echo 'Password incorrect.' . PHP_EOL;
                echo "You need to <a href='login.php'>login</a> with the correct password." . PHP_EOL;
            }
        }
        else {
            echo "You need to <a href='login.php'>login</a> to access this page." . PHP_EOL;
        }
        ?> 
    </body>
</html>