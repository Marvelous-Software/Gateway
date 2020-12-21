
<!-- # 
John Maher
Gateway - PHP
Mirco Speretta
Final
12/1/2020
-->

<?php

class Asteroid {

    // properties/fields.
    private $id;
    private $name;
    private $dateclosest;
    private $relativevelocityMPH;
    private $missdistancemiles;
    private $firstobservationdate;
    private $lastobservationdate;
    private $selflink;
  
    // constructor
    function __construct( $id, $name, $dateclosest, $relativevelocityMPH, $missdistancemiles, $selflink) {

        $this->id = $id;
        $this->name = $name;
        $this->dateclosest = $dateclosest;
        $this->relativevelocityMPH = $relativevelocityMPH;
        $this->missdistancemiles = $missdistancemiles;
        $this->selflink = $selflink;
        
    }
    

    // methods

    // method to retrieve the name
    function get_name(  ) {

        return $this->name;

    }

    // method to retrieve the id
    function get_id(  ) {

        return $this->id;

    }

    // method to retrieve the Close Approach Date
    function get_dateclosest(  ) {

        return $this->dateclosest;

    }

    // method to retrieve the Relative Velocity MPH
    function get_relativevelocityMPH(  ) {

        return $this->relativevelocityMPH;

    }

    // method to retrieve the Miss Distance Miles
    function get_missdistancemiles(  ) {

        return $this->missdistancemiles;

    }

    // method to retrieve a First Observation Date
    function get_firstobservationdate(  ) {

        return $this->firstobservationdate;

    }
    // method to set the First Observation Date
    function set_firstobservationdate( $firstobservationdate ) {

        $this->firstobservationdate = $firstobservationdate;

    }

    // method to retrieve a Last Observation Date
    function get_lastobservationdate(  ) {

        return $this->lastobservationdate;

    }
    // method to set the Last Observation Date
    function set_lastobservationdate( $lastobservationdate ) {

        $this->lastobservationdate = $lastobservationdate;

    }

    // method to retrieve a link for the api
    function get_selflink(  ) {

        return $this->selflink;

    }

}

?>