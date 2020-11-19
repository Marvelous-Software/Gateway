
<!-- # 
John Maher
Gateway - Mobile Devices
Mirco Speretta
Assignment 6
10/10/2020
Exercise 1

    Write a PHP script that uses the appropriate super global variable to print
     the following: 

                the protocol used in the request
                the method used in the request 
                the IP address of the user

    (hint: use this documentation to find the correct elements of the array to 
    which you should refer)

 -->
<?php  

    $protocol = $_SERVER['SERVER_PROTOCOL'];
    $method = $_SERVER['REQUEST_METHOD'];
    $ip = $_SERVER['HTTP_X_FORWARDED_FOR'];
    $ip = $_SERVER['HTTP_CLIENT_IP'];
    $ip = $_SERVER['REMOTE_ADDR'];
    

    echo "Protocol - $protocol<br>";
    echo "Method - $method<br>";
    if(!empty($ip)){
        echo "IP - $ip";
    }
    
 ?> 