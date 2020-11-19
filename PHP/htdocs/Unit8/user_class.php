<?php

// online shopping experience
/*
    entities:
    - User
    - Product
    - Cart

    each of them can be translated into a class
    
*/

class User {

    // properties/fields
    private $first_name;
    private $last_name;
    private $username;
  
    // constructor
    function __construct( $first_name, $last_name ) {

        $this->first_name = $first_name;
        $this->last_name = $last_name;
    
    }
    

    // methods

    // method that prints all the information related to a user
    function print_user_info(){
        echo "Firstname: " . $this->first_name . "<br>";
        echo "Lastname: " . $this->last_name . "<br>";
    }

    // method that sets the username
    function set_username( $username ) {

        $this->username = $this->username;

    }

    
    // method that retrieves a username
    function get_username(  ) {

        return $this->username;

    }
      
}

?>